package com.sds.em.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.service.BrenchService;

public class BrenchServiceImpl implements BrenchService {
	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Autowired
	OldersickMapper oldersickMapper;

	/*@Autowired
	ActionMapper actionMapper;
<<<<<<< HEAD
*/
=======
	
	

>>>>>>> 5a86b154791750598dd747b659fe5cf6b14193ce
	@Override
	public Message addElderInfo(Olderbase olderbase) throws Exception {
		try {
			olderbaseMapper.insertOlderBase(olderbase);
			if (olderbase.getOlderid() != null) {
				return new Message(true, "������Ϣ¼��ɹ�", olderbase.getOlderid());
			} else {
				return new Message(false, "������Ϣ¼��ʧ��", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "���ݿ����", null);
		}
	}

	@Override
	public Message addSicks(int sickOlderId, Oldersick oldersick) {
		try {
			oldersick.setSickolderid(sickOlderId);
			oldersickMapper.insertOlderSick(oldersick);
			if (oldersick.getSickid() != null) {
				return new Message(true, "������Ϣ¼��ɹ�", oldersick.getSickid());
			} else {
				return new Message(false, "������Ϣ¼��ʧ��", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "���ݿ����", null);
		}
	}

	@Override
	public Message modifyOlder(Olderbase olderbase) {
		try {
			int flag = 0;
			flag = olderbaseMapper.updateByPrimaryKeySelective(olderbase);
			if (flag != 0) {
				return new Message(true, "������Ϣ�޸ĳɹ�", null);
			} else {
				return new Message(false, "���ݿ����", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "���ݿ����", null);
		}

	}

	@Override
	public Message olderRate(int olderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
/*
	@Override
	public Message publishAction(Action action) throws Exception {
		try {
			int flag = 0;
			flag = actionMapper.insert(action);
			if (flag != 0) {
				return new Message(true, "�����ɹ�", null);
			} else {
				return new Message(false, "���ݿ����", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "���ݿ����", null);
		}
	}

	@Override
	public Message modifyAction(Action action) throws Exception {
		try {
			int flag = 0;
			flag = actionMapper.updateByPrimaryKeySelective(action);
			if (flag != 0) {
				return new Message(true, "�޸ĳɹ�", null);
			} else {
				return new Message(false, "���ݿ����", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "���ݿ����", null);
		}
	}*/
}