package com.xinqch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqch.mapper.UserMapper;
import com.xinqch.model.User;
import com.xinqch.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(String userIds) {
		return userMapper.selectByPrimaryKey(userIds);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteUser(User user) {
		user.setDelflag(true);
		return  userMapper.updateByPrimaryKey(user);
	}
	
	/**
	 *  物理删除用户
	 * @param userId
	 * @return
	 */
	public int deleteUser(String userId){
		return userMapper.deleteByPrimaryKey(userId);
	}

}
