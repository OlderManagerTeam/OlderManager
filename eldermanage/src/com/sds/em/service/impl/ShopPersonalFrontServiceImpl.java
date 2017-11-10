package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.service.ShopPersonalFrontService;

public class ShopPersonalFrontServiceImpl implements ShopPersonalFrontService {

	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Override
	public Message shopPersonalInfo(int olderid) throws Exception {
		try {
			Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(olderid);

			if (olderbase != null) {
				return new Message(true, "返回成功", olderbase);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

}
