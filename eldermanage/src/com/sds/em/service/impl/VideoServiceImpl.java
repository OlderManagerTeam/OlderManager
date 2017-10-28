package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.VideoMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.VideoExample.Criteria;
import com.sds.em.service.VideoService;

public class VideoServiceImpl implements VideoService {
	@Autowired
	VideoMapper videoMapper;

	@Override
	public Message entry(Video video) throws Exception {
		try {
			int flag = 0;
			flag = videoMapper.insert(video);
			if (flag != 0) {
				return new Message(true, "插入成功", null);
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
	public Message getAllVideos() throws Exception {
		try {
			VideoExample videoExample = new VideoExample();
			Criteria criteria = videoExample.createCriteria();
			List<Video> videoList = videoMapper.selectByExample(videoExample);
			if (!videoList.isEmpty()) {
				return new Message(true, "返回成功", videoList);
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
	public Message getVideo(int videoid) throws Exception {
		try {
			Video video = videoMapper.selectByPrimaryKey(videoid);
			if (video != null) {
				return new Message(true, "返回成功", video);
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
