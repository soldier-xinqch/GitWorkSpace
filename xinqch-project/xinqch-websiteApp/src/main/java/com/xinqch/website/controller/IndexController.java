package com.xinqch.website.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinqch.website.model.UserAuth;
import com.xinqch.website.service.IUserAuthService;

@Controller
@RequestMapping("page")
public class IndexController {
	
	@Autowired
	private IUserAuthService userAuthService;
	
	@RequestMapping("/indexPage")
	public String indexPage(HttpServletRequest request,HttpServletResponse response){
		List<UserAuth> s = userAuthService.findUserAuth();
		request.setAttribute("user", s);
		return "/index/company_index";
	}
	
	

}
