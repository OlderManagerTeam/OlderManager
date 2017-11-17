package com.sds.em.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.mapper.ShiroroleMapper;
import com.sds.em.po.Message;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.ShiroService;
import com.sds.em.service.WeboperationService;

@Controller
@RequestMapping("v1/weboperation/")
public class WebOperationController {
	@Autowired
	WeboperationService weboperationService;

	@Autowired
	ShiroService shiroService;

	// wuwenbo获取全部权限
	@RequestMapping(method = RequestMethod.GET, value = "authorization")
	public @ResponseBody Message getauthorization() throws Exception {
		return weboperationService.getauthorization();
	}

	// 返回员工列表，在headoffice里定义了
	// 返回员工已拥有权限，在PersonalCenter里定义了，（需要修改）
	// 查看员工详细信息，在headoffice已有
	// 为员工添加某项权限
	@RequestMapping(method = RequestMethod.POST, value = "person/authorization")
	public @ResponseBody Message addpersonauthorization(HttpSession session, String stafftel, String branchmanager,
			String datamanager, String droitmanager, String headofficemanager, String newsmanager, String shopmanager,
			String videomanager) throws Exception {
		LoginMassage loginMassage = (LoginMassage) session.getAttribute("loginMassage");
		Set<String> allroles = shiroService.getRoles(loginMassage.getStafftel());
		Set<String> oldroles = shiroService.getRoles(stafftel);
		Set<String> newroles = new HashSet<String>();
		Set<String> templ = new HashSet<String>();
		newroles.add(videomanager);
		newroles.add(branchmanager);
		newroles.add(shopmanager);
		newroles.add(newsmanager);
		newroles.add(headofficemanager);
		newroles.add(droitmanager);
		newroles.add(datamanager);
		newroles.retainAll(allroles);
		oldroles.retainAll(allroles);
		templ.addAll(newroles);
		templ.removeAll(oldroles);
		try {
			for (String newrole : templ) {
				weboperationService.addpersonauthorization(stafftel, newrole);
			}
			templ.clear();
			templ.addAll(oldroles);
			templ.removeAll(newroles);
			for (String oldrole : templ) {
				weboperationService.delpersonauthorization(stafftel, oldrole);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "操作失败", null);
		}
		return new Message(true, "操作成功", null);
	}

	// 删除员工的某项权限
	@RequestMapping(method = RequestMethod.DELETE, value = "person/authorization")
	public @ResponseBody Message delpersonauthorization(String stafftel, String authorization) throws Exception {
		return weboperationService.delpersonauthorization(stafftel, authorization);
	}

	// 获取员工姓名
	@RequestMapping(method = RequestMethod.GET, value = "staffname")
	public @ResponseBody Message staffname(String stafftel) throws Exception {
		return weboperationService.staffname(stafftel);
	}
}
