package com.xinqch.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class RunSqlUtilTest {
	
	@Autowired
	private RunSqlUtil runSqlUtil;

	@Test
	public void testExecuteSqls() throws Exception {
		runSqlUtil.executeSqls("create table user_test(user_id varchar(32))");
	}

	@Test
	public void testExecuteSqlWithResult() throws Exception {
		System.out.println(runSqlUtil.executeSqlWithResult("select getdate()"));
	}

}
