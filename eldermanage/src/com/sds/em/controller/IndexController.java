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
		Cookie cookie = new Cookie("cookieName", "cookie"); // �½�Cookie
		cookie.setSecure(true);
		cookie.setMaxAge(24 * 60 * 60);// ����һ��
		response.addCookie(cookie); // ������ͻ���
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "news")
	public @ResponseBody Message news() {
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "question")
	public @ResponseBody Message question(String staffTel) {// ��֤Ա���绰�����Ƿ����
		return indexService.returnQuestion(staffTel);
	}

}
