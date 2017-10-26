package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Message;
import com.sds.em.pojo.BranchStaffBaseExtend;
import com.sds.em.service.HeadOfficeService;

public class HeadOfficeServiceImpl implements HeadOfficeService {

	@Autowired
	BranchMapper branchMapper;

	@Autowired
	StaffbaseMapper staffbaseMapper;

	@Override
	public Message addBranch(Branch branch) throws Exception {
		try {
			int flag=0;
			flag=branchMapper.insert(branch);
			if(flag!=0){
				return new Message(true,"添加成功",null);
			}else{
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
				String staffName = staffbaseMapper.selectByPrimaryKey(b.getBranchmanagerid()).getStaffname();
				BranchStaffBaseExtend baseExtend = new BranchStaffBaseExtend();
				baseExtend.setBranch(b);
				baseExtend.setStaffname(staffName);
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
	public Message getAllStaff() throws Exception {
		// TODO Auto-generated method stub
		return null;
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


}
