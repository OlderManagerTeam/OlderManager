﻿package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.security.MD5Encoder;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.DepartmentMapper;
import com.sds.em.mapper.NewsMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.QuestionMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.SecurityMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.mapper.StafftokenMapper;
import com.sds.em.mapper.VideorecordMapper;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Department;
import com.sds.em.po.DepartmentExample;
import com.sds.em.po.DepartmentExample.Criterion;
import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.NewsExample;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Question;
import com.sds.em.po.QuestionExample;
import com.sds.em.po.Role;
import com.sds.em.po.RoleExample;
import com.sds.em.po.Security;
import com.sds.em.po.SecurityExample;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.Stafftoken;
import com.sds.em.po.Video;
import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;
import com.sds.em.pojo.LoginMassage;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.service.IndexService;
import com.sds.em.util.Md5;
import com.sds.em.util.Uuid;

public class IndexServiceImpl implements IndexService {
	@Autowired
	StafftokenMapper stafftokenMapper;

	@Autowired
	RoleMapper roleMapper;

	Message m;

	@Autowired
	BranchMapper branchMapper;

	@Autowired
	StaffbaseMapper staffbaseMapper;
	StaffbaseExample staffbaseExample = new StaffbaseExample();
	StaffbaseExample.Criteria staffbaseCriteria;

	@Autowired
	SecurityMapper securityMapper;

	@Autowired
	QuestionMapper questionMapper;

	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	NewsMapper newsMapper;

	@Autowired
	OlderbaseMapper olderbaseMapper;
	OlderbaseExample olderbaseExample = new OlderbaseExample();
	OlderbaseExample.Criteria olderbaseCriteria;

	@Autowired
	VideorecordMapper videorecord;
	@Override
	public Message checkStaffName(String staffTel) {// 验证员工电话号码是否可用
		Videorecord video=videorecord.selectByPrimaryKey(1);
		video.getVrecorddate();
		try {
			StaffbaseExample sexample = new StaffbaseExample();
			Criteria scriteria = sexample.createCriteria();
			scriteria.andStafftelEqualTo(staffTel);
			if (staffbaseMapper.selectByExample(sexample).isEmpty())
				return m = new Message(true, "可用手机号码", null);
			return m = new Message(false, "号码已注册", null);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return m = new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message returnSecurities() {// 返回所有问题列表
		try {
			QuestionExample qExample = new QuestionExample();
			com.sds.em.po.QuestionExample.Criteria qCriteria = qExample.createCriteria();
			qCriteria.andQuestioncontentIsNotNull();
			List<Question> l = questionMapper.selectByExample(qExample);
			if (l.isEmpty())
				return new Message(false, "无可用记录", null);
			return new Message(true, "返回成功", l);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return m = new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message signIn(Staffbase staff) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Message login(String staffTel, String staffPassword) {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStafftelEqualTo(staffTel);
			List<Staffbase> staffbaseList = null;
			staffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
			if (!staffbaseList.isEmpty()) {
				Staffbase staffbase = staffbaseList.get(0);

				Stafftoken stafftoken = stafftokenMapper.selectByPrimaryKey(staffbase.getStaffid());
				if (stafftoken != null) {
					if (!staffTel.equals(staffbase.getStafftel())
							|| !Md5.MD5(staffPassword).equals(staffbase.getStaffpassword())) {
						return new Message(false, "登录失败", null);
					} else {

						stafftoken.setStaffid(staffbase.getStaffid());
						stafftoken.setStafftoken(Uuid.getUUID32());
						stafftokenMapper.insert(stafftoken);

						return new Message(true, "登录成功", staffbase);

					}
				} else {
					return new Message(false, "已在异地登录,登录失败", null);
				}
			}
		} catch (Exception e) {
			return new Message(false, "数据库错误", null);
		}
		return new Message(false, "数据库错误", null);
	}

	/**
	 * 
	 */
	@Override
	public Message returnQuestion(String staffTel) {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStafftelEqualTo(staffTel);
			List<Staffbase> StaffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
			if (!StaffbaseList.isEmpty()) {
				int staffId = StaffbaseList.get(0).getStaffid();
				SecurityExample securityExample = new SecurityExample();
				com.sds.em.po.SecurityExample.Criteria criteria2 = securityExample.createCriteria();
				criteria2.andSecuritystaffidEqualTo(staffId);
				List<Security> securityList = securityMapper.selectByExample(securityExample);
				int securityQuestionId = securityList.get(0).getSecurityquestionid();

				QuestionExample qustionExample = new QuestionExample();
				com.sds.em.po.QuestionExample.Criteria criteria3 = qustionExample.createCriteria();
				criteria3.andQuestionidEqualTo(securityQuestionId);
				List<Question> questionList = questionMapper.selectByExample(qustionExample);
				String questionContent = questionList.get(0).getQuestioncontent();

				return new Message(true, "返回成功", questionContent);
			} else {
				return new Message(false, "您输入的号码不存在", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 确认员工答案
	public Message checkSecurity(String securityAnswer, String stafftel) {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStafftelEqualTo(stafftel);
			List<Staffbase> StaffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
			if (!StaffbaseList.isEmpty()) {
				int staffId = StaffbaseList.get(0).getStaffid();
				SecurityExample securityExample = new SecurityExample();
				com.sds.em.po.SecurityExample.Criteria criteria2 = securityExample.createCriteria();
				criteria2.andSecuritystaffidEqualTo(staffId);
				List<Security> securityList = securityMapper.selectByExample(securityExample);
				if (securityAnswer.equals(securityList.get(0).getSecurityanswer())) {
					return new Message(true, "确认用户", null);
				} else {
					return new Message(false, "用户校验失败", null);
				}
			}
			return new Message(false, "用户不存在", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message modifyPassword(String staffpassword, String stafftel, String securityanswer) {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStafftelEqualTo(stafftel);
			List<Staffbase> StaffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
			if (!StaffbaseList.isEmpty()) {
				int staffId = StaffbaseList.get(0).getStaffid();
				SecurityExample securityExample = new SecurityExample();
				com.sds.em.po.SecurityExample.Criteria criteria2 = securityExample.createCriteria();
				criteria2.andSecuritystaffidEqualTo(staffId);
				List<Security> securityList = securityMapper.selectByExample(securityExample);
				if (securityanswer.equals(securityList.get(0).getSecurityanswer())) {
					Staffbase staffbase = new Staffbase();
					staffbase.setStaffid(staffId);
					staffpassword=Md5.MD5(staffpassword);
					staffbase.setStaffpassword(staffpassword);
					int flag = 0;
					flag = staffbaseMapper.updateByPrimaryKeySelective(staffbase);
					if (flag != 0) {
						return new Message(true, "成功修改密码", null);
					} else {
						return new Message(false, "数据库错误", null);
					}
				} else {
					return new Message(false, "用户校验失败", null);
				}
			}
			return new Message(false, "用户不存在", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message allDepartments() {
		try {
			DepartmentExample departmentExample = new DepartmentExample();

			com.sds.em.po.DepartmentExample.Criteria criteria = departmentExample.createCriteria();

			List<Department> departmentList = departmentMapper.selectByExample(departmentExample);

			List<JSONObject> jsonObjectList = new ArrayList<JSONObject>();

			for (Department d : departmentList) {
				JSONObject jsonObject = new JSONObject();
				try {
					jsonObject.put("departmentName", d.getDepartmentname());
					jsonObject.put("departmentId", d.getDepartmentid());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jsonObjectList.add(jsonObject);
			}
			return new Message(true, "返回成功", jsonObjectList.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message allRoles(int departmentId) {
		RoleExample roleExample = new RoleExample();
		com.sds.em.po.RoleExample.Criteria criteria = roleExample.createCriteria();
		// criteria.a
		List<Role> roleList = roleMapper.selectByExample(roleExample);
		return null;
	}

	@Override
	public Message allNews() {
		try {
			NewsExample newsExample = new NewsExample();
			com.sds.em.po.NewsExample.Criteria criteria = newsExample.createCriteria();

			List<News> newsList = newsMapper.selectByExample(newsExample);

			List<JSONObject> jsonObjectList = new ArrayList<JSONObject>();

			for (News n : newsList) {
				JSONObject jsonObject = new JSONObject();
				try {

					jsonObject.put("Newsid", n.getNewsid());
					jsonObject.put("Newstitle", n.getNewstitle());
					jsonObject.put("Newsintro", n.getNewsintro());
					jsonObject.put("Newstype", n.getNewstype());

					jsonObject.put("Newscontent", n.getNewscontent());

					jsonObject.put("Newsimg", n.getNewsimg());
					jsonObject.put("Newseditorid", n.getNewseditorid());
					jsonObject.put("Newsissueddate", n.getNewsissueddate());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jsonObjectList.add(jsonObject);
			}

			return new Message(true, "获取成功", jsonObjectList.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	// wuwenbo 验证员工或老人的账号是否存在
	public Message verificationAccountNumber(String tel) {
		staffbaseExample.clear();
		olderbaseExample.clear();
		staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(tel);
		if (!(staffbaseMapper.selectByExample(staffbaseExample).isEmpty()))
			return new Message(true, "账号存在", null);
		olderbaseCriteria = olderbaseExample.createCriteria();
		olderbaseCriteria.andOldertelEqualTo(tel);
		if (!(olderbaseMapper.selectByExample(olderbaseExample).isEmpty()))
			return new Message(true, "账号存在", null);
		return new Message(false, "账号不存在", null);
	}

	@Override
	// wuwenbo 获得用户信息装到session里
	public LoginMassage getuser(String tel) {
		LoginMassage loginMassage = new LoginMassage();
		olderbaseExample.clear();
		olderbaseCriteria = olderbaseExample.createCriteria();
		olderbaseCriteria.andOldertelEqualTo(tel);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		if (!olderbaseList.isEmpty()) {
			Olderbase olderbase = olderbaseList.get(0);
			loginMassage.setOldername(olderbase.getOldername());
			loginMassage.setOlderid(olderbase.getOlderid());
			loginMassage.setOldertel(olderbase.getOldertel());
			loginMassage.setOlderaddress(olderbase.getOlderaddress());
			loginMassage.setUser("elder");
		}
		staffbaseExample.clear();
		staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(tel);
		List<Staffbase> staffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
		if (!staffbaseList.isEmpty()) {
			Staffbase staffbase = staffbaseList.get(0);
			loginMassage.setStaffid(staffbase.getStaffid());
			loginMassage.setStaffname(staffbase.getStaffname());
			loginMassage.setStafftel(staffbase.getStafftel());
			BranchExample branchExample = new BranchExample();
			BranchExample.Criteria branchExampleCriteria = branchExample.createCriteria();
			branchExampleCriteria.andBranchmanageridEqualTo(staffbase.getStaffid());
			List<Branch> branchList = branchMapper.selectByExample(branchExample);
			loginMassage.setUser("staff");
			if (!(branchList.isEmpty())) {
				Branch branch = branchList.get(0);
				loginMassage.setBranchid(branch.getBranchid());
				loginMassage.setBranchname(branch.getBranchname());
				loginMassage.setUser("branchmanager");
			}
		}
		return loginMassage;
	}

	@Override
	// 员工注册
	public Message staffregister(Staffbase staffbase, Security security) {
		try {
			staffbaseMapper.insertSelective(staffbase);
			security.setSecuritystaffid(staffbase.getStaffid());
			securityMapper.insertSelective(security);
			return new Message(true, "注册成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public boolean usernotregister(String tel) {
		olderbaseExample.clear();
		olderbaseCriteria = olderbaseExample.createCriteria();
		olderbaseCriteria.andOldertelEqualTo(tel);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria criteria = staffbaseExample.createCriteria();
		criteria.andStafftelEqualTo(tel);
		List<Staffbase> staffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
		if (olderbaseList.isEmpty() && staffbaseList.isEmpty())
			return true;
		return false;
	}
}
