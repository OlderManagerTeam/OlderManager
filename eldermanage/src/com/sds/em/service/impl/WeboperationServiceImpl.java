package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ShiroroleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.ShiroroleExample;
import com.sds.em.po.ShiroroleKey;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.service.WeboperationService;

public class WeboperationServiceImpl implements WeboperationService {
	@Autowired
	ShiroroleMapper shiroroleMapper;
	ShiroroleExample shiroroleExample = new ShiroroleExample();
	ShiroroleExample.Criteria shiroroleCriteria;

	@Autowired
	StaffbaseMapper staffbaseMapper;
	StaffbaseExample staffbaseExample = new StaffbaseExample();
	StaffbaseExample.Criteria staffbaseCriteria;
	@Override
	// 返回所有权限
	public Message getauthorization() {
		try {
			shiroroleExample.clear();
			return new Message(true, "返回成功", shiroroleMapper.getroles());
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return new Message(false, "返回失败", null);
		}
	}

	@Override
	// 为某人非配权限
	public Message addpersonauthorization(String stafftel, String authorization) {
		try {
			ShiroroleKey record = new ShiroroleKey();
			record.setShirorole(authorization);
			record.setShirotel(stafftel);
			shiroroleMapper.insert(record);
			return new Message(true, "添加成功", null);
		} catch (

		Exception e) {
			e.printStackTrace();
			return new Message(false, "添加失败", null);
		}
	}

	@Override
	//删除某人的某项权限
	public Message delpersonauthorization(String stafftel, String authorization) {
		try {
			ShiroroleKey record = new ShiroroleKey();
			record.setShirorole(authorization);
			record.setShirotel(stafftel);
			shiroroleMapper.deleteByPrimaryKey(record);
			return new Message(true, "删除成功", null);
		} catch (

		Exception e) {
			e.printStackTrace();
			return new Message(false, "删除失败", null);
		}
	}

	@Override
	//获取员工姓名
	public Message staffname(String stafftel) {
		staffbaseExample.clear();
		staffbaseCriteria=staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(stafftel);
		List<Staffbase> list=staffbaseMapper.selectByExample(staffbaseExample);
		if(!list.isEmpty())
			return new Message(true, "返回成功", list.get(0));
		return new Message(false, "返回失败", null);
	}
}
