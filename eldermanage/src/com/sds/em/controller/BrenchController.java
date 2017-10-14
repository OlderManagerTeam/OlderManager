package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.service.BrenchService;

/*
 * ���ߣ���¶
 * �������ֵ����ϵͳ�ĺ�̨��ع���
 * 
 * 
 * */
@Controller
@RequestMapping("v1/brench/elder/")
public class BrenchController {
	@Autowired
	BrenchService brenchManageService;

	// ���˻�����Ϣ��¼��
	@RequestMapping(method = RequestMethod.POST, value = "info")
	public @ResponseBody Message info(Olderbase olderbase) throws Exception {
		return brenchManageService.addElderInfo(olderbase);

	}

	// ���˻�����Ϣ���޸�
	@RequestMapping(method = RequestMethod.PUT, value = "info")
	public @ResponseBody Message update(Olderbase olderbase) throws Exception {
		return brenchManageService.modifyOlder(olderbase);
	}

	// ���˲�����Ϣ��¼��
	@RequestMapping(method = RequestMethod.POST, value = "sicks")
	public @ResponseBody Message sicks(int sickOlderId, Oldersick oldersick) throws Exception {
		return brenchManageService.addSicks(sickOlderId, oldersick);
	}
}
