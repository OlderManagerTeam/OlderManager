package com.sds.em.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.service.BranchManageService;

public class BranchManageServiceImpl implements BranchManageService {
	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Autowired
	OldersickMapper oldersickMapper;

	@Override
	public Message BaseEnter(Olderbase olderbase) throws Exception {
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
	public Message SickEnter(int olderId, Oldersick oldersick) {
		try {
			oldersick.setSickolderid(olderId);
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
}
