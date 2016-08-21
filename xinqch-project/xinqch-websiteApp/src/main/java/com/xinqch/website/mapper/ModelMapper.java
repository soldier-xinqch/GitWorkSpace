package com.xinqch.website.mapper;

import com.xinqch.website.model.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(Model record);

    Model selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Model record);

}