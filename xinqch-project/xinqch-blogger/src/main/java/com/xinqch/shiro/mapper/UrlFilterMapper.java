package com.xinqch.shiro.mapper;

import com.xinqch.shiro.model.UrlFilter;

public interface UrlFilterMapper {
    int deleteByPrimaryKey(String filterId);

    int insert(UrlFilter record);

    int insertSelective(UrlFilter record);

    UrlFilter selectByPrimaryKey(String filterId);

    int updateByPrimaryKeySelective(UrlFilter record);

    int updateByPrimaryKey(UrlFilter record);
}