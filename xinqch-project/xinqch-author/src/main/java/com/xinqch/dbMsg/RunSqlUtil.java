package com.xinqch.dbMsg;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RunSqlUtil {
	
	//TODO  这里加上日志模块的监听
	
	@Autowired
	private BasicDataSource dbcpDateSource;
	
	private Connection conn;
	
	private final String tableName = "%";
	
	private final String columnNames = "%";
	
	
	/**
	 * 获取数据库连接
	 */
	private void getConnection(){
		try {
			if(null != dbcpDateSource){
				this.conn=dbcpDateSource.getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 *  关闭连接
	 */
	private void CloseConnection(){
		try {
			conn.close();
			conn =null;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 *  执行sql语句
	 *  可用于执行任何SQL语句，返回一个boolean值，表明执行该SQL语句是否返回了ResultSet。
	 *  如果执行后第一个结果是ResultSet，则返回true，否则返回false。
	 * @param sqlStr
	 * @return
	 */
	public void executeSqls(String sqlStr){
		try {
			if(null == conn){
				getConnection();
			}
			this.conn.prepareStatement(sqlStr).execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.CloseConnection();
		}
	}
	/**
	 *  执行带有返回值的sql语句
	 * @param sqlStr
	 * @return
	 */
	public ResultSet executeSqlWithResult(String sqlStr){
		ResultSet result = null;
		try {
			if(null == conn){
				getConnection();
			}
			PreparedStatement statement = conn.prepareStatement(sqlStr);
			result = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				result.close();
				this.CloseConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	/**
	 * 其中"%"就是表示*的意思，也就是任意所有的意思。其中m_TableName就是要获取的数据表的名字，
	 * 如果想获取所有的表的名字，就可以使用"%"来作为参数了。
	 */
	public List<Object> getTables(String tableName,boolean columnFlag){
		List<Object> list = new ArrayList<Object>();
		try {
			if(null == conn){
				getConnection();
			}
			tableName = StringUtils.isEmpty(tableName)?this.tableName:tableName;
			DatabaseMetaData result = conn.getMetaData();
			//TODO 调研 这里table传入的是一个数组是否可以传入其他值获取更多数据库属性信息
			ResultSet dbResult = result.getTables(null, "%",tableName,new String[]{"TABLE"});
			while(dbResult.next()){
				if(!StringUtils.isEmpty(dbResult.getString("TABLE_NAME"))){
					if(columnFlag){
						//这里默认获取所有列信息
						list.add(this.getTableColumns(dbResult.getString("TABLE_NAME"), columnNames));
					}else{
						list.add(dbResult.getString("TABLE_NAME"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 *  根据表名和列名获取数据表信息
	 *  若不填则默认获取所有
	 * @param tableName
	 * @param columnNames
	 * @return
	 */
	public List<TableModel> getTableColumns(String tableName,String columnNames){
		List<TableModel> list = new ArrayList<TableModel>();
		try {
			if(null == conn){
				getConnection();
			}
			tableName = StringUtils.isEmpty(tableName)?this.tableName:tableName;
			columnNames = StringUtils.isEmpty(columnNames)?this.columnNames:columnNames;
			DatabaseMetaData result = conn.getMetaData();
			ResultSet tableResult = result.getColumns(null, "%", tableName, columnNames);
			while(tableResult.next()){
				TableModel table = new TableModel();
				table.setTableName(tableResult.getString("TABLE_NAME"));
				table.setTableColumnName(tableResult.getString("COLUMN_NAME"));
				table.setTableColumnType(tableResult.getString("TYPE_NAME"));
				table.setTableColumnSize(tableResult.getInt("COLUMN_SIZE"));
				table.setTableDigits(tableResult.getInt("DECIMAL_DIGITS"));
				table.setNullable(tableResult.getInt("NULLABLE"));
				list.add(table);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
