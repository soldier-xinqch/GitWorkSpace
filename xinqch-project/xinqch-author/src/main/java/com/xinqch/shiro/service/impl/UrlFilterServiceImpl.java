package com.xinqch.shiro.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.xinqch.shiro.mapper.UrlFilterMapper;
import com.xinqch.shiro.model.UrlFilter;
import com.xinqch.shiro.service.UrlFilterService;

@Service("urlFilterService")
public class UrlFilterServiceImpl implements UrlFilterService {

	@Autowired
	private UrlFilterMapper urlFilterMapper;
	
	@Override
	public int createUrlFilter(UrlFilter urlFilter) {
		return urlFilterMapper.insert(urlFilter);
	}

	@Override
	public int modifyUrlFilter(UrlFilter urlFilter) {
		return urlFilterMapper.updateByPrimaryKey(urlFilter);
	}

	@Override
	public int deleteUrlFilter(String urlFilterId) {
		List<UrlFilter> urlFilters = urlFilterMapper.selectByPrimaryKey(urlFilterId);
		return !CollectionUtils.isEmpty(urlFilters)&&urlFilters.size()>1?urlFilterMapper.updateByPrimaryKey(urlFilters.get(0)):null;
	}

	@Override
	public List<UrlFilter> findUrlFilters() {
		return urlFilterMapper.selectByPrimaryKey(null);
	}
	
	@Override
	public Map<String, String> findAllUrlFilters() {
		Map<String, String> map = new HashMap<String,String>();
		List<UrlFilter> urlFilters = urlFilterMapper.selectByPrimaryKey(null);
		if(!CollectionUtils.isEmpty(urlFilters)){
			for (UrlFilter urlFilter : urlFilters) {
				map.put(urlFilter.getFilterUrl(), urlFilter.getFilterShiroPermissions());
			}
		}
		return map;
	}
	@Override
	public String getAllUrlFilters() {
		String urlFilterStr = "";
		List<UrlFilter> urlFilters = urlFilterMapper.selectByPrimaryKey(null);
		if(!CollectionUtils.isEmpty(urlFilters)){
			for (UrlFilter urlFilter : urlFilters) {
				urlFilterStr += urlFilter.getFilterUrl()+"="+urlFilter.getFilterShiroPermissions()+"\n";
			}
		}
		return urlFilterStr;
	}
	
	@Override
	public UrlFilter findUrlFilterById(String urlFilterId) {
		List<UrlFilter> urlFilters = urlFilterMapper.selectByPrimaryKey(urlFilterId);
		return CollectionUtils.isEmpty(urlFilters)&&urlFilters.size()<1?null:urlFilters.get(0);
	}

}
