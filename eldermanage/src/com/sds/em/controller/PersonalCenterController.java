package com.sds.em.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Staffbase;
import com.sds.em.pojo.StaffDepartmentRoleExtend;
import com.sds.em.service.PersonalCenterService;
import com.sds.em.util.DateSimp;
import com.sds.em.util.Md5;

/*
 * 作者：刘露
 * 描述：个人中心管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/personal/")
public class PersonalCenterController {
	@Autowired
	PersonalCenterService personalCenterService;

	// 查看个人信息--所有完成
	@RequestMapping(method = RequestMethod.GET, value = "message")
	public @ResponseBody Message personalMessage(HttpSession session) throws Exception {
		int staffid = (int) session.getAttribute("staffid");
		// int staffid = 1;
		return personalCenterService.personalMessage(staffid);
	}

	// 个人信息中心修改基本个人信息

	@RequestMapping(method = RequestMethod.POST, value = "update/message")
	public @ResponseBody Message updatePersonalMessage(HttpSession session, String staffname, String staffaddress,
			MultipartFile staffimg, String staffsex, String staffbirthday, String staffiide, String stafftel,
			String staffpassword) throws Exception {
		Staffbase staffbase = new Staffbase();
		int staffid = (int) session.getAttribute("staffid");
		// int staffid = 1;
		staffbase.setStaffid(staffid);
		staffbase.setStaffaddress(staffaddress);
		Date date;
		if (!staffbirthday.isEmpty()) {
			date = DateSimp.simp(staffbirthday);
			staffbase.setStaffbirthday(date);
		}
		staffbase.setStaffiide(staffiide);
		if (!staffpassword.isEmpty())
			staffbase.setStaffpassword(Md5.MD5(staffpassword));
		StaffDepartmentRoleExtend staff = (StaffDepartmentRoleExtend) personalCenterService.personalMessage(staffid).getData();
		if (!staffimg.isEmpty()) {
			String pic_path = "E:\\oldermanageresource\\staffimg\\";
			String i[] = staff.getStaffbase().getStaffimg().split("/");
			File headurl = new File(pic_path + i[i.length - 1]);
			if (headurl.exists())
				headurl.delete();
			String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
			headurl = new File(pic_path + newFileName);
			staffimg.transferTo(headurl);
			staffbase.setStaffimg("/staffimg/"+newFileName);
		}
		staffbase.setStaffname(staffname);
		staffbase.setStaffsex(staffsex);
		staffbase.setStafftel(stafftel);
		return personalCenterService.updatePersonalMessage(staffbase);
	}
}
