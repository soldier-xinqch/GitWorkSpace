package com.xinqch.mapper;

import com.xinqch.common.CommonSqlMapper;
import com.xinqch.model.CustomerUrl;

public interface CustomerUrlMapper extends CommonSqlMapper {
    int deleteByPrimaryKey(String urlId);

    int insert(CustomerUrl record);

    CustomerUrl selectByPrimaryKey(String urlId);

    int updateByPrimaryKey(CustomerUrl record);
}