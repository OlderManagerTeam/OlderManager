package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.NewsMapper;
import com.sds.em.po.JoingroupExample.Criteria;
import com.sds.em.po.Message;
import com.sds.em.po.News;
import com.sds.em.po.NewsExample;
import com.sds.em.service.NewsFrontService;

public class NewsFrontServiceImpl implements NewsFrontService {

	@Autowired
	NewsMapper newsMapper;

	@Override
	public Message CommonNewsView() throws Exception {
		try {
			List<News> newsList = newsMapper.CommonNewsView();
			if (!newsList.isEmpty()) {
				return new Message(true, "返回成功", newsList);
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
	public Message healthNewsView() throws Exception {
		try {
			List<News> newsList = newsMapper.healthNewsView();
			if (!newsList.isEmpty()) {
				return new Message(true, "返回成功", newsList);
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
	public Message heatNewsView() throws Exception {
		try {
			List<News> newsList = newsMapper.heatNewsView();
			if (!newsList.isEmpty()) {
				return new Message(true, "返回成功", newsList);
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
	public Message NewsView() throws Exception {
		NewsExample newsExample = new NewsExample();
		newsExample.setOrderByClause("`newsIssuedDate` DESC");
		try {
			List<News> newsList = newsMapper.selectByExample(newsExample);
			if (!newsList.isEmpty()) {
				return new Message(true, "返回成功", newsList);
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
	public Message NewsInfo(int newsid) throws Exception {
		try {
			News news = newsMapper.selectByPrimaryKey(newsid);
			if (news != null) {
				return new Message(true, "返回成功", news);
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
