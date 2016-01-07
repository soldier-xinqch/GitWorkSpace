package com.xinqch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xinqch.Enum.CommonEnum;

@Controller
@RequestMapping("/into")
public class IndexController {
	
	
	
	@RequestMapping(value = "/LoginIndex", method = RequestMethod.GET)  
	public String toIndexPage(){
		return "/login/login";
	}
	
	@RequestMapping(value = "/loginHome", method = RequestMethod.POST)  
	public String toHomePage(HttpServletRequest req,HttpServletResponse resp){
		String loginStatus = req.getParameter("loginStatus");
		if(CommonEnum.SYSTEM_ENUM.LOGIN.getValue().equals(loginStatus)){
			System.out.println("登录");
		}else if(CommonEnum.SYSTEM_ENUM.REGISTERED.getValue().equals(loginStatus)){
			System.out.println("注册");
		}
		return "/logIn/homePage";
	}
}
