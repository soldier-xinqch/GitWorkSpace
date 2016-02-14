package com.xinqch.mapper;

import org.apache.ibatis.annotations.Param;

import com.xinqch.common.CommonSqlMapper;
import com.xinqch.model.User;

public interface UserMapper extends CommonSqlMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
    
    User loginValid(@Param("userName") String userName,@Param("passWord") String passWord);
}