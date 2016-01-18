package com.xinqch;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.mapper.UserMapper;
import com.xinqch.shiro.mapper.UrlFilterMapper;
import com.xinqch.shiro.model.UrlFilter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class TestMybatis {
	
	@Autowired
	private UrlFilterMapper mapper;
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testUser(){
		System.out.println(userMapper.selectByPrimaryKey("1"));
	}
	
	
	@Test
	public void test1(){
		UrlFilter urlFilter = new UrlFilter();
		urlFilter.setFilterId("123123123122");
		urlFilter.setFilterUrl("/into/loginIndex");
		urlFilter.setFilterShiroPermissions("anon");
		urlFilter.setDelFlag(false);
		urlFilter.setCreateTime(new Date());
		urlFilter.setCreateUser("soldier");
		mapper.insert(urlFilter);
	}

}
