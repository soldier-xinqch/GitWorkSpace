package com.xinqch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xinqch.Enum.CommonEnum;

@Controller
@RequestMapping("/into")
public class IndexController {
	
	@RequestMapping(value = "/loginIndex", method = RequestMethod.GET)  
	public String toIndexPage(HttpServletResponse resp){
		return "/login/login";
	}
	
	@RequestMapping(value = "/loginHome", method = RequestMethod.POST)  
	public String toHomePage(HttpServletRequest req,HttpServletResponse resp){
		String loginStatus = req.getParameter("loginStatus");
		String loginPasswd = req.getParameter("loginPasswd");
		String loginName = req.getParameter("loginName");
		
		System.out.println(loginPasswd+"##"+loginName+"##"+loginStatus);
		//验证登录用户
		UsernamePasswordToken token = new UsernamePasswordToken(loginName,loginPasswd);
		SecurityUtils.getSubject().login(token);  
		
		if(CommonEnum.SYSTEM_ENUM.LOGIN.getValue().equals(loginStatus)){
			System.out.println("登录");
		}else if(CommonEnum.SYSTEM_ENUM.REGISTERED.getValue().equals(loginStatus)){
			System.out.println("注册");
		}
		return "redirect:/into/logIn/homePage";  
	}
}
