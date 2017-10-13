/*package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.QuestionMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.mapper.StafftokenMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Question;
import com.sds.em.po.QuestionExample;
import com.sds.em.po.Role;
import com.sds.em.po.RoleExample;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.po.Stafftoken;
import com.sds.em.service.StaffService;
import com.sds.em.util.Md5;
import com.sds.em.util.Uuid;

public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffbaseMapper staffbaseMapper;
	@Autowired
	StafftokenMapper stafftokenMapper;
	@Autowired
	QuestionMapper questionMapper;
	@Autowired
	RoleMapper roleMapper;
	
	Message m;

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
	public Message login(String staffTel, String staffPassword){
		try{
		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria criteria = staffbaseExample.createCriteria();
		criteria.andStafftelEqualTo(staffTel);
		List<Staffbase> staffbaseList = null;
		staffbaseList = staffbaseMapper.selectByExample(staffbaseExample);
		if (!staffbaseList.isEmpty()) {
			Staffbase staffbase = staffbaseList.get(0);
			
			Stafftoken stafftoken=stafftokenMapper.selectByPrimaryKey(staffbase.getStaffid());
			 if(stafftoken!=null){
					if (!staffTel.equals(staffbase.getStafftel())
							|| !Md5.MD5(staffPassword).equals(staffbase.getStaffpassword())) {
						 return new Message(false,"登录失败",null);
					}else{
					
						stafftoken.setStaffid(staffbase.getStaffid());
					    stafftoken.setStafftoken(Uuid.getUUID32());
					    stafftokenMapper.insert(stafftoken);
					    
					    return new Message(true,"登录成功",staffbase);
						 
					}     
			 }else{
				 return new Message(false,"已在异地登录,登录失败",null);
			 }
		}
		}catch (Exception e) {
			 return new Message(false,"数据库错误",null);
		}
		return new Message(false,"数据库错误",null);
	}

	@Override
	public Role returnRole(int staffId) {
		RoleExample roleExample=new RoleExample();
		com.sds.em.po.RoleExample.Criteria criteria=roleExample.createCriteria();
		criteria.andRolestaffidEqualTo(staffId);
		return (Role) roleMapper.selectByExample(roleExample);
	}
}
*/