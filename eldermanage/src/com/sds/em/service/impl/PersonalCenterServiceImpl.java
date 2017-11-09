package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.DepartmentMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.ShiroroleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Department;
import com.sds.em.po.Message;
import com.sds.em.po.Role;
import com.sds.em.po.ShiroroleExample;
import com.sds.em.po.ShiroroleKey;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.pojo.StaffDepartmentRoleExtend;
import com.sds.em.service.PersonalCenterService;

public class PersonalCenterServiceImpl implements PersonalCenterService {

	@Autowired
	StaffbaseMapper staffbaseMapper;

	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	ShiroroleMapper shiroMapper;

	@Override
	public Message personalMessage(int staffid) throws Exception {

		try {
			Staffbase staff = staffbaseMapper.selectByPrimaryKey(staffid);
			StaffDepartmentRoleExtend extend = new StaffDepartmentRoleExtend();
			Department department = departmentMapper.selectByPrimaryKey(staff.getStaffdepartmentid());
			Role role = roleMapper.selectByPrimaryKey(staff.getStaffroleid());
			if(department==null)
				department=new Department();
			extend.setDepartment(department);
			if(role==null)
				role=new Role();
			extend.setRole(role);
			extend.setStaffbase(staff);
			return new Message(true, "返回成功", extend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message updatePersonalMessage(Staffbase staffbase) throws Exception {
		try {

			int flag = 0;
			flag = staffbaseMapper.updateByPrimaryKeySelective(staffbase);
			if (flag != 0) {
				return new Message(true, "修改成功", null);
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
	//获取权限
	public Message getauthorization(String stafftel) {
		ShiroroleExample shiroroleExample=new ShiroroleExample();
		ShiroroleExample.Criteria shiroroleCriteria=shiroroleExample.createCriteria();
		shiroroleCriteria.andShirotelEqualTo(stafftel);
		List<ShiroroleKey> shirorolelist=shiroMapper.selectByExample(shiroroleExample);
		
		return null;
	}

}
