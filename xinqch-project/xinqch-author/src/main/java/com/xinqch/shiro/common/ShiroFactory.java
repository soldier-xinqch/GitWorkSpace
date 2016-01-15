package com.xinqch.shiro.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xinqch.shiro.service.UrlFilterService;

@Component("shiroFilter")
public class ShiroFactory extends ShiroFilterFactoryBean{
	
	@Autowired
	private ShiroManager shiromanager;
	@Autowired
	private UrlFilterService urlFilterService;
	
	@Autowired
	private ShiroValidFilter shiroValidFilter;
	
	private String loginUrl;
	private	String successUrl;
	private	String unauthorizedUrl;
	
	private Map<String,String> tempUrlFilter(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("/into/loginIndex", "anon");
		map.put("/into/loginHome", "anon");
		map.put("/into/**", "authc");
		return map;
	}
	
	@PostConstruct 
	public void setFactoryParams(){
		loginUrl = "/";
		successUrl = "/into/loginHome";
		
		
		this.setSecurityManager(shiromanager);
		this.setLoginUrl(loginUrl);
		this.setSuccessUrl(successUrl);
		this.setUnauthorizedUrl(unauthorizedUrl);
		this.setFilterChainDefinitionMap(tempUrlFilter());
		//url 拦截
		Map<String,Filter> filterMap = new HashMap<String,Filter>();
		filterMap.put("loginFilter", shiroValidFilter);
		this.setFilters(filterMap);
	}
	
}

