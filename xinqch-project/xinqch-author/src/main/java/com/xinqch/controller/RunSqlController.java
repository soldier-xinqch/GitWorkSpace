package com.xinqch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinqch.util.RunSqlUtil;

@Controller
@RequestMapping("sql")
public class RunSqlController {

	@Autowired
	private RunSqlUtil runSqlUtil;
	
	@RequestMapping("sqlIndex")
	public String runSqlIndex(){
		return "";
	}
	
	@RequestMapping("runSql")
	public String runSqlExecute(){
		
		runSqlUtil.executeSqls("");
		return "";
	}
	
}
