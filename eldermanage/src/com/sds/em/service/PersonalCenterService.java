package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Staffbase;

public interface PersonalCenterService {
	// 查看个人信息
	public Message personalMessage(int staffid) throws Exception;

	// 修改个人信息
	public Message updatePersonalMessage(Staffbase staffbase) throws Exception;

}
