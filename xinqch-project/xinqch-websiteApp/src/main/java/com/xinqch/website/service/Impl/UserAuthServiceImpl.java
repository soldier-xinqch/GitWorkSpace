package com.xinqch.website.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqch.website.mapper.UserAuthMapper;
import com.xinqch.website.model.UserAuth;
import com.xinqch.website.service.IUserAuthService;

@Service("userAuthService")
public class UserAuthServiceImpl implements IUserAuthService {
	

	@Autowired
	private UserAuthMapper userAuthMapper;
	
	@Override
	public List<UserAuth> findUserAuth() {
		return userAuthMapper.findUserAuths();
	}

}
