package com.xinqch.shiro.service;

import java.util.List;
import java.util.Map;

import com.xinqch.shiro.model.UrlFilter;

public interface UrlFilterService {
	
	public int createUrlFilter(UrlFilter urlFilter);
	
	public int modifyUrlFilter(UrlFilter urlFilter);
	
	public int deleteUrlFilter(String urlFilterId);
	
	public List<UrlFilter> findUrlFilters();
	
	public UrlFilter findUrlFilterById(String urlFilterId);
	
	public Map<String,String> findAllUrlFilters();
}
