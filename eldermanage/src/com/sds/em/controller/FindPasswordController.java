/*package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Message;
import com.sds.em.service.IndexService;

@Controller
@RequestMapping("/v1/index/staff/")
public class FindPasswordController {
	@Autowired
	IndexService indexService;

	@RequestMapping(method = RequestMethod.GET, value = "question")
	public @ResponseBody Message question(String staffTel) {// 验证员工电话号码是否可用
		return indexService.returnQuestion(staffTel);
	}

}
*/