package com.sds.em.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Visited;
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
		olderbase.setOldermaxpoint(0);
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

	// ��ѯ�������Ա���ڵķֵ���--����ͨ��

	@RequestMapping(method = RequestMethod.GET, value = "branchname")
	public @ResponseBody Message getBranchName(int staffid) throws Exception {
		return brenchManageService.getBranchName(staffid);
	}

	// ��ѯ���ֵ��������˵Ļ�����Ϣ

	@RequestMapping(method = RequestMethod.GET, value = "elders/info")
	public @ResponseBody Message allOlderByBranch(HttpSession session) throws Exception {
		int branchid = (int) session.getAttribute("branchid");
		return brenchManageService.getAllElder(branchid);
	}

	// ɾ��ĳ�����˵���Ϣ--���Գɹ�

	@RequestMapping(method = RequestMethod.DELETE, value = "elder/info")
	public @ResponseBody Message deleteOlder(@RequestBody String oldertel) throws Exception {

		return brenchManageService.deleteANElder(oldertel);
	}

	// ��ȡĳ�����˵���Ϣ--���Գɹ�

	@RequestMapping(method = RequestMethod.GET, value = "elder/info")
	public @ResponseBody Message getOlder(String oldertel) throws Exception {

		return brenchManageService.getElder(oldertel);
	}

	// �鿴�����˵����в�����Ϣ
	@RequestMapping(method = RequestMethod.GET, value = "elder/sicks")
	public @ResponseBody Message getOlderAllSick(int olderid) throws Exception {
		return brenchManageService.getOlderAllSick(olderid);
	}

	// ɾ��һ�����˲�����Ϣ--���Գɹ�
	@RequestMapping(method = RequestMethod.DELETE, value = "elder/sick")
	public @ResponseBody Message deleteOlderSick(int sickid) throws Exception {
		return brenchManageService.deleteOlderSick(sickid);
	}

	// �鿴�����˵Ķ�����Ϣ--���Գɹ�
	@RequestMapping(method = RequestMethod.GET, value = "elder/orders")
	public @ResponseBody Message getOlderAllOrder(int olderid) throws Exception {
		return brenchManageService.getOlderAllOrder(olderid);
	}

	// ����������ӻطü�¼
	@RequestMapping(method = RequestMethod.POST, value = "elder/visited")
	public @ResponseBody Message andOlderVisited(@RequestBody Visited visited, HttpSession session) throws Exception {
		int staffid = (int) session.getAttribute("staffid");
		visited.setVisitedassistantid(staffid);
		return brenchManageService.andOlderVisited(visited);
	}

	// �鿴�����˵����лطü�¼��Ϣ
	@RequestMapping(method = RequestMethod.GET, value = "elder/visited")
	public @ResponseBody Message getOlderAllVisited( int olderid) throws Exception {
		return brenchManageService.getOlderAllVisited(olderid);
	}
	
	//��ӽ�����Ϣ
	@RequestMapping(method = RequestMethod.POST, value = "lecture")
	public @ResponseBody Message addLecture( HttpSession session,@RequestBody Lecture lecture) throws Exception {
		int branchid = (int) session.getAttribute("branchid");
		lecture.setLecturebranchid(branchid);
		return brenchManageService.addLecture( lecture);
	}
	//�鿴���ֵ�����н�����Ϣ
	@RequestMapping(method = RequestMethod.GET, value = "lecture")
	public @ResponseBody Message getLecture( HttpSession session ) throws Exception {
		int branchid = (int) session.getAttribute("branchid");
		return brenchManageService.getLecture(branchid);
	}
	
}
