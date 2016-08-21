package com.xinqch.website.service.Impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.website.model.UserAuth;
import com.xinqch.website.service.IUserAuthService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class UserAuthServiceImplTest {
	
	@Autowired
	private IUserAuthService userAuthService;
	
	@Test
	public void testUserAuthSelect(){
		
		List<UserAuth> userAuths =  userAuthService.findUserAuth();
		System.out.println(userAuths.indexOf(0));
		
	}

}
