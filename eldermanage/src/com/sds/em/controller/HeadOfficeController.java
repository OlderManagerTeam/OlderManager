package com.sds.em.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sds.em.po.Branch;
import com.sds.em.po.Message;
import com.sds.em.po.Staffbase;
import com.sds.em.pojo.BranchStaffBaseExtend;
import com.sds.em.pojo.StaffDepartmentRoleExtend;
import com.sds.em.service.HeadOfficeService;

/*
 * 作者：刘露
 * 描述：总店管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/headoffice/")
public class HeadOfficeController {
	@Autowired
	HeadOfficeService headOfficeService;

	// 添加分店-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "branch")
	public @ResponseBody Message addBranch(Branch branch) throws Exception {
		return headOfficeService.addBranch(branch);
	}

	// 查询所有分店信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "allbranchs")
	public @ResponseBody Message getAllBranch() throws Exception {
		return headOfficeService.getAllBranch();
	}

	// 查看分店的详细信息-所有完成
	@RequestMapping(method = RequestMethod.GET, value = "branch/info")
	public @ResponseBody Message getBranch(int branchid) throws Exception {
		return headOfficeService.getBranch(branchid);
	}

	// 修改分店信息-所有完成
	@RequestMapping(method = RequestMethod.POST, value = "branch/info")
	public @ResponseBody Message updateBranch(Branch branch) throws Exception {
		return headOfficeService.updateBranch(branch);
	}

	// 判断输入的管理员员工号是否存在员工表中，然后返回员工信息
	@RequestMapping(method = RequestMethod.GET, value = "branch/staff")
	public @ResponseBody Message judgeStaffCode(String staffcode) throws Exception {
		return headOfficeService.judgeStaffCode(staffcode);
	}

	// 返回所有员工信息--所有完成
	@RequestMapping(method = RequestMethod.GET, value = "allstaffs")
	public @ResponseBody Message getAllStaff() throws Exception {
		return headOfficeService.getAllStaff();
	}

	// 显示一个员工的详细信息
	@RequestMapping(method = RequestMethod.GET, value = "staff/info")
	public @ResponseBody Message getStaff(int staffid) throws Exception {
		return headOfficeService.getStaff(staffid);
	}

	// 返回所有的部门号
	@RequestMapping(method = RequestMethod.GET, value = "alldepartmentid")
	public @ResponseBody Message getAllDepartmentId() throws Exception {
		return headOfficeService.getAllDepartmentId();
	}

	// 返回所有的职位编号
	@RequestMapping(method = RequestMethod.GET, value = "allRoleid")
	public @ResponseBody Message getAllRoleId() throws Exception {
		return headOfficeService.getAllRoleId();
	}

	// 根据部门号返回部门名称
	@RequestMapping(method = RequestMethod.GET, value = "department/info")
	public @ResponseBody Message getDepartmentName(int departmentid) throws Exception {
		return headOfficeService.getDepartmentName(departmentid);
	}

	// 重新分配部门和职位给员工，员工号要改变
	@RequestMapping(method = RequestMethod.POST, value = "staff/info")
	public @ResponseBody Message updateStaffD(StaffDepartmentRoleExtend extend) throws Exception {
		return headOfficeService.updateStaffD(extend);
	}

	// 显示未分配的老人信息
	@RequestMapping(method = RequestMethod.GET, value = "older/undis")
	public @ResponseBody Message getOlder() throws Exception {
		return headOfficeService.getOlder();
	}

	// 返回所有分店id
	@RequestMapping(method = RequestMethod.GET, value = "allbranchid")
	public @ResponseBody Message getAllBanchId() throws Exception {
		return headOfficeService.getAllBanchId();
	}

	// 根据分店id返回分店名和管理员
	@RequestMapping(method = RequestMethod.GET, value = "branch")
	public @ResponseBody Message getBanch(int branchid) throws Exception {
		return headOfficeService.getBanch(branchid);
	}

	// 分配老人给某个分店
	@RequestMapping(method = RequestMethod.GET, value = "older/allot")
	public @ResponseBody Message allotOlder(String oldertel, int branchid) throws Exception {
		return headOfficeService.allotOlder(oldertel, branchid);
	}
	
	//返回生成的员工号
	@RequestMapping(method = RequestMethod.GET, value = "staff/staffcode")
	public @ResponseBody Message getStaffcode(String staffdepartmentid,String staffroleid) throws Exception {

		return headOfficeService.getStaffcode(staffdepartmentid,staffroleid);
	}
	
}
