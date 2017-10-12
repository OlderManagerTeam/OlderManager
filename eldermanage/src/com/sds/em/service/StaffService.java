package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Role;
import com.sds.em.po.Staffbase;

public interface StaffService {
	public Message checkStaffName(String staffTel);
	public Message returnSecurities();
	public Message signIn(Staffbase staff);
	
	public Message login(String staffTel,String staffPassword);//��¼�ж�����
	public Role returnRole(int staffId);//���ؽ�ɫ
}
