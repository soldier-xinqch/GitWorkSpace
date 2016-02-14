package com.xinqch.service;

import com.xinqch.model.User;

public interface UserService {

	public User getUserById(String userId);
	
	public User loginValid(String userName,String passWord);
}
