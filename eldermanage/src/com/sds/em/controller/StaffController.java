package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.StaffService;

@Controller
@RequestMapping("v1/staff/")
public class StaffController {
	@Autowired
	StaffService staffService;
	@RequestMapping(method=RequestMethod.GET,value="signin")
	public @ResponseBody Message sigin(String staffTel){
		return staffService.checkStaffName(staffTel);
	}
}
