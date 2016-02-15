package com.xinqch.service;

import java.util.List;

import com.xinqch.entity.UserEntity;

public interface IUserService {

	UserEntity load(String id);

	UserEntity get(String id);

	List<UserEntity> findAll();

	void persist(UserEntity entity);

	Integer save(UserEntity entity);

	void saveOrUpdate(UserEntity entity);

	void delete(String id);

	void flush();
}