package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.NewsMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.NewsExample;
import com.sds.em.po.NewsExample.Criteria;
import com.sds.em.pojo.NewsEditerExtend;
import com.sds.em.pojo.StaffbaseCustom;
import com.sds.em.service.NewsService;

public class NewsServiceImpl implements NewsService {

	@Autowired
	StaffbaseMapper staffbaseMapper;
	@Autowired
	NewsMapper newsMapper;

	@Override
	public Message publishNews(News news) {
		int flag = 0;
		flag = newsMapper.insertSelective(news);
		if (flag != 0) {
			return new Message(true, "发布成功", null);
		}
		return new Message(false, "数据库错误", null);
	}

	@Override
	public Message publishedNews() {
		try {
			NewsExample newsExample = new NewsExample();
			Criteria criteria = newsExample.createCriteria();
			List<News> newsList = newsMapper.selectByExample(newsExample);
			List<NewsEditerExtend> extendList=new ArrayList<NewsEditerExtend>();
			
			for(News n:newsList){
				NewsEditerExtend extend=new NewsEditerExtend();
				String editer=staffbaseMapper.selectByPrimaryKey(n.getNewseditorid()).getStaffname();
				extend.setNews(n);
				extend.setNewsediter(editer);
				extendList.add(extend);
			}
		
			if (!extendList.isEmpty()) {
				return new Message(true, "成功返回", extendList);
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
	public Message newsDetail(int newsId) {
		try {
			News news = newsMapper.selectByPrimaryKey(newsId);
			if (news != null) {
				
				String newsediter=staffbaseMapper.selectByPrimaryKey(news.getNewseditorid()).getStaffname();
				NewsEditerExtend newsCustom=new NewsEditerExtend();
				newsCustom.setNews(news);
				newsCustom.setNewsediter(newsediter);
				return new Message(true, "成功返回", newsCustom);
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
	public Message deleteNews(int newsId) {
		try {
			int flag = 0;
			flag = newsMapper.deleteByPrimaryKey(newsId);
			if (flag != 0) {
				return new Message(true, "成功删除", null);
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
	public Message olderLogin(String olderTel, String olderPassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
