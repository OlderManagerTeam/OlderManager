package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Staffbase;

public interface StaffService {
	public Message checkStaffName(String staffTel);
	public Message returnSecurities();
	public Message signIn(Staffbase staff);
}
