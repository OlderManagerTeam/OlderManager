package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.DepartmentMapper;
import com.sds.em.mapper.RoleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Department;
import com.sds.em.po.DepartmentExample;
import com.sds.em.po.Message;
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

	@Override
	public Message addBranch(Branch branch) throws Exception {
		try {
			int flag = 0;
			flag = branchMapper.insert(branch);
			if (flag != 0) {
				return new Message(true, "添加成功", null);
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
	public Message getAllBranch() throws Exception {

		try {
			BranchExample branchExample = new BranchExample();
			com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();
			List<Branch> branchList = branchMapper.selectByExample(branchExample);

			List<BranchStaffBaseExtend> extend = new ArrayList<BranchStaffBaseExtend>();

			for (Branch b : branchList) {
				Staffbase staffbase = staffbaseMapper.selectByPrimaryKey(b.getBranchmanagerid());
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
				extend.setDepartment(department);
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
			flag = branchMapper.updateByPrimaryKeySelective(branch);
			if (flag != 0) {
				return new Message(true, "修改成功", null);
			} else {
				return new Message(false, "数据库错误", null);
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
	public Message updateStaffD(StaffDepartmentRoleExtend extend) throws Exception {
		try {
			StaffbaseExample staffbaseExample = new StaffbaseExample();
			Criteria criteria = staffbaseExample.createCriteria();
			criteria.andStaffidEqualTo(extend.getStaffbase().getStaffid());

			Staffbase staffbase = new Staffbase();
			staffbase.setStaffcode(extend.getStaffbase().getStaffcode());
			staffbase.setStaffdepartmentid(extend.getStaffbase().getStaffdepartmentid());
			staffbase.setStaffroleid(extend.getStaffbase().getStaffroleid());
			int flag = 0;

			flag = staffbaseMapper.updateByExample(staffbase, staffbaseExample);
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
	public Message getAllRoleId() throws Exception {
		try {
			RoleExample roleExample = new RoleExample();
			com.sds.em.po.RoleExample.Criteria criteria = roleExample.createCriteria();
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

}
