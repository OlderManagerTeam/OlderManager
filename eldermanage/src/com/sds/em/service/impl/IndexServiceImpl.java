package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.DepartmentMapper;
import com.sds.em.mapper.QuestionMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.SecurityMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.mapper.StafftokenMapper;
import com.sds.em.po.Department;
import com.sds.em.po.DepartmentExample;
import com.sds.em.po.DepartmentExample.Criterion;
import com.sds.em.po.Message;
import com.sds.em.po.Question;
import com.sds.em.po.QuestionExample;
import com.sds.em.po.Role;
import com.sds.em.po.RoleExample;
import com.sds.em.po.Security;
import com.sds.em.po.SecurityExample;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.Stafftoken;
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
	StaffbaseMapper staffbaseMapper;

	@Autowired
	SecurityMapper securityMapper;

	@Autowired
	QuestionMapper questionMapper;

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public Message checkStaffName(String staffTel) {// 验证员工电话号码是否可用
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

	@Override
	public Role returnRole(int staffId) {
		RoleExample roleExample = new RoleExample();
		com.sds.em.po.RoleExample.Criteria criteria = roleExample.createCriteria();
		criteria.andRolestaffidEqualTo(staffId);
		return (Role) roleMapper.selectByExample(roleExample);
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
				criteria3.andQuestionEqualTo(securityQuestionId);
				List<Question> questionList = questionMapper.selectByExample(qustionExample);
				String questionContent = questionList.get(0).getQuestioncontent();

				JSONObject jsonObject = new JSONObject();
				try {
					jsonObject.put("questionId", securityQuestionId);
					jsonObject.put("questionContent", questionContent);
					jsonObject.put("staffId", staffId);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return new Message(true, "返回成功", jsonObject.toString());
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
	public Message checkSecurity(String securityAnswer, int staffId) {
		try {
			SecurityExample securityExample = new SecurityExample();
			com.sds.em.po.SecurityExample.Criteria criteria2 = securityExample.createCriteria();
			criteria2.andSecuritystaffidEqualTo(staffId);
			List<Security> securityList = securityMapper.selectByExample(securityExample);
			if (securityAnswer.equals(securityList.get(0).getSecurityanswer())) {
				return new Message(true, ",确认用户", null);
			} else {
				return new Message(false, ",用户校验失败", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message modifyPassword(String staffPassword, int staffId) {
		try {
			Staffbase staffbase = new Staffbase();

			staffbase.setStaffid(staffId);
			staffbase.setStaffpassword(staffPassword);

			int flag = 0;
			flag = staffbaseMapper.updateByPrimaryKeySelective(staffbase);
			if (flag != 0) {
				return new Message(true, ",成功修改密码", null);
			} else {
				return new Message(false, "数据库错误", null);
			}
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

}
