package com.xinqch.website.mapper;

import java.util.List;

import com.xinqch.website.model.UserAuth;

public interface UserAuthMapper {
	
    int deleteByPrimaryKey(String id);

    int insertSelective(UserAuth record);

    UserAuth selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserAuth record);
    
    List<UserAuth> findUserAuths();

}