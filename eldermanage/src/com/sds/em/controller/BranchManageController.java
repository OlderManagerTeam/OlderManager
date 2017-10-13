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
import com.sds.em.service.BranchManageService;

/*
 * 作者：刘露
 * 描述：分店管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/branch/elder/message/")
public class BranchManageController {
	@Autowired
	BranchManageService branchManageService;

	@RequestMapping(method = RequestMethod.POST, value = "base")
	public @ResponseBody Message base(Olderbase olderbase) throws Exception {
		
		return branchManageService.BaseEnter(olderbase);

	}

	@RequestMapping(method = RequestMethod.POST, value = "sick")
	public @ResponseBody Message sick(int olderId,Oldersick oldersick) throws Exception {
		return branchManageService.SickEnter(olderId,oldersick);
	}
}
