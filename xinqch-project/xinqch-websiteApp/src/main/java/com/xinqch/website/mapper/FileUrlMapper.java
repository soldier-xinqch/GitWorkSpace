package com.xinqch.website.mapper;

import com.xinqch.website.model.FileUrl;

public interface FileUrlMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(FileUrl record);

    FileUrl selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FileUrl record);

}