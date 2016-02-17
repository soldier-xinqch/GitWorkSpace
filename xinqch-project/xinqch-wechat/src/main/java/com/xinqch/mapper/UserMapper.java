package com.xinqch.mapper;

import com.xinqch.model.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKey(User record);
}