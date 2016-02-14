package com.xinqch.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = -1114863131209012408L;

	public void doGet(HttpServletRequest req,HttpServletResponse resp){
		try {
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html; charset=utf-8");   
			resp.setCharacterEncoding("utf-8");
			resp.setHeader("testName", "白杨傻屌");
			req.setAttribute("testReqName", "baiyang");
			resp.sendRedirect("testServlet1");
			return ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp){
		
	}
}
