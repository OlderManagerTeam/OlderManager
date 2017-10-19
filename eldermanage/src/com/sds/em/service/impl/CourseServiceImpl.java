package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.LectureMapper;
import com.sds.em.mapper.LecturerecordMapper;
import com.sds.em.mapper.OldertokenMapper;
import com.sds.em.mapper.VideoMapper;
import com.sds.em.mapper.VideorecordMapper;
import com.sds.em.po.Lecture;
import com.sds.em.po.LectureExample;
import com.sds.em.po.Lecturerecord;
import com.sds.em.po.Message;
import com.sds.em.po.Oldertoken;
import com.sds.em.po.OldertokenExample;
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.VideoExample.Criteria;
import com.sds.em.po.Videorecord;
import com.sds.em.service.CourseService;

/**
 * 
 * @author 蔡文艳-2017-10-17
 *
 */
public class CourseServiceImpl implements CourseService {

	@Autowired
	VideoMapper videoMapper;

	@Autowired
	VideorecordMapper videorecordMapper;
	@Autowired
	OldertokenMapper oldertokenMapper;
	@Autowired
	LectureMapper lectureMapper;
	@Autowired
	LecturerecordMapper lecturerecordMapper;

	// 返回所有的课程 返回课程列表
	@Override
	public Message allClasses() {

		VideoExample videoExample = new VideoExample();
		Criteria videoCriteria = videoExample.createCriteria();
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if (!videoList.isEmpty()) {
			return new Message(false, "返回成功", videoList);
		}

		return new Message(false, "数据错误", null);

	}

	//
	// //返回课程视频详细
	// @Override
	// public Message classDetail(int videoId) {
	//
	// VideoExample videoExample = new VideoExample();
	// Criteria videoCriteria = videoExample.createCriteria();
	// videoCriteria.andVideoidEqualTo(videoId);
	// List<Video> videoList = videoMapper.selectByExample(videoExample);
	// if(!videoList.isEmpty()){
	// JSONObject jsonObject = new JSONObject();
	// try {
	// jsonObject.put("videoName", videoList.get(0).getVideoname());
	// jsonObject.put("videoUrl", videoList.get(0).getVideopicurl());
	// jsonObject.put("videoPublishDate",
	// videoList.get(0).getVideopublishdate());
	// jsonObject.put("videoDetail", videoList.get(0).getVideodetail());
	// } catch (JSONException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return new Message(true,"返回成功",videoList.toString());
	// }
	// return new Message(false,"数据错误",null);
	//
	// }
	//

	// 添加老人课程观看记录
	@Override
	public Message classRecord(String olderToken, int videoId, Date vRecordDate) {

		OldertokenExample oldertokenExample = new OldertokenExample();
		com.sds.em.po.OldertokenExample.Criteria olderTokenCriteria = oldertokenExample.createCriteria();
		olderTokenCriteria.andOldertokenEqualTo(olderToken);
		List<Oldertoken> olderTokenList = oldertokenMapper.selectByExample(oldertokenExample);

		// System.out.println("qqqqqqq"+olderTokenList.get(0));
		int olderId = olderTokenList.get(0).getOlderid();

		// VideorecordExample videorecordExample = new VideorecordExample();
		Videorecord videorecord = new Videorecord();
		videorecord.setVrecordvideoid(videoId);
		videorecord.setVrecordolderid(olderId);
		videorecord.setVrecorddate(vRecordDate);

		int flag = videorecordMapper.insert(videorecord);
		if (flag == 1) {
			return new Message(true, "添加成功", null);
		}

		return new Message(false, "数据错误", null);
	}

	// 返回当前讲座
	@Override
	public Message currentLecture() {

		LectureExample lectureExample = new LectureExample();
		com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample.createCriteria();
		List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		List<JSONObject> lectureJsonList = new ArrayList<JSONObject>();

		if (!lectureList.isEmpty()) {
			for (int i = 0; i < lectureList.size(); i++) {
				JSONObject jsonObject = new JSONObject();
				try {
					jsonObject.put("lectureId", lectureList.get(i).getLectureid());
					jsonObject.put("lectureName", lectureList.get(i).getLecturename());
					jsonObject.put("lectureIntro", lectureList.get(i).getLectureintro());
					jsonObject.put("lectureTotal", lectureList.get(i).getLecturetotal());
					jsonObject.put("lecturePublishDate", lectureList.get(i).getLecturepublishdate());
					jsonObject.put("lectureEnroll", lectureList.get(i).getLectureenroll());
					jsonObject.put("lectureAddress", lectureList.get(i).getLectureaddress());
					lectureJsonList.add(jsonObject);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return new Message(true, "返回成功", lectureJsonList.toString());
		}
		return new Message(false, "数据库错误", null);
	}

	// 老人报名参加讲座(更新lectureeEnroll)
	@Override
	public Message joinLecture(String olderToken, int lectureId) {

		OldertokenExample oldertokenExample = new OldertokenExample();
		com.sds.em.po.OldertokenExample.Criteria oldertokenCriteria = oldertokenExample.createCriteria();
		oldertokenCriteria.andOldertokenEqualTo(olderToken);
		List<Oldertoken> olderTokenList = oldertokenMapper.selectByExample(oldertokenExample);
		int olderId = olderTokenList.get(0).getOlderid();

		Lecturerecord record = new Lecturerecord();
		record.setLrecordolderid(olderId);
		record.setLrecorddate(new Date());
		record.setLrecordlectureid(lectureId);
		int flag = lecturerecordMapper.insert(record);
		if (flag == 1) {
			int lectureEnroll = lectureMapper.selectByPrimaryKey(lectureId).getLectureenroll();
			lectureEnroll = lectureEnroll + 1;

			Lecture lecture = new Lecture();
			lecture.setLectureid(lectureId);
			lecture.setLectureenroll(lectureEnroll);

			lectureMapper.updateByPrimaryKeySelective(lecture);
            
			return new Message(true, "成功报名讲座", null);
		}
		return new Message(false, "数据库错误", null);

	}

	
	

}