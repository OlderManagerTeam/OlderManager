package com.sds.em.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Visited;
import com.sds.em.service.BrenchService;
import com.sds.em.util.DateSimp;

/*
 * 作者：刘露
 * 描述：分店管理系统的后台相关功能
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

	// 老人基本信息的录入-测试通过
	@RequestMapping(method = RequestMethod.POST, value = "elder/info")
	public @ResponseBody Message info(HttpSession session, String oldername, String oldersex, String olderbirthday,
			String olderpassword, String oldertel, String olderaddress, String oldersinglestatus, String olderide,
			String oldernation, MultipartFile olderheadurl) throws Exception {
		// int olderbranchid=session.getAttribute("branchid");

		String pic_path = "E:\\develop\\upload\\temp\\";
		String picUrl = "http://localhost:8080/pic/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		
		File dnf1 = new File(pic_path + newFileName);
		olderheadurl.transferTo(dnf1);
		
		Olderbase olderbase = new Olderbase();
		olderbase.setOlderaddress(olderaddress);
		Date date = DateSimp.simp(olderbirthday);
		olderbase.setOlderbirthday(date);
		olderbase.setOlderbranchid(1);
		// http://localhost:8080/pic/1.jpg
		olderbase.setOlderheadurl(picUrl + newFileName);

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

	// 老人基本信息的修改-测试通过
	@RequestMapping(method = RequestMethod.PUT, value = "elder/info")
	public @ResponseBody Message update(@RequestBody Olderbase olderbase) throws Exception {
		return brenchManageService.modifyOlder(olderbase);
	}

	// 老人病历信息的录入-测试通过
	@RequestMapping(method = RequestMethod.POST, value = "elder/sicks")
	public @ResponseBody Message sicks(@RequestBody Oldersick oldersick) throws Exception {

		return brenchManageService.addSicks(oldersick);
	}

	// 老人评价-未测试
	@RequestMapping(method = RequestMethod.POST, value = "elder/rate")
	public @ResponseBody Message rate(@RequestBody int olderid) throws Exception {
		return brenchManageService.olderRate(olderid);
	}

	// 发布活动-测试通过
	@RequestMapping(method = RequestMethod.POST, value = "action")
	public @ResponseBody Message addAction(HttpSession session, Action action) throws Exception {
		// int actionbranchid=session.getAttribute("branchid");
		action.setActionbranchid(1);
		action.setActionenroll(0);
		return brenchManageService.publishAction(action);
	}

	// 修改活动-测试通过
	@RequestMapping(method = RequestMethod.PUT, value = "action")
	public @ResponseBody Message updateAction(@RequestBody Action action) throws Exception {
		return brenchManageService.modifyAction(action);
	}

	// 查询这个管理员所在的分店名--测试通过

	@RequestMapping(method = RequestMethod.GET, value = "branchname")
	public @ResponseBody Message getBranchName(int staffid) throws Exception {
		return brenchManageService.getBranchName(staffid);
	}

	// 查询本分店所有老人的基本信息

	@RequestMapping(method = RequestMethod.GET, value = "elders/info")
	public @ResponseBody Message allOlderByBranch(HttpSession session) throws Exception {
		// int branchid = (int) session.getAttribute("branchid");
		int branchid = 1;
		return brenchManageService.getAllElder(branchid);
	}

	// 删除某个老人的信息--测试成功

	@RequestMapping(method = RequestMethod.DELETE, value = "elder/info")
	public @ResponseBody Message deleteOlder(@RequestBody String oldertel) throws Exception {

		return brenchManageService.deleteANElder(oldertel);
	}

	// 获取某个老人的信息--测试成功

	@RequestMapping(method = RequestMethod.GET, value = "elder/info")
	public @ResponseBody Message getOlder(String oldertel) throws Exception {

		return brenchManageService.getElder(oldertel);
	}

	// 查看本老人的所有病历信息
	@RequestMapping(method = RequestMethod.GET, value = "elder/sicks")
	public @ResponseBody Message getOlderAllSick(int olderid) throws Exception {
		return brenchManageService.getOlderAllSick(olderid);
	}

	// 删除一条老人病历信息--测试成功
	@RequestMapping(method = RequestMethod.DELETE, value = "elder/sick")
	public @ResponseBody Message deleteOlderSick(int sickid) throws Exception {
		return brenchManageService.deleteOlderSick(sickid);
	}

	// 查看本老人的订单信息--测试成功
	@RequestMapping(method = RequestMethod.GET, value = "elder/orders")
	public @ResponseBody Message getOlderAllOrder(int olderid) throws Exception {
		return brenchManageService.getOlderAllOrder(olderid);
	}

	// 给本老人添加回访记录
	@RequestMapping(method = RequestMethod.POST, value = "elder/visited")
	public @ResponseBody Message andOlderVisited(@RequestBody Visited visited, HttpSession session) throws Exception {
		int staffid = (int) session.getAttribute("staffid");
		visited.setVisitedassistantid(staffid);
		return brenchManageService.andOlderVisited(visited);
	}

	// 查看本老人的所有回访记录信息
	@RequestMapping(method = RequestMethod.GET, value = "elder/visited")
	public @ResponseBody Message getOlderAllVisited(int olderid) throws Exception {
		return brenchManageService.getOlderAllVisited(olderid);
	}

	// 添加讲座信息
	@RequestMapping(method = RequestMethod.POST, value = "lecture")
	public @ResponseBody Message addLecture(HttpSession session, @RequestBody Lecture lecture) throws Exception {
		int branchid = (int) session.getAttribute("branchid");
		lecture.setLecturebranchid(branchid);
		return brenchManageService.addLecture(lecture);
	}

	// 查看本分店的所有讲座信息
	@RequestMapping(method = RequestMethod.GET, value = "lecture")
	public @ResponseBody Message getLecture(HttpSession session) throws Exception {
		int branchid = (int) session.getAttribute("branchid");
		return brenchManageService.getLecture(branchid);
	}

}
