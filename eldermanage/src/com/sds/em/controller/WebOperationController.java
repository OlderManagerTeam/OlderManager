package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.WeboperationService;

@Controller
@RequestMapping("v1/weboperation/")
public class WebOperationController {
	@Autowired
	WeboperationService weboperationService;
	
	// wuwenbo获取全部权限
	@RequestMapping(method = RequestMethod.GET, value = "authorization")
	public @ResponseBody Message getauthorization() throws Exception {
		return weboperationService.getauthorization();
	}
	
	//返回员工列表，在headoffice里定义了
	//返回员工已拥有权限，在PersonalCenter里定义了，（需要修改）
	//查看员工详细信息，在headoffice已有
	//为员工添加某项权限
	@RequestMapping(method = RequestMethod.POST, value = "person/authorization")
	public @ResponseBody Message addpersonauthorization(String stafftel,String authorization) throws Exception {
		return weboperationService.addpersonauthorization(stafftel,authorization);
	}
	//删除员工的某项权限
	@RequestMapping(method = RequestMethod.DELETE, value = "person/authorization")
	public @ResponseBody Message delpersonauthorization(String stafftel,String authorization) throws Exception {
		return weboperationService.delpersonauthorization(stafftel,authorization);
	}
}
