package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.QuestionMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.QuestionExample;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.service.StaffService;

public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffbaseMapper staffbaseMapper;
	@Autowired
	QuestionMapper questionMapper;
	Message m;

	@Override
	public Message checkStaffName(String staffTel) {// 验证员工电话号码是否可用

		try {
			StaffbaseExample sexample = new StaffbaseExample();
			Criteria scriteria = sexample.createCriteria();
			scriteria.andStafftelEqualTo(staffTel);
			if (staffbaseMapper.selectByExample(sexample).isEmpty())
				return m = new Message(true, "可用手机号码", null);
			return m = new Message(false, "号码已注册", null);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return m = new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message returnSecurities() {// 返回所有问题列表
		try {
			QuestionExample qExample = new QuestionExample();
			com.sds.em.po.QuestionExample.Criteria qCriteria = qExample.createCriteria();
			qCriteria.andQuestioncontentIsNotNull();
			List l=questionMapper.selectByExample(qExample);
			if (l.isEmpty())
				return  new Message(false, "无可用记录", null);
			return new Message(true, "返回成功", l);
		} catch (
		Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return m = new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message signIn(Staffbase staff) {
		// TODO 自动生成的方法存根
		return null;
	}
}
