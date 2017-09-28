package com.hk.mapper;

import java.util.List;

import com.hk.bean.User;


/***
 * 
 * @author Administrator
 *	这个接口的功能就是UserDao的功能
 *
 *
 *
 * mybatis mapper开发规范，程序员只须编写接口，不需要做实现，mybaits自动去做实现
 */
public interface UserMapper {
	
	public User queryUserById(int id);

	public List<User> queryUsers();

	public void deleteUserById(int i);

	public void modifyUser(User user);

}
