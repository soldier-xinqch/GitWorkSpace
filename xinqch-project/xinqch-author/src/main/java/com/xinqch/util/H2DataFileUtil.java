package com.xinqch.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import org.h2.tools.Console;
import org.h2.tools.Csv;
import org.h2.tools.RunScript;
import org.h2.tools.SimpleResultSet;

/**
 * H2 数据库的导入导出工具类
 * 
 * @author xinqch
 *
 */
public class H2DataFileUtil {
	
	/**
	 * 导入
	 */
	public void importSqlToH2DB(){
		try {
			new Console().runTool();   
			new RunScript().runTool("jdbc:h2:~/test", "sa","", "c:/schema.sql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从csv文件中读取数据
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ResultSet rs = new Csv().read("data/test.csv", null, null);
		ResultSetMetaData meta = rs.getMetaData();
		while (rs.next()) {
			for (int i = 0; i < meta.getColumnCount(); i++) {
				System.out.println(meta.getColumnLabel(i + 1) + ": "
						+ rs.getString(i + 1));
			}
			System.out.println();
		}
		rs.close();
	}

	/**
	 * 向csv文件中写入数据
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main1(String[] args) throws Exception {
		SimpleResultSet rs = new SimpleResultSet();
		rs.addColumn("NAME", Types.VARCHAR, 255, 0);
		rs.addColumn("EMAIL", Types.VARCHAR, 255, 0);
		rs.addRow("Bob Meier", "bob.meier@abcde.abc");
		rs.addRow("John Jones", "john.jones@abcde.abc");
		new Csv().write("data/test.csv", rs, null);
	}

}
