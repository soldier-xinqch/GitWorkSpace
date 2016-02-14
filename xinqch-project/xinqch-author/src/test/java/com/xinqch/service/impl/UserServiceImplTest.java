package com.xinqch.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class UserServiceImplTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testGetUserById() throws Exception {
		System.out.println(userMapper.selectByPrimaryKey("1"));
	}
}