package com.sds.em.service;

import java.util.List;

import com.sds.em.po.Message;
import com.sds.em.po.News;

/*
 * 刘露
 */
public interface NewsService {
	// 发布新闻
	public Message publishNews(News news);

	// 查看已发布新闻
	public Message publishedNews(String newsType);

	// 查看新闻详情
	public Message newsDetail(int newsId);

	// 删除新闻
	public Message deleteNews(int newsId);
	
	//老人登录
	public Message olderLogin(String olderTel,String olderPassword);
}
