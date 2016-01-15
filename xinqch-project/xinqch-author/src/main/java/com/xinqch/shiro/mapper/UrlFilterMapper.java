package com.xinqch.shiro.mapper;

import com.xinqch.shiro.pojo.UrlFilter;

public interface UrlFilterMapper {
    int deleteByPrimaryKey(String urlId);

    int insert(UrlFilter record);

    int insertSelective(UrlFilter record);

    UrlFilter selectByPrimaryKey(String urlId);

    int updateByPrimaryKeySelective(UrlFilter record);

    int updateByPrimaryKey(UrlFilter record);
}