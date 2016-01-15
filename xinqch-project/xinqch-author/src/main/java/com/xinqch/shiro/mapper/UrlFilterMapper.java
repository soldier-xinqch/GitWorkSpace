package com.xinqch.shiro.mapper;

import java.util.List;

import com.xinqch.common.CommonSqlMapper;
import com.xinqch.shiro.pojo.UrlFilter;

public interface UrlFilterMapper extends CommonSqlMapper {
    int deleteByPrimaryKey(String filterId);

    int insert(UrlFilter record);

    List<UrlFilter> selectByPrimaryKey(String filterId);

    int updateByPrimaryKey(UrlFilter record);
}