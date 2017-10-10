package com.sds.em.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.service.StaffService;

public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffbaseMapper staffbaseMapper;
	Message m;
	@Override
	public Message checkStaffName(String staffTel) {
		StaffbaseExample sexample = new StaffbaseExample();
		Criteria scriteria = sexample.createCriteria();
		scriteria.andStafftelEqualTo(staffTel);
		if (staffbaseMapper.selectByExample(sexample).isEmpty())
			return m=new Message(true,"可用手机号码",null);
		return m=new Message(false,"号码已注册",null);
	}

}
