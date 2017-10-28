package com.sds.em.service;

import com.sds.em.po.Branch;
import com.sds.em.po.Message;
import com.sds.em.pojo.BranchStaffBaseExtend;
import com.sds.em.pojo.StaffDepartmentRoleExtend;

public interface HeadOfficeService {
	// 添加分店
	public Message addBranch(Branch branch) throws Exception;

	// 查询所有分店信息
	public Message getAllBranch() throws Exception;

	// 查看分店的详细信息
	public Message getBranch(int branchid) throws Exception;

	// 返回所有员工
	public Message getAllStaff() throws Exception;

	// 修改分店信息
	public Message updateBranch(Branch branch) throws Exception;

	// 判断输入的管理员是否存在员工表中
	public Message judgeStaffCode(String staffcode) throws Exception;

	// 显示一个员工的详细信息
	public Message getStaff(int staffid) throws Exception;

	// 重新分配部门和职位给员工，员工号要改变
	public Message updateStaffD(StaffDepartmentRoleExtend extend) throws Exception;

	// 返回所有的部门号
	public Message getAllDepartmentId() throws Exception;

	//返回所有的职位编号
	public Message getAllRoleId() throws Exception;

	// 根据部门号返回部门名称
	public Message getDepartmentName(int departmentid) throws Exception;

	//显示未分配的老人信息
	public Message getOlder() throws Exception;
	
	//返回所有分店id
	public Message getAllBanchId() throws Exception;
	
	//根据分店id返回分店名和管理员
	public Message getBanch(int branchid) throws Exception;
	

	//分配老人给某个分店
	public Message allotOlder(String  oldertel,int branchid) throws Exception;
	
}
