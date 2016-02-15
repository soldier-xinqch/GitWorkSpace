package com.xinqch.common;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T,Return extends Serializable> {

	T load(Return id);
	
	T get(Return id);
	
	List<T> findAll();
	
	void persist(T entity);
	
	Return save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(Return id);
	
	void flush();
}
