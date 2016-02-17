package com.xinqch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/weChat")
public class UserController {
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(){
		System.out.println("into ......................"); 
		return "/login/index";
	}
	

}
