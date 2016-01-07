package com.xinqch.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet1 extends HttpServlet {

	private static final long serialVersionUID = -1114863131209012408L;

	public void doGet(HttpServletRequest req,HttpServletResponse resp){
		resp.setContentType("text/html;charset=GB2312");
		PrintWriter out;
		try {
			out = resp.getWriter();
			out.println(" 您好！");
			out.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		doGet(req, resp);
	}
}
