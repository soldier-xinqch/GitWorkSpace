package com.xinqch.mapper;

import com.xinqch.model.Mail;

public interface MailMapper {
	
    int deleteByPrimaryKey(String mailId);

    int insert(Mail record);

    Mail selectByPrimaryKey(String mailId);

    int updateByPrimaryKey(Mail record);
}