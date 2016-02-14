package com.xinqch.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xinqch.dao.IUserDao;
import com.xinqch.entity.UserEntity;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public UserEntity load(String id) {
		return this.getCurrentSession().load(UserEntity.class, id);
	}

	@Override
	public UserEntity get(String id) {
		return this.getCurrentSession().get(UserEntity.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> findAll() {
		List<UserEntity> users = this.getCurrentSession().createQuery("from user").list();
		return users;
	}

	@Override
	public void persist(UserEntity entity) {
		this.getCurrentSession().persist(entity);
	}

	@Override
	public String save(UserEntity entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(UserEntity entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		UserEntity entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();
	}

}
