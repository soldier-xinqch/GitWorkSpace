package com.xinqch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinqch.util.RestUtils;


@Controller
@RequestMapping("/index")
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);  
	
	private final String appid = "wx0c34b287aa04b15a";
	private final String appsecret = "543f4a8de564bfb171dc70764ddf5b3f";
	
	@RequestMapping(value="getAccessToken",method=RequestMethod.GET)
	@ResponseBody
	public String getAccessToken(){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+appsecret;
		try {
			String returnStr = RestUtils.getJsonString(url);
			if(StringUtils.isEmpty(returnStr)&& " ".equals(returnStr)){
				logger.info("获取accessToken失败");
				return "获取accessToken失败！";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
