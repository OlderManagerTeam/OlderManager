package com.sds.em.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.Question;
import com.sds.em.po.Security;
import com.sds.em.po.Staffbase;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.service.IndexService;
import com.sds.em.util.DateSimp;
import com.sds.em.util.Md5;

/**
 * 
 * @author wenbowu 吴文波登录注册
 */

@Controller
@RequestMapping("v1/index/person/")
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
	public String login(HttpSession session, String tel, String password,MultipartFile dnf) {
		File dnf1=new File("E:\\ftp\\1.png");
		try {
			dnf.transferTo(dnf1);
		} catch (IllegalStateException | IOException e1) {
			e1.printStackTrace();
			return "上传失败";
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(tel, password);
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "failed";
		}
		return "成功登录";
	}

	// 返回所有问题
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
	public @ResponseBody String news() {
		return "乱码测试";
	}

	//AJAX上传文件测试
	@RequestMapping(method = RequestMethod.DELETE, value = "upload")
	public @ResponseBody Message upload(String username,String accountnum) {
/*		int i = 0;
		int j = 0;
		
		//int k=i+j;
*/		return null;
	}
	
/*	@RequestMapping(method = RequestMethod.PUT, value = "upload")
	public @ResponseBody String put(String username) {
		int i = 0;
		int j = 0;
		
		int k=i+j;
		return username;
	}*/
	
	//首页新闻
	
	
	// wuwenbo 验证员工或老人的账号是否存在
	@RequestMapping(method = RequestMethod.GET, value = "accountnumber")
	public @ResponseBody Message verificationAccountNumber(String tel) {
		return indexService.verificationAccountNumber(tel);
	}
	
	//wuwenbo,用户登录
	@RequestMapping(method = RequestMethod.POST, value = "accountnumber")
	public @ResponseBody Message login(HttpSession session,String tel,String password,boolean isremember,HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		
		
		Cookie cookie=new Cookie("name","wuwenbo");
		cookie.setMaxAge(1000);
		response.addCookie(cookie);
		
		password=Md5.MD5(password);
		UsernamePasswordToken token = new UsernamePasswordToken(tel, password);
		token.setRememberMe(isremember);
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return new Message(false,"登录失败",null);
		}
		LoginMassage loginMassage=indexService.getuser(tel);
		session.setAttribute("oldername", loginMassage.getStaffname());
		session.setAttribute("olderid", loginMassage.getOlderid());
		session.setAttribute("oldertel", loginMassage.getOldertel());
		session.setAttribute("staffid", loginMassage.getStaffid());
		session.setAttribute("staffname", loginMassage.getStaffname());
		session.setAttribute("stafftel", loginMassage.getStafftel());
		session.setAttribute("branchid", loginMassage.getBranchid());
		session.setAttribute("branchname", loginMassage.getBranchname());
		return new Message(true,"登录成功",loginMassage.getUser());
	}
	
	//wuwenbo，用户注销
	@RequestMapping(method = RequestMethod.DELETE, value = "accountnumber")
	public @ResponseBody Message logout(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return new Message(true,"注销成功",null);
	}
	
	//员工注册
	@RequestMapping(method = RequestMethod.POST, value = "staff")
	public @ResponseBody Message staffregister(Staffbase staffbase,Security security,String staffBirthday,
			MultipartFile staffImg) {
		if(indexService.usernotregister(staffbase.getStafftel())){
		try {
			if(!staffBirthday.isEmpty())
			staffbase.setStaffbirthday(DateSimp.simp(staffBirthday));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(!staffImg.isEmpty()){
			String url="/staffimg/";
			String imgpath="E:\\oldermanageresource\\staffimg\\";
			String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
			File file=new File(imgpath+newFileName);
			try {
				staffImg.transferTo(file);
			} catch (IllegalStateException | IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			staffbase.setStaffimg(url+newFileName);
		}
		//日期转换
		//头像
		//验证电话号码是否重复
		//密码转换
		staffbase.setStaffpassword(Md5.MD5(staffbase.getStaffpassword()));
		return indexService.staffregister(staffbase,security);
		}
		return new Message(false,"账号已存在",null);
	}
}
