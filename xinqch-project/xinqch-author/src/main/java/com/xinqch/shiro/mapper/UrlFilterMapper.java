package com.xinqch.shiro.mapper;

import java.util.List;

import com.xinqch.shiro.model.UrlFilter;

public interface UrlFilterMapper {
    int deleteByPrimaryKey(String filterId);

    int insert(UrlFilter record);

    List<UrlFilter> selectByPrimaryKey(String filterId);

    int updateByPrimaryKey(UrlFilter record);
}