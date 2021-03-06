﻿package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.DepartmentMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Department;
import com.sds.em.po.DepartmentExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Role;
import com.sds.em.po.RoleExample;
import com.sds.em.po.RoleExample.Criterion;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.pojo.BranchStaffBaseExtend;
import com.sds.em.pojo.StaffDepartmentRoleExtend;
import com.sds.em.service.HeadOfficeService;

public class HeadOfficeServiceImpl implements HeadOfficeService {

	@Autowired
	BranchMapper branchMapper;

	@Autowired
	StaffbaseMapper staffbaseMapper;
	@Autowired
	DepartmentMapper departmentMapper;

	@Autowired
	RoleMapper roleMapper;

	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Override
	public Message addBranch(Branch branch) throws Exception {
		try {
			int flag = 0;
			branch.setBranchkpi((float) 0);
			if (staffbaseMapper.selectByPrimaryKey(branch.getBranchmanagerid()) != null) {
				BranchExample branchExample = new BranchExample();
				com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();
				criteria.andBranchmanageridEqualTo(branch.getBranchmanagerid());
				if (branchMapper.selectByExample(branchExample).isEmpty()) {

					flag = branchMapper.insert(branch);
					if (flag != 0) {
						return new Message(true, "添加成功", null);
					} else {
						return new Message(false, "数据库错误", null);
					}
				} else {
					return new Message(false, "一个员工只能管理一个分店", null);
				}
			} else {
				return new Message(false, "无可用员工号", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getAllBranch() throws Exception {

		try {
			BranchExample branchExample = new BranchExample();
			com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();
			List<Branch> branchList = branchMapper.selectByExample(branchExample);

			List<BranchStaffBaseExtend> extend = new ArrayList<BranchStaffBaseExtend>();

			for (Branch b : branchList) {
				Staffbase staffbase = staffbaseMapper.selectByPrimaryKey(b.getBranchmanagerid());
				if (staffbase == null)
					staffbase = new Staffbase();
				BranchStaffBaseExtend baseExtend = new BranchStaffBaseExtend();
				baseExtend.setBranch(b);
				baseExtend.setStaffbase(staffbase);
				extend.add(baseExtend);
			}
			if (!extend.isEmpty()) {
				return new Message(true, "返回成功", extend);
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
	public Message getBranch(int branchid) throws Exception {
		try {
			Branch branch = branchMapper.selectByPrimaryKey(branchid);

			Staffbase staffbase = staffbaseMapper.selectByPrimaryKey(branch.getBranchmanagerid());
			BranchStaffBaseExtend baseExtend = new BranchStaffBaseExtend();
			baseExtend.setBranch(branch);
			baseExtend.setStaffbase(staffbase);
			if (baseExtend != null) {
				return new Message(true, "返回成功", baseExtend);
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
	public Message getAllStaff() throws Exception {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			List<Staffbase> staffList = staffbaseMapper.selectByExample(staffbaseExample);
			List<StaffDepartmentRoleExtend> extendList = new ArrayList<StaffDepartmentRoleExtend>();

			for (Staffbase s : staffList) {
				StaffDepartmentRoleExtend extend = new StaffDepartmentRoleExtend();
				Department department = departmentMapper.selectByPrimaryKey(s.getStaffdepartmentid());
				Role role = roleMapper.selectByPrimaryKey(s.getStaffroleid());
				if (department == null)
					department = new Department();
				extend.setDepartment(department);
				if (role == null)
					role = new Role();
				extend.setRole(role);
				extend.setStaffbase(s);
				extendList.add(extend);

			}
			if (!extendList.isEmpty()) {
				return new Message(true, "返回成功", extendList);
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
	public Message updateBranch(Branch branch) throws Exception {
		try {
			int flag = 0;
			if (staffbaseMapper.selectByPrimaryKey(branch.getBranchmanagerid()) != null) {
				BranchExample branchExample = new BranchExample();
				com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();
				criteria.andBranchmanageridEqualTo(branch.getBranchmanagerid());
				if (branchMapper.selectByExample(branchExample).isEmpty()) {
					flag = branchMapper.updateByPrimaryKeySelective(branch);
					if (flag != 0) {
						return new Message(true, "修改成功", null);
					} else {
						return new Message(false, "数据库错误", null);
					}
				} else {
					return new Message(false, "一个员工只能管理一个分店", null);
				}
			}
			else {
				return new Message(false, "无可用员工号", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message judgeStaffCode(String staffcode) throws Exception {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStaffcodeEqualTo(staffcode);

			List<Staffbase> staffList = staffbaseMapper.selectByExample(staffbaseExample);

			if (!staffList.isEmpty()) {
				return new Message(true, "员工存在", staffList.get(0));
			} else {
				return new Message(false, "员工不存在", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message getStaff(int staffid) throws Exception {

		try {
			Staffbase staff = staffbaseMapper.selectByPrimaryKey(staffid);
			StaffDepartmentRoleExtend extend = new StaffDepartmentRoleExtend();
			Department department = departmentMapper.selectByPrimaryKey(staff.getStaffdepartmentid());
			Role role = roleMapper.selectByPrimaryKey(staff.getStaffroleid());

			if (department == null)
				department = new Department();
			if (role == null)
				role = new Role();
			extend.setDepartment(department);
			extend.setRole(role);
			extend.setStaffbase(staff);
			if (extend != null) {
				return new Message(true, "返回成功", extend);
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
	public Message updateStaffD(String staffcode, int roleid, int departmentid, int staffid) throws Exception {
		try {

			Staffbase staffbase = new Staffbase();
			staffbase.setStaffid(staffid);
			staffbase.setStaffcode(staffcode);
			staffbase.setStaffdepartmentid(departmentid);
			staffbase.setStaffroleid(roleid);
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
	public Message getAllDepartmentId() throws Exception {
		try {
			DepartmentExample departmentExample = new DepartmentExample();
			com.sds.em.po.DepartmentExample.Criteria criteria = departmentExample.createCriteria();
			List<Department> department = departmentMapper.selectByExample(departmentExample);
			if (!department.isEmpty()) {
				return new Message(true, "返回成功", department);
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
	public Message getDepartmentName(int departmentid) throws Exception {
		try {
			String departmentName = departmentMapper.selectByPrimaryKey(departmentid).getDepartmentname();
			if (departmentName != null) {
				return new Message(true, "返回成功", departmentName);
			} else {
				return new Message(false, "没有该部门", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message getAllRoleId(int departmentid) throws Exception {
		try {
			RoleExample roleExample = new RoleExample();
			com.sds.em.po.RoleExample.Criteria criteria = roleExample.createCriteria();
			criteria.andDepaertmentidEqualTo(departmentid);
			List<Role> roleList = roleMapper.selectByExample(roleExample);

			if (!roleList.isEmpty()) {
				return new Message(true, "返回成功", roleList);
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
	public Message getOlder() throws Exception {
		try {
			OlderbaseExample olderbaseExample = new OlderbaseExample();
			com.sds.em.po.OlderbaseExample.Criteria criteria = olderbaseExample.createCriteria();
			criteria.andOlderbranchidEqualTo(0);
			List<Olderbase> olderList = olderbaseMapper.selectByExample(olderbaseExample);
			if (!olderList.isEmpty()) {
				return new Message(true, "返回成功", olderList);
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
	public Message getAllBanchId() throws Exception {
		try {
			BranchExample branchExample = new BranchExample();
			com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();

			List<Branch> branch = branchMapper.selectByExample(branchExample);
			if (branch != null) {
				return new Message(true, "返回成功", branch);
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
	public Message getBanch(int branchid) throws Exception {
		try {
			Branch branch = branchMapper.selectByPrimaryKey(branchid);
			Staffbase staffbase = staffbaseMapper.selectByPrimaryKey(branch.getBranchmanagerid());
			BranchStaffBaseExtend extend = new BranchStaffBaseExtend();
			extend.setBranch(branch);
			extend.setStaffbase(staffbase);

			if (extend != null) {
				return new Message(true, "返回成功", extend);
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
	public Message allotOlder(String oldertel, int branchid) throws Exception {
		try {
			OlderbaseExample olderbaseExample1 = new OlderbaseExample();
			com.sds.em.po.OlderbaseExample.Criteria criteria = olderbaseExample1.createCriteria();
			criteria.andOldertelEqualTo(oldertel);

			Olderbase older = olderbaseMapper.selectByExample(olderbaseExample1).get(0);
			older.setOlderbranchid(branchid);

			int flag = 0;

			flag = olderbaseMapper.updateByPrimaryKeySelective(older);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sds.em.service.HeadOfficeService#getStaffcode(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public Message getStaffcode(String staffdepartmentid, String staffroleid) throws Exception {
		StaffbaseExample staffbaseExample;
		int i = 0;
		int count = 0;
		String staffcode = null;
		String departmentid = null;
		switch (staffdepartmentid.length()) {
		case 1: {
			departmentid = "0" + staffdepartmentid;
			break;
		}
		case 2: {
			departmentid = staffdepartmentid;
			break;
		}
		}

		String roleid = null;
		switch (staffroleid.length()) {
		case 1: {
			roleid = "0" + staffroleid;
			break;
		}
		case 2: {
			roleid = staffroleid;
			break;
		}
		}

		Staffbase staffbase = new Staffbase();
		staffbase.setStaffdepartmentid(Integer.parseInt(staffdepartmentid));
		staffbase.setStaffroleid(Integer.parseInt(staffroleid));
		do {
			if (count == 0) {
				staffcode = "001";
			} else {
				switch (String.valueOf(count).length()) {
				case 1: {
					staffcode = "00" + count;
					break;
				}
				case 2: {
					staffcode = "0" + count;
					break;
				}
				}
			}
			staffbaseExample = new StaffbaseExample();
			StaffbaseExample.Criteria staffbaseCriteria = staffbaseExample.createCriteria();
			staffbaseCriteria.andStaffcodeEqualTo(departmentid + roleid + staffcode);
			i++;
			count++;
		} while ((!staffbaseMapper.selectByExample(staffbaseExample).isEmpty()) && i < 999);
		if (i < 999)
			return new Message(true, "返回成功", departmentid + roleid + staffcode);
		return new Message(true, "无可用员工号", null);
	}

}
