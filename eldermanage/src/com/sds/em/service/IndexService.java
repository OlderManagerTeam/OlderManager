package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Role;
import com.sds.em.po.Staffbase;

public interface IndexService {
	// bo:10-12
	public Message checkStaffName(String staffTel);

	public Message returnSecurities();

	public Message signIn(Staffbase staff);

	public Message login(String staffTel, String staffPassword);// ��¼�ж�����

	public Role returnRole(int staffId);// ���ؽ�ɫ
	// yan:10-13

	public Message returnQuestion(String staffTel);
	
	//lu:10-14
	//У���ܱ������
	public Message checkSecurity(String securityAnswer,int staffId);

/*	//�޸�����
	
	public Message modifyPassword(String staffPassword,int staffId);*/
}
