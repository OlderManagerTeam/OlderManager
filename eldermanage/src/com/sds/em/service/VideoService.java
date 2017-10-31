package com.sds.em.service;

import com.sds.em.po.Message;
import com.sds.em.po.Video;

public interface VideoService {
	// 发布视频
	public Message entry(Video video) throws Exception;

	// 显示所有的视频
	public Message getAllVideos() throws Exception;

	// 显示一个视频的详细信息
	public Message getVideo(int videoid) throws Exception;
	
	// 修改视频信息
	public Message alter(Video video) throws Exception;
}
