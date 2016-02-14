package com.xinqch.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.entity.UserEntity;
import com.xinqch.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-base.xml")
public class UserServiceImplTest {

	@Autowired
	private IUserService userService;
	
	@Test
	public void testLoad() throws Exception {
	}

	@Test
	public void testGet() throws Exception {
		 UserEntity user = userService.get("1");
		 System.out.println(user.getRealName());
	}

	@Test
	public void testFindAll() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testPersist() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSave() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSaveOrUpdate() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDelete() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testFlush() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
