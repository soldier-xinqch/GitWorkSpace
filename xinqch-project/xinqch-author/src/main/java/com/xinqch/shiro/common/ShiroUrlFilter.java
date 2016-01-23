package com.xinqch.shiro.common;

import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class ShiroUrlFilter {

	@Autowired 
	private DefaultFilterChainManager filterChainManager;
	
	public void registerNewUrlFilter(){
		//1、首先删除以前老的filter chain并注册默认的  
		filterChainManager.getFilterChains().clear(); 
		
//		if(defaultFilterChains != null) {  
//			filterChainManager.getFilterChains().putAll(defaultFilterChains);  
//		}  
//		 //2、循环URL Filter 注册filter chain 
//		 for (UrlFilter urlFilter : urlFilters) {  
//			 String url = urlFilter.getUrl();
//			//注册roles filter 
//			 if (!StringUtils.isEmpty(urlFilter.getRoles())) {  
//				 filterChainManager.addToChain(url, "roles", urlFilter.getRoles());  
//			 }  
//			 //注册perms filter  
//			 if (!StringUtils.isEmpty(urlFilter.getPermissions())) {  
//				 filterChainManager.addToChain(url, "perms", urlFilter.getPermissions());  
//			 }  
//		 }
	}
}
