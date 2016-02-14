package com.xinqch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("example")
public class ExampleController {

	@RequestMapping("index")
	public String indexExample(){
		
		return "/example/example";
	}
}
