package com.hk.service;

import java.util.List;

import com.hk.bean.User;

public interface UserService {
	public User queryUserById(int id);

	public List<User> queryAllUsers();

	public void deleteUserById(int i);

	public void modifyUser(User user);
}
