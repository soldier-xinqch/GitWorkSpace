package com.xinqch.dbMsg;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.dbMsg.RunSqlUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class RunSqlUtilTest {
	
	@Autowired
	private RunSqlUtil runSqlUtil;

	@Test
	public void testExecuteSqls() throws Exception {
		runSqlUtil.executeSqls("show tables");
	}

	@Test
	public void testExecuteSqlWithResult() throws Exception {
		ResultSet result = runSqlUtil.executeSqlWithResult("show tables");
		System.out.println(result);
//		while(result.next()){
//			System.out.println("======="+result.get));
//			System.out.println("======="+result.getString(2));
//	   }
	}
	
	
	@Test
	public void testGetTables() throws Exception {
		List<Object> result = runSqlUtil.getTables(null, false);
		for (Object object : result) {
			System.out.println(object);
		}
	}
	
	@Test
	public void testGetTableColumns() throws Exception {
		List<TableModel> result = runSqlUtil.getTableColumns(null, null);
		for (TableModel tables : result) {
			System.out.println(tables.toString());
		}

	}

}
