package com.xinqch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinqch.entity.UserEntity;
import com.xinqch.service.IUserService;

@Controller
@RequestMapping("/smsh")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/index")
	public String index(){
		UserEntity user = userService.get("1");
		System.out.println(user.getRealName() + "into ··········");
		return "";
	}
}
