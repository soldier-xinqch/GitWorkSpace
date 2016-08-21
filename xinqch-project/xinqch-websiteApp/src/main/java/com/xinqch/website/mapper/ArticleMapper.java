package com.xinqch.website.mapper;

import com.xinqch.website.model.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Article record);

}