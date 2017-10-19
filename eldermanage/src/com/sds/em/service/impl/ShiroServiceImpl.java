package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.ShiroroleMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.ShiroroleExample;
import com.sds.em.po.ShiroroleKey;
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
		List<Staffbase> staffbaselist=staffbaseMapper.selectByExample(staffbaseExample);
		OlderbaseExample olderbaseExample=new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseCriteria=olderbaseExample.createCriteria();
		olderbaseCriteria.andOldertelEqualTo(tel);
		List<Olderbase> olderbaselist=olderbaseMapper.selectByExample(olderbaseExample);
		Set<String> roles = new HashSet<String>();
		if(staffbaselist.isEmpty()&&(!olderbaselist.isEmpty())){
			roles.add("elder");
		}else if((!staffbaselist.isEmpty())&&olderbaselist.isEmpty()){
			ShiroroleExample shiroroleExample = new ShiroroleExample();
			com.sds.em.po.ShiroroleExample.Criteria shiroroleCriteria = shiroroleExample.createCriteria();
			shiroroleCriteria
					.andShirotelEqualTo(staffbaselist.get(0).getStafftel());
			ArrayList<ShiroroleKey> shiroroleKeyList=(ArrayList<ShiroroleKey>) shiroroleMapper.selectByExample(shiroroleExample);
			for(ShiroroleKey s:shiroroleKeyList){
				roles.add(s.getShirorole());
			}
		}
		return roles;
	}

	@Override
	public Object getPerson(String tel) {
		StaffbaseExample staffbaseExample = new StaffbaseExample();
		Criteria staffbaseCriteria = staffbaseExample.createCriteria();
		staffbaseCriteria.andStafftelEqualTo(tel);
		List<Staffbase> staffbaselist=staffbaseMapper.selectByExample(staffbaseExample);
		OlderbaseExample olderbaseExample=new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseCriteria=olderbaseExample.createCriteria();
		olderbaseCriteria.andOldertelEqualTo(tel);
		List<Olderbase> olderbaselist=olderbaseMapper.selectByExample(olderbaseExample);
		if((!staffbaselist.isEmpty())&&olderbaselist.isEmpty()){
			return staffbaselist.get(0);
		}
		if(staffbaselist.isEmpty()&&(!olderbaselist.isEmpty())){
			return olderbaselist.get(0);
		}
		return null;
	}
}
