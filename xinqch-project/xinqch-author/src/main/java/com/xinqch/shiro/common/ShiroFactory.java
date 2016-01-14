package com.xinqch.shiro.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("shiroFilter")
public class ShiroFactory extends ShiroFilterFactoryBean{
	
	@Autowired
	private ShiroManager shiromanager;
	
	@Autowired
	private ShiroValidFilter shiroValidFilter;
	
	private String loginUrl;
	private	String successUrl;
	private	String unauthorizedUrl;
	
	public ShiroFactory() {
		super();
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
	
	private Map<String,String> tempUrlFilter(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("/into/loginIndex", "anon");
		map.put("/into/loginHome", "anon");
		map.put(" /into/**", "authc");
		return map;
	}
}

