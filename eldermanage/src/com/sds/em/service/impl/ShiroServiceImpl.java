package com.sds.em.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.ShiroroleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Staffbase;
import com.sds.em.po.StaffbaseExample;
import com.sds.em.po.StaffbaseExample.Criteria;
import com.sds.em.service.ShiroService;

public class ShiroServiceImpl implements ShiroService {

	@Autowired
	StaffbaseMapper staffbaseMapper;
	@Autowired
	OlderbaseMapper olderbaseMapper;
	@Autowired
	ShiroroleMapper shiroroleMapper;

	@Override
	public Set<String> getRoles(String tel) {
		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(tel);
/*		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(tel);
		ShiroroleExample shiroroleExample = new ShiroroleExample();
		com.sds.em.po.ShiroroleExample.Criteria shiroroleCriteria = shiroroleExample.createCriteria();
		shiroroleCriteria
				.andShirorolestaffidEqualTo(staffbaseMapper.selectByExample(staffbaseExample).get(0).getStaffid());
		ArrayList<ShiroroleKey> shiroroleKeyList=(ArrayList<ShiroroleKey>) shiroroleMapper.selectByExample(shiroroleExample);
		Set<String> roles = new HashSet<String>();
		for(ShiroroleKey s:shiroroleKeyList){
			roles.add(s.getShirorole());
		}*/
		return getRoles(null);
	}

	@Override
	public Staffbase getPerson(String stafftel) {
		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(stafftel);
		return staffbaseMapper.selectByExample(staffbaseExample).get(0);
	}

}
