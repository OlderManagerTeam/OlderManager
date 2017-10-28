package com.sds.em.service;

import com.sds.em.po.Branch;
import com.sds.em.po.Message;

public interface HeadOfficeService {
	//添加分店
	public Message addBranch(Branch branch) throws Exception;

	// 查询所有分店信息
	public Message getAllBranch() throws Exception;

	// 查看分店的详细信息
	public Message getBranch(int branchid) throws Exception;

	// 返回所有员工
	public Message getAllStaff() throws Exception;

	// 修改分店信息
	public Message updateBranch(Branch branch) throws Exception;
}
