package com.hk.mapper;

import java.util.List;

import com.hk.bean.User;


/***
 * 
 * @author Administrator
 *	����ӿڵĹ��ܾ���UserDao�Ĺ���
 *
 *
 *
 * mybatis mapper�����淶������Աֻ���д�ӿڣ�����Ҫ��ʵ�֣�mybaits�Զ�ȥ��ʵ��
 */
public interface UserMapper {
	
	public User queryUserById(int id);

	public List<User> queryUsers();

	public void deleteUserById(int i);

	public void modifyUser(User user);

}
