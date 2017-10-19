package com.sds.em.controller;

import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Action;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.service.BrenchService;
import com.sds.em.util.DateSimp;

/*
 * ���ߣ���¶
 * �������ֵ����ϵͳ�ĺ�̨��ع���
 * 
 * 
 * */
@Controller
@RequestMapping("v1/brench/")
public class BrenchController {
	@Autowired
	BrenchService brenchManageService;

	// olderpoint;

	// odermaxpoint;

	// ���˻�����Ϣ��¼��-����ͨ��
	@RequestMapping(method = RequestMethod.POST, value = "elder/info")
	public @ResponseBody Message info(String oldername, String oldersex, String olderbirthday, String olderpassword,
			String oldertel, String olderaddress, String oldersinglestatus, String olderide, String oldernation,
			String olderheadurl, int olderbranchid) throws Exception {

		Olderbase olderbase = new Olderbase();
		olderbase.setOlderaddress(olderaddress);

		Date date = DateSimp.simp(olderbirthday);

		olderbase.setOlderbirthday(date);
		olderbase.setOlderbranchid(olderbranchid);
		olderbase.setOlderheadurl(olderheadurl);
		olderbase.setOlderide(olderide);
		olderbase.setOldername(oldername);
		olderbase.setOldernation(oldernation);
		olderbase.setOlderpassword(olderpassword);

		olderbase.setOlderpoint(0);
		olderbase.setOldersex(oldersex);
		olderbase.setOldersinglestatus(oldersinglestatus);
		olderbase.setOldertel(oldertel);
		olderbase.setOdermaxpoint(0);
		return brenchManageService.addElderInfo(olderbase);

	}

	// ���˻�����Ϣ���޸�-����ͨ��
	@RequestMapping(method = RequestMethod.PUT, value = "elder/info")
	public @ResponseBody Message update(@RequestBody Olderbase olderbase) throws Exception {
		return brenchManageService.modifyOlder(olderbase);
	}

	
	// ���˲�����Ϣ��¼��-����ͨ��
	@RequestMapping(method = RequestMethod.POST, value = "elder/sicks")
	public @ResponseBody Message sicks(@RequestBody Oldersick oldersick) throws Exception {

		return brenchManageService.addSicks(oldersick);
	}

	// ��������-δ����
	@RequestMapping(method = RequestMethod.POST, value = "elder/rate")
	public @ResponseBody Message rate(@RequestBody int olderid) throws Exception {
		return brenchManageService.olderRate(olderid);
	}

	// �����-����ͨ��
	@RequestMapping(method = RequestMethod.POST, value = "action")
	public @ResponseBody Message addAction(@RequestBody Action action) throws Exception {
		return brenchManageService.publishAction(action);
	}

	// �޸Ļ-����ͨ��
	@RequestMapping(method = RequestMethod.PUT, value = "action")
	public @ResponseBody Message updateAction(@RequestBody Action action) throws Exception {
		return brenchManageService.modifyAction(action);
	}
}
