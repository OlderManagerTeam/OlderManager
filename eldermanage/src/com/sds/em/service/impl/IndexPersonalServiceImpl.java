package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Oldersick;
import com.sds.em.po.OldersickExample;
import com.sds.em.po.OldersickExample.Criteria;
import com.sds.em.service.IndexPersonalService;


public class IndexPersonalServiceImpl implements IndexPersonalService{
	
	@Autowired
	OlderbaseMapper olderbaseMapper;
	@Autowired
	OldersickMapper oldersickMapper;
	
	// 返回老人用户个人基本信息
	@Override
	public Message getOlderInfo(int olderid) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		if(!olderbaseList.isEmpty()){//有老人信息
			return new Message(true,"返回成功",olderbaseList.get(0));
		}else{//无老人信息
			return new Message(false,"",null);
		}
	}

	// 返回老人病例
	@Override
	public Message getOlderSickInfo(int olderid) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		if(!olderbaseList.isEmpty()){//有老人信息
			OldersickExample oldersickExample = new OldersickExample();
			Criteria oldersickCriteria = oldersickExample.createCriteria();
			oldersickCriteria.andSickolderidEqualTo(olderid);
			List<Oldersick> oldersickList = oldersickMapper.selectByExample(oldersickExample);
			if(!oldersickList.isEmpty()){//有病例信息
				
				return new Message(true,"返回成功",oldersickList);
			}else{//无病例信息
				return new Message(true,"无病例信息",null);
			}
			
		}else{//无老人信息
			return new Message(false,"",null);
		}
	}
	
	
  
	
}
