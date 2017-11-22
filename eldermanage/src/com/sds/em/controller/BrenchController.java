package com.sds.em.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;
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
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.BrenchService;
import com.sds.em.service.IndexService;
import com.sds.em.util.DateSimp;
import com.sds.em.util.Md5;

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
	BrenchService brenchService;

	@Autowired
	IndexService indexService;
	// olderpoint;

	// odermaxpoint;

	// 老人基本信息的录入-测试通过-前端-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "elder/info")
	public @ResponseBody Message info(HttpSession session, String oldername, String oldersex, String olderbirthday,
			String olderpassword, String oldertel, String olderaddress, String oldersinglestatus, String olderide,
			String oldernation, MultipartFile olderheadurl) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		if (indexService.usernotregister(oldertel)) {
			String pic_path = "E:\\oldermanageresource\\olderimg\\";
			String picUrl = "/olderimg/";
			String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
			File dnf1 = new File(pic_path + newFileName);
			olderheadurl.transferTo(dnf1);

			Olderbase olderbase = new Olderbase();
			olderbase.setOlderaddress(olderaddress);
			Date date = DateSimp.simp(olderbirthday);
			olderbase.setOlderbirthday(date);
			olderbase.setOlderbranchid(loginMassage.getBranchid());
			// /pic/1.jpg
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

			return brenchService.addElderInfo(olderbase);
		}
		return new Message(false, "电话号码已被注册", null);
	}

	// 老人基本信息的修改-测试通过
	@RequestMapping(method = RequestMethod.POST, value = "elder/infoupdate")
	public @ResponseBody Message update(HttpSession session, String oldername, String oldersex, String olderbirthday,
			String olderpassword, String repassword, String oldertel, String olderaddress, String oldersinglestatus,
			String olderide, String oldernation, MultipartFile olderheadurl) throws Exception {
		Olderbase olderbase1 = (Olderbase) brenchService.getElder(oldertel).getData();
		String pic_path = "E:\\oldermanageresource\\olderimg\\";
		String picUrl = "/olderimg/";
		Olderbase olderbase = new Olderbase();
		if (!olderheadurl.isEmpty()) {
			String i[] = olderbase1.getOlderheadurl().split("/");
			File headurl = new File(pic_path + i[i.length - 1]);
			if (headurl.exists())
				headurl.delete();
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		File dnf1 = new File(pic_path + newFileName);
		olderheadurl.transferTo(dnf1);
		olderbase.setOlderheadurl(picUrl + newFileName);
		}
	
		olderbase.setOlderid(olderbase1.getOlderid());
		olderbase.setOlderaddress(olderaddress);
		Date date = DateSimp.simp(olderbirthday);
		olderbase.setOlderbirthday(date);
	
		olderbase.setOlderide(olderide);
		olderbase.setOldername(oldername);
		olderbase.setOldernation(oldernation);
		if (!(repassword.isEmpty())) {
			repassword = Md5.MD5(repassword);
			olderbase.setOlderpassword(repassword);
		}
		olderbase.setOldersex(oldersex);
		olderbase.setOldersinglestatus(oldersinglestatus);
		olderbase.setOldertel(oldertel);

		return brenchService.modifyOlder(olderbase);

	}

	// 老人病历信息的录入-测试通过
	@RequestMapping(method = RequestMethod.POST, value = "elder/sicks")
	public @ResponseBody Message sicks(Oldersick oldersick, String sickDate) throws Exception {
		oldersick.setSickdate(DateSimp.simp(sickDate));
		return brenchService.addSicks(oldersick);
	}

	// 老人评价-未测试
	@RequestMapping(method = RequestMethod.POST, value = "elder/rate")
	public @ResponseBody Message rate(@RequestBody int olderid) throws Exception {
		return brenchService.olderRate(olderid);
	}

	// 发布活动-测试通过-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "action")
	public @ResponseBody Message addAction(HttpSession session, String actionstartdate, String actionintro,
			String actionname, String actionaddress, String actionstatus, String actiontotal) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		Action action = new Action();
		action.setActionaddress(actionaddress);
		;
		action.setActionintro(actionintro);
		action.setActionname(actionname);
		action.setActionstatus("报名中");
		Date date = DateSimp.simp(actionstartdate);
		action.setActionstartdate(date);

		action.setActionstatus(actionstatus);

		action.setActiontotal(Integer.parseInt(actiontotal));
		action.setActionbranchid(loginMassage.getBranchid());
		action.setActionenroll(0);
		return brenchService.publishAction(action);
	}

	// 修改活动-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "updateaction")
	public @ResponseBody Message updateAction(HttpSession session, String actionid, String actionintro,
			String actionstartdate, String actionname, String actionaddress, String actionstatus, String actiontotal)
			throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		Action action = new Action();
		try {
			int a = Integer.parseInt(actionid);
			action.setActionid(a);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		action.setActionaddress(actionaddress);

		action.setActionintro(actionintro);
		action.setActionname(actionname);

		Date date = DateSimp.simp(actionstartdate);
		action.setActionstartdate(date);

		action.setActionstatus(actionstatus);

		action.setActiontotal(Integer.parseInt(actiontotal));

		action.setActionbranchid(loginMassage.getBranchid());

		return brenchService.modifyAction(action);
	}

	// 查看本店的所有活动信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "allactions")
	public @ResponseBody Message getAallActions(HttpSession session) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		// int actionbranchid = 1;
		return brenchService.getAallActions(loginMassage.getBranchid());
	}

	// 查看活动的详情信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "action/info")
	public @ResponseBody Message getAction(int actionid) throws Exception {
		return brenchService.getAction(actionid);
	}

	// 查找本活动参加的老人信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "action/older/info")
	public @ResponseBody Message getActionOlder(int actionid) throws Exception {
		return brenchService.getActionOlder(actionid);
	}

	// 查找本活动参加的老人信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "lecture/older/info")
	public @ResponseBody Message getLectureOlder(int lectureid) throws Exception {
		return brenchService.getLectureOlder(lectureid);
	}

	// 查询这个管理员所在的分店名--测试通过

	@RequestMapping(method = RequestMethod.GET, value = "branchname")
	public @ResponseBody Message getBranchName(int staffid) throws Exception {
		return brenchService.getBranchName(staffid);
	}

	// 查询本分店所有老人的基本信息-前端-所有完成

	@RequestMapping(method = RequestMethod.GET, value = "elders/info")
	public @ResponseBody Message allOlderByBranch(HttpSession session) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		// int branchid = 1;
		
		return brenchService.getAllElder(loginMassage.getBranchid());
	}

	// 删除某个老人的信息--测试成功

	@RequestMapping(method = RequestMethod.DELETE, value = "elder/info")
	public @ResponseBody Message deleteOlder(String oldertel) throws Exception {
		return brenchService.deleteANElder(oldertel);
	}

	// 获取某个老人的信息--测试成功-前端-所有完成

	@RequestMapping(method = RequestMethod.GET, value = "elder/info")
	public @ResponseBody Message getOlder(String oldertel) throws Exception {
		return brenchService.getElder(oldertel);
	}

	// 查看本老人的所有病历信息
	@RequestMapping(method = RequestMethod.GET, value = "elder/sicks")
	public @ResponseBody Message getOlderAllSick(int olderid) throws Exception {
		return brenchService.getOlderAllSick(olderid);
	}

	// 删除一条老人病历信息--测试成功
	@RequestMapping(method = RequestMethod.DELETE, value = "elder/sick")
	public @ResponseBody Message deleteOlderSick(int sickid) throws Exception {
		return brenchService.deleteOlderSick(sickid);
	}

	// 查看本老人的订单信息--测试成功-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "elder/orders")
	public @ResponseBody Message getOlderAllOrder(int olderid) throws Exception {
		return brenchService.getOlderAllOrder(olderid);
	}

	// 给本老人添加回访记录
	@RequestMapping(method = RequestMethod.POST, value = "elder/visited")
	public @ResponseBody Message andOlderVisited(String publishDate, Visited visited, HttpSession session)
			throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		visited.setVisiteddate(new Date());
		if (publishDate == "")
			visited.setVisiteddate(DateSimp.simp(publishDate));
		visited.setVisitedassistantid(loginMassage.getStaffid());
		visited.setVisitedjudgestar(0);
		visited.setVisitedjudgecontent("未评价");
		return brenchService.andOlderVisited(visited);
	}

	// 查看本老人的所有回访记录信息
	@RequestMapping(method = RequestMethod.GET, value = "elder/visited")
	public @ResponseBody Message getOlderAllVisited(int olderid) throws Exception {
		return brenchService.getOlderAllVisited(olderid);
	}

	// 添加讲座信息-前端
	@RequestMapping(method = RequestMethod.POST, value = "lecture/info")
	public @ResponseBody Message addLecture(HttpSession session, String lecturename, String lectureintro,
			String lecturetotal, String lecturepublishdate, String lecturestatus, String lectureaddress)
			throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		Lecture lecture = new Lecture();
		lecture.setLectureaddress(lectureaddress);
		;
		lecture.setLectureintro(lectureintro);
		lecture.setLecturename(lecturename);
		Date date = DateSimp.simp(lecturepublishdate);

		lecture.setLecturepublishdate(date);
		lecture.setLecturestatus(lecturestatus);

		lecture.setLecturetotal(Integer.parseInt(lecturetotal));

		lecture.setLecturebranchid(loginMassage.getBranchid());
		lecture.setLectureenroll(0);
		return brenchService.addLecture(lecture);
	}

	// 查看本分店的所有讲座信息
	@RequestMapping(method = RequestMethod.GET, value = "alllectures")
	public @ResponseBody Message getAllLectures(HttpSession session) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		//int branchid = 1;
		return brenchService.getAllLectures(loginMassage.getBranchid());
	}

	// 查看讲座的详细信息
	@RequestMapping(method = RequestMethod.GET, value = "lecture/info")
	public @ResponseBody Message getLecture(int lectureid) throws Exception {
		return brenchService.getLecture(lectureid);
	}

	// 修改讲座信息
	@RequestMapping(method = RequestMethod.POST, value = "lecture/updateinfo")
	public @ResponseBody Message updateStatus(Lecture lecture, String lecturePublishDate) throws Exception {
		// int id = Integer.parseInt(lectureid);s
		lecture.setLecturepublishdate(DateSimp.simp(lecturePublishDate));
		return brenchService.updateStatus(lecture);
	}

	/*
	 * // 删除一条讲座信息(这个controller可能取消)
	 * 
	 * @RequestMapping(method = RequestMethod.GET, value = "lecture")
	 * public @ResponseBody Message deleteLecture(int lectureid) throws
	 * Exception { return brenchService.deleteLecture(lectureid); }
	 * 
	 * //取消一个老人的活动参与
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE, value =
	 * "actionrecorddelete") public @ResponseBody Message deleteLecturejoin(int
	 * lectureid) throws Exception { return
	 * brenchService.deleteLecture(lectureid); }
	 */

	// 取消一个老人的讲座参与
	@RequestMapping(method = RequestMethod.DELETE, value = "lecture/older")
	public @ResponseBody Message deletelecturejoin(int lectureid, int olderid) throws Exception {
		return brenchService.deletelecturejoin(lectureid, olderid);
	}

	// 取消一个老人的活动参与
	@RequestMapping(method = RequestMethod.DELETE, value = "action/older")
	public @ResponseBody Message deleteactionjoin(int actionid, int olderid) throws Exception {
		return brenchService.deleteactionjoin(actionid, olderid);
	}
}
