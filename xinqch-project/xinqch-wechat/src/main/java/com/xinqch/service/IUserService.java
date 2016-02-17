package com.xinqch.service;

import com.xinqch.model.User;

/**
 *  用户业务接口
 * @author xinqch
 *
 */
public interface IUserService {

	/**
	 *  根据id查询用户
	 * @param userIds
	 * @return
	 */
	public User getUserById(String userIds);
	/**
	 *  新增用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	/**
	 *  修改用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	/**
	 *  逻辑删除用户
	 * @param user
	 * @return
	 */
	public int deleteUser(User user);
}
