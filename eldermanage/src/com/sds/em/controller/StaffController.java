package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.StaffService;
/**
 * 
 * @author wenbowu
 *关于员工的controller
 */
@Controller
@RequestMapping("v1/staff/")
public class StaffController {
	@Autowired
	StaffService staffService;
	@RequestMapping(method=RequestMethod.GET,value="signin")
	public @ResponseBody Message sigin(String staffTel){//验证员工电话号码是否可用
		return staffService.checkStaffName(staffTel);
	}
	@RequestMapping(method=RequestMethod.GET,value="securities")
	public @ResponseBody Message securities(){//返回所有问题列表
		return staffService.returnSecurities();
	}
}
