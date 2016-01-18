package com.xinqch.shiro.mapper;

import java.util.List;

import com.xinqch.shiro.model.UrlFilter;

public interface UrlFilterMapper {
    int deleteByPrimaryKey(String filterId);

    int insert(UrlFilter record);

    int insertSelective(UrlFilter record);

    List<UrlFilter> selectByPrimaryKey(String filterId);

    int updateByPrimaryKeySelective(UrlFilter record);

    int updateByPrimaryKey(UrlFilter record);
}