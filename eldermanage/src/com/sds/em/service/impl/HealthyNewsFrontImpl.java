/*package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.NewsMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.NewsExample;
import com.sds.em.po.NewsExample.Criteria;
import com.sds.em.po.OldersickExample;
import com.sds.em.service.HealthyNewsFrontService;

public class HealthyNewsFrontImpl implements HealthyNewsFrontService{

	@Autowired
	NewsMapper newsMapper;
	@Autowired
	OldersickMapper oldersickMapper;
	
	//显示所有未登录时的新闻
	@Override
	public Message getAllHealthyNews(String newstype) {
		
		NewsExample newsExample = new NewsExample();
		Criteria newsCriteria = newsExample.createCriteria();
		newsCriteria.andNewstypeEqualTo(newstype);
		List<News> newsList = newsMapper.selectByExample(newsExample);
		if(!newsList.isEmpty()){
			return new Message(true,"返回成功",newsList);
		}
		
		return  new Message(false,"数据错误",null);
	}

	//显示所有登录后的新闻
	@Override
	public Message getAllHealthyNewsByOlder(int olderid) {
		
		OldersickExample oldersickExample = new OldersickExample();
		com.sds.em.po.OldersickExample.Criteria oldersickCriteria = oldersickExample.createCriteria();
		
		return null;
	}

}
*/