package com.xinqch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xinqch.mapper.UserMapper;
import com.xinqch.model.User;
import com.xinqch.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
}
