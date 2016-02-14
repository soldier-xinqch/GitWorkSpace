package com.xinqch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqch.dao.IUserDao;
import com.xinqch.entity.UserEntity;
import com.xinqch.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserEntity load(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity get(String id) {
		return userDao.get(id);
	}

	@Override
	public List<UserEntity> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer save(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

}
