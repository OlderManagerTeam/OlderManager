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
	public Message checkStaffName(String staffTel) {// ��֤Ա���绰�����Ƿ����

		try {
			StaffbaseExample sexample = new StaffbaseExample();
			Criteria scriteria = sexample.createCriteria();
			scriteria.andStafftelEqualTo(staffTel);
			if (staffbaseMapper.selectByExample(sexample).isEmpty())
				return m = new Message(true, "�����ֻ�����", null);
			return m = new Message(false, "������ע��", null);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return m = new Message(false, "���ݿ����", null);
		}

	}

	@Override
	public Message returnSecurities() {// �������������б�
		try {
			QuestionExample qExample = new QuestionExample();
			com.sds.em.po.QuestionExample.Criteria qCriteria = qExample.createCriteria();
			qCriteria.andQuestioncontentIsNotNull();
			List l=questionMapper.selectByExample(qExample);
			if (l.isEmpty())
				return  new Message(false, "�޿��ü�¼", null);
			return new Message(true, "���سɹ�", l);
		} catch (
		Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return m = new Message(false, "���ݿ����", null);
		}
	}

	@Override
	public Message signIn(Staffbase staff) {
		// TODO �Զ����ɵķ������
		return null;
	}
}
