package com.sds.em.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sds.em.po.Message;
import com.sds.em.po.Role;
import com.sds.em.po.Staffbase;
import com.sds.em.service.IndexService;

/**
 * 
 * @author wenbowu 关于员工的controller
 */

@Controller
@RequestMapping("v1/index/staff/")
public class IndexController {

	@Autowired
	IndexService indexService;

	@RequestMapping(value = "signin")
	public @ResponseBody Message sigin(@RequestBody String staffTel) {// 验证员工电话号码是否可用
		return indexService.checkStaffName(staffTel);
	}

	@RequestMapping(method = RequestMethod.GET, value = "securities")
	public @ResponseBody Message securities() {// 返回所有问题列表
		return indexService.returnSecurities();
	}

	@RequestMapping(method = RequestMethod.POST, value = "login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String staffTel, String staffPassword) {
		ModelAndView modelAndView = new ModelAndView();

		Message message = indexService.login(staffTel, staffPassword);

		Staffbase staffbase = (Staffbase) message.getData();
		int staffId = staffbase.getStaffid();
		String staffName = staffbase.getStaffname();

		Role role = indexService.returnRole(staffId);
		session.setAttribute("staffId", staffId);
		session.setAttribute("staffName", staffName);

		session.setAttribute("role", role);

		modelAndView.addObject("message", message);

		// cookie
		Cookie cookie = new Cookie("cookieName", "cookie"); // 新建Cookie
		cookie.setSecure(true);
		cookie.setMaxAge(24 * 60 * 60);// 保存一天
		response.addCookie(cookie); // 输出到客户端
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}

	/*
	 * lu-10-14
	 */

	// 返回个人密保问题
	@RequestMapping(method = RequestMethod.GET, value = "question")
	public @ResponseBody Message question(String staffTel) {
		return indexService.returnQuestion(staffTel);
	}

	// 校验密保问题答案
	@RequestMapping(method = RequestMethod.POST, value = "answer")
	public @ResponseBody Message answer(String securityAnswer, int staffId) {
		return indexService.checkSecurity(securityAnswer, staffId);
	}

	// 修改密码
	@RequestMapping(method = RequestMethod.POST, value = "password")
	public @ResponseBody Message password(String staffPassword, int staffId) {
		return indexService.modifyPassword(staffPassword, staffId);
	}

	// 返回所有的部门
	@RequestMapping(method = RequestMethod.GET, value = "departments")
	public @ResponseBody Message departments() {
		return indexService.allDepartments();
	}

	// 返回当前部门所有职位
	@RequestMapping(method = RequestMethod.GET, value = "roles")
	public @ResponseBody Message roles(int departmentId) {
		return indexService.allRoles(departmentId);
	}
	
	//新闻列表查询
		@RequestMapping(method = RequestMethod.GET, value = "news")
		public @ResponseBody Message news() {
			return indexService.allNews();
		}

}
