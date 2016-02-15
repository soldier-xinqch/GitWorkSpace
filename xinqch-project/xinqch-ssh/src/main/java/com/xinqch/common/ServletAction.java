package com.xinqch.common;

import org.springframework.stereotype.Controller;

/**
 * 因为Struts2是只能通过上边的转发器（FilterDispatcher）转发请求的，因此必须创建一个Action类，作为中间的跳板来转发请求
 * @author xinqch
 *
 */
@Controller("servletAction")
public class ServletAction{

	/**
	 *  转发servlet
	 *   转发后在result中写入正确的servlet地址
	 * @return
	 */
	public String relayServlet(){
		System.out.println("转发servlet地址action");
		return "success";
	}
}
