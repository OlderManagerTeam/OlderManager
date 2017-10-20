package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.News;

/*
 * ��¶
 */
public interface NewsService {
	// ��������
	public Message publishNews(News news);

	// �鿴�ѷ�������
	public Message publishedNews(String newsType);

	// �鿴��������
	public Message newsDetail(int newsId);

	// ɾ������
	public Message deleteNews(int newsId);
	
	//���˵�¼
	public Message olderLogin(String olderTel,String olderPassword);
}
