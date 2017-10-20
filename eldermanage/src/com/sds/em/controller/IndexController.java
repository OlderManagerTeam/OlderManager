package com.sds.em.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sds.em.po.Message;
import com.sds.em.service.IndexService;

/**
 * 
 * @author wenbowu ����Ա����controller
 */

@Controller
@RequestMapping("v1/index/staff/")
public class IndexController {

	@Autowired
	IndexService indexService;

	@RequestMapping(value = "signin")
	public @ResponseBody Message sigin(@RequestBody String staffTel) {// ��֤Ա���绰�����Ƿ����
		return indexService.checkStaffName(staffTel);
	}

	@RequestMapping(method = RequestMethod.GET, value = "securities")
	public @ResponseBody Message securities() {// �������������б�
		return indexService.returnSecurities();
	}

	@RequestMapping(method = RequestMethod.POST, value = "login")
	@ResponseBody
	public String login(HttpSession session, String tel, String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(tel, password);
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "failed";
		}
		
		
		
		
		
		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * 
		 * Message message = indexService.login(s.getStafftel(),
		 * s.getStaffpassword());
		 * 
		 * Staffbase staffbase = (Staffbase) message.getData(); int staffId =
		 * staffbase.getStaffid(); String staffName = staffbase.getStaffname();
		 * 
		 * session.setAttribute("staffId", staffId);
		 * session.setAttribute("staffName", staffName);
		 * modelAndView.addObject("message", message);
		 * 
		 * // cookie Cookie cookie = new Cookie("cookieName", "cookie"); //
		 * �½�Cookie cookie.setSecure(true); cookie.setMaxAge(24 * 60 * 60);//
		 * ����һ�� response.addCookie(cookie); // ������ͻ���
		 * modelAndView.setViewName("login.jsp");
		 */
		return "成功登录";
	}

	/*
	 * lu-10-14
	 */

	// ���ظ����ܱ�����
	@RequestMapping(method = RequestMethod.GET, value = "question")
	public @ResponseBody Message question(@RequestBody String stafftel) {
		return indexService.returnQuestion(stafftel);
	}

	// У���ܱ������
	@RequestMapping(method = RequestMethod.POST, value = "answer")
	public @ResponseBody Message answer(@RequestBody String securityanswer, @RequestBody int staffid) {
		return indexService.checkSecurity(securityanswer, staffid);
	}

	// �޸�����
	@RequestMapping(method = RequestMethod.POST, value = "password")
	public @ResponseBody Message password(@RequestBody String staffpassword, @RequestBody int staffid) {
		return indexService.modifyPassword(staffpassword, staffid);
	}

	// �������еĲ���
	@RequestMapping(method = RequestMethod.GET, value = "departments")
	public @ResponseBody Message departments() {
		return indexService.allDepartments();
	}

	// ���ص�ǰ��������ְλ
	@RequestMapping(method = RequestMethod.GET, value = "roles")
	public @ResponseBody Message roles(@RequestBody int departmentid) {
		return indexService.allRoles(departmentid);
	}

	// �����б��ѯ
	@RequestMapping(method = RequestMethod.GET, value = "news")
	public @ResponseBody Message news() {
		return indexService.allNews();
	}

}
