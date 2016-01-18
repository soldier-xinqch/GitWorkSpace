package com.xinqch.shiro.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.shiro.mapper.UrlFilterMapper;
import com.xinqch.shiro.model.UrlFilter;
import com.xinqch.shiro.service.UrlFilterService;
import com.xinqch.util.CommonUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class UrlFilterServiceImplTest {

	@Autowired
	private UrlFilterService urlFilterService;
	@Autowired
	private UrlFilterMapper urlFilterMapper;
	@Test
	public void testCreateUrlFilter() throws Exception {
		UrlFilter urlFilter = new UrlFilter();
		urlFilter.setFilterId(CommonUtil.getUUID());
		urlFilter.setFilterUrl("/into/loginIndex");
		urlFilter.setFilterShiroPermissions("anon");
		urlFilter.setDelFlag(false);
		urlFilter.setCreateTime(new Date());
		urlFilter.setCreateUser("soldier");
		urlFilterService.createUrlFilter(urlFilter);
	}

	@Test
	public void testModifyUrlFilter() throws Exception {
		UrlFilter urlFilter = urlFilterService.findUrlFilterById("");
		urlFilter.setModifyTime(new Date());
		urlFilter.setModifyUser("xinqch");
		urlFilterService.modifyUrlFilter(urlFilter);
	}

	@Test
	public void testDeleteUrlFilter() throws Exception {
		System.out.println(urlFilterService.deleteUrlFilter(""));
	}

	@Test
	public void testFindAddUrlFilters() throws Exception {
		List<UrlFilter> urlFilters = urlFilterService.findUrlFilters();
		for (UrlFilter urlFilter : urlFilters) {
			System.out.println(urlFilter.getFilterUrl());
		}
	}

	@Test
	public void testFindAllUrlFilters() throws Exception {
		Map<String,String> map = urlFilterService.findAllUrlFilters();
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

	@Test
	public void testFindUrlFilterById() throws Exception {
		System.out.println(urlFilterService.findUrlFilterById(""));
	}

}
