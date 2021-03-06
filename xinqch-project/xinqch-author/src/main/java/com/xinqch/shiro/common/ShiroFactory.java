package com.xinqch.shiro.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xinqch.shiro.service.UrlFilterService;
import com.xinqch.util.PropertiesUtils;

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
	
	@PostConstruct 
	public void setFactoryParams(){
		loginUrl = (String) PropertiesUtils.getPropertyParams("loginUrl");
		successUrl = (String) PropertiesUtils.getPropertyParams("successUrl");
		unauthorizedUrl= (String) PropertiesUtils.getPropertyParams("unauthorizedUrl");
		String urlFilters = urlFilterService.getAllUrlFilters();
		this.setLoginUrl(loginUrl);
		this.setSuccessUrl(successUrl);
		this.setUnauthorizedUrl(unauthorizedUrl);
		this.setSecurityManager(shiromanager);
		this.setFilterChainDefinitions(urlFilters);
		//url 拦截
		Map<String,Filter> filterMap = new HashMap<String,Filter>();
		filterMap.put("loginFilter", shiroValidFilter);
		this.setFilters(filterMap);
	}
	
}