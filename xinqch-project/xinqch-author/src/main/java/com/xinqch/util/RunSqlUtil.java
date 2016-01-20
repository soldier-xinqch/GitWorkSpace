package com.xinqch.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunSqlUtil {
	
	//TODO  这里加上日志模块的监听
	
	@Autowired
	private BasicDataSource dbcpDateSource;
	
	private Connection conn;
	
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
}
