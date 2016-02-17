package com.xinqch.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class UserServiceImplTest {

	@Autowired
	private IUserService userService;
	@Test
	public void testGetUserById() throws Exception {
		System.out.println(userService.getUserById("1"));
	}

	@Test
	public void testInsertUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testUpdateUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteUserUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteUserString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
