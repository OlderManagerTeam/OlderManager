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
				return new Message(true, "基本信息录入成功", olderbase.getOlderid());
			} else {
				return new Message(false, "基本信息录入失败", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message SickEnter(int olderId, Oldersick oldersick) {
		try {
			oldersick.setSickolderid(olderId);
			oldersickMapper.insertOlderSick(oldersick);
			if (oldersick.getSickid() != null) {
				return new Message(true, "病历信息录入成功", oldersick.getSickid());
			} else {
				return new Message(false, "病历信息录入失败", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}
}
