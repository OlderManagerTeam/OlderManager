package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Branch;
import com.sds.em.po.Message;
import com.sds.em.service.HeadOfficeService;

/*
 * 作者：刘露
 * 描述：总店管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/headoffice/")
public class HeadOfficeController {
	@Autowired
	HeadOfficeService headOfficeService;
	
	//添加分店-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "branch")
	public @ResponseBody Message addBranch(Branch branch) throws Exception {
		return headOfficeService.addBranch(branch);
	}
	// 查询所有分店信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "allbranchs")
	public @ResponseBody Message getAllBranch() throws Exception {
		return headOfficeService.getAllBranch();
	}

	// 查看分店的详细信息
	@RequestMapping(method = RequestMethod.GET, value = "branch/info")
	public @ResponseBody Message getBranch(int brachid) throws Exception {
		return headOfficeService.getBranch(brachid);
	}

	// 修改分店信息
	@RequestMapping(method = RequestMethod.POST, value = "branch/info")
	public @ResponseBody Message updateBranch(Branch branch) throws Exception {
		return headOfficeService.updateBranch(branch);
	}

	// 返回所有员工
	@RequestMapping(method = RequestMethod.GET, value = "allstaff")
	public @ResponseBody Message getAllStaff() throws Exception {
		return headOfficeService.getAllStaff();
	}
}
