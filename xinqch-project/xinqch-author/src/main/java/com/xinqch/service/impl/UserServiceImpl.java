package com.xinqch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqch.mapper.UserMapper;
import com.xinqch.model.User;
import com.xinqch.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public User loginValid(String userName, String passWord) {
		return userMapper.loginValid(userName, passWord);
	}
	
}
