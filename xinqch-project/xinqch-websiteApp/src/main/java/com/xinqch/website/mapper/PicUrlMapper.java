package com.xinqch.website.mapper;

import com.xinqch.website.model.PicUrl;

public interface PicUrlMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(PicUrl record);

    PicUrl selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PicUrl record);

}