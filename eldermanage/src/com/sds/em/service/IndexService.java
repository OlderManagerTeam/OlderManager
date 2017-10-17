package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Role;
import com.sds.em.po.Staffbase;

public interface IndexService {
	// bo:10-12
	public Message checkStaffName(String staffTel);

	public Message returnSecurities();

	public Message signIn(Staffbase staff);

	public Message login(String staffTel, String staffPassword);// 登录判断密码

	// yan:10-13

	public Message returnQuestion(String staffTel);

	// lu:10-14
	// 校验密保问题答案
	public Message checkSecurity(String securityAnswer, int staffId);

	// 修改密码

	public Message modifyPassword(String staffPassword, int staffId);

	// 返回所有的部门

	public Message allDepartments();
	
	//返回当前部门所有职位
	
	public Message allRoles(int departmentId);
	//新闻列表查询
	public Message allNews();
}
