package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

import com.hk.bean.User;
import com.hk.mapper.UserMapper;

public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public User queryUserById(int id){
		return userMapper.queryUserById(id);
	}
	@Override
	public List<User> queryAllUsers() {
		
		return userMapper.queryUsers();
	}
	@Override
	public void deleteUserById(int i) {
		
		userMapper.deleteUserById(i);
	}
	@Override
	public void modifyUser(User user) {
		userMapper.modifyUser(user);
	}
}
