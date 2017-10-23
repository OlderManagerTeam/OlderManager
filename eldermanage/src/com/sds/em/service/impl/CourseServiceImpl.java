package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ActionMapper;
import com.sds.em.mapper.ActionrecordMapper;
import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.LectureMapper;
import com.sds.em.mapper.LecturerecordMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldertokenMapper;
import com.sds.em.mapper.VideoMapper;
import com.sds.em.mapper.VideorecordMapper;
import com.sds.em.po.Action;
import com.sds.em.po.ActionExample;
import com.sds.em.po.Actionrecord;
import com.sds.em.po.ActionrecordExample;
import com.sds.em.po.Lecture;
import com.sds.em.po.LectureExample;
import com.sds.em.po.Lecturerecord;
import com.sds.em.po.LecturerecordExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Oldertoken;
import com.sds.em.po.OldertokenExample;
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.VideoExample.Criteria;
import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;
import com.sds.em.service.CourseService;

/**
 * 
 * @author  蔡文艳-2017-10-17
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
	@Autowired
	BranchMapper branchMapper;
	@Autowired
	OlderbaseMapper olderbaseMapper;
	@Autowired
	ActionMapper actionMapper;
	@Autowired
	ActionrecordMapper actionrecordMapper;

	
	
	// 返回所有课程
	@Override
	public Message allClasses() {

		VideoExample videoExample = new VideoExample();
		Criteria videoCriteria = videoExample.createCriteria();
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if (!videoList.isEmpty()) {
			return new Message(true, "返回成功", videoList);
		}

		return new Message(false, "数据错误", null);

	}

	
	 //返回课程（视频）详细  
	 @Override
	 public Message classDetail(int videoId) {
	
	 VideoExample videoExample = new VideoExample();
	 Criteria videoCriteria = videoExample.createCriteria();
	 videoCriteria.andVideoidEqualTo(videoId);
	 List<Video> videoList = videoMapper.selectByExample(videoExample);
	 if(!videoList.isEmpty()){
		 JSONObject jsonObject = new JSONObject();
	 try {
		 jsonObject.put("videoName", videoList.get(0).getVideoname());
		 jsonObject.put("videoUrl", videoList.get(0).getVideopicurl());
		 jsonObject.put("videoPublishDate",
		 videoList.get(0).getVideopublishdate());
		 jsonObject.put("videoDetail", videoList.get(0).getVideodetail());
	 } catch (JSONException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
	 }
	 	return new Message(true,"返回成功",videoList.toString());
	 }
	 	return new Message(false,"数据错误",null);
	
	 }
	

	// 添加老人观看课程（视频）记录表
	@Override
	public Message classRecord(int olderid,int videoid,Date lrecorddate) {

		Videorecord videorecord = new Videorecord();
		videorecord.setVrecordvideoid(videoid);
		videorecord.setVrecordolderid(olderid);
		videorecord.setVrecorddate(lrecorddate);

		int flag = videorecordMapper.insert(videorecord);
		if (flag == 1) {
			
			VideoExample videoExample = new VideoExample();
			Criteria videoCriteria = videoExample.createCriteria();
			videoCriteria.andVideoidEqualTo(videoid);
			List<Video> videoList = videoMapper.selectByExample(videoExample);
			
			int videoheat=videoList.get(0).getVideoheat()+1;
			
			Video video = new Video();
			video.setVideoid(videoid);
			video.setVideoheat(videoheat);
			videoMapper.updateByPrimaryKey(video);
			
			return new Message(true, "返回成功", null);
		}

		return new Message(false, "数据错误", null);
	}

	//返回未登录时的所有讲座
	@Override
	public Message allLectures() {
		LectureExample lectureExample = new LectureExample();
		 com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample.createCriteria();
		 List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		 if(!lectureList.isEmpty()){
			 return new Message(true,"返回成功",lectureList);
		 }
		return new Message(false,"数据错误",null);
	}
	
//	@Override
//	public Message allLectures(int olderid,int olderbranchid) {
//
////		 LectureExample lectureExample1 = new LectureExample();
////	     com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample1.createCriteria();
////	     
////		if(olderid != ' '){
////		    
////		     lectureCriteria.andLecturebranchidEqualTo(olderbranchid);
////		     List<Lecture> lectureList1 = lectureMapper.selectByExample(lectureExample1);
////		     if(!lectureList1.isEmpty()){
////		     
////		    	 return new Message(true, "返回成功", lectureList1);
////
////		     }
////		     else 
////		    	 return new Message(false, "数据错误", null);
////		}
////		else {
////			List<Lecture> lectureList2 = lectureMapper.selectByExample(lectureExample1);
////		    if(!lectureList2.isEmpty()){
////		     
////	    	     return new Message(true, "返回成功", lectureList2);
////         	  }
////	        else 
////	    	     return new Message(false, "数据错误", null);
////		}
//		
//	}
	
	// 返回登录后的所有讲座
	@Override
	public Message allLectureByolder(int olderid, int olderbranchid) {
		LecturerecordExample lecturerecordExample = new LecturerecordExample();
		com.sds.em.po.LecturerecordExample.Criteria lecturercord = lecturerecordExample.createCriteria();
		lecturercord.andLrecordolderidEqualTo(olderbranchid);
		List<Lecturerecord> recordList = lecturerecordMapper.selectByExample(lecturerecordExample);
		List<Lecture> lectureList =null;
		if(!recordList.isEmpty()){
			for(int i =0 ;i<recordList.size();i++){
				LectureExample lectureExample = new LectureExample();
				 com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample.createCriteria();
				 lectureCriteria.andLectureidEqualTo(recordList.get(i).getLrecordlectureid());
				 List<Lecture> lecture = lectureMapper.selectByExample(lectureExample);
				 lectureList.add(i, lecture.get(0));
			}
			return new Message(true, "返回成功", lectureList);
		}
		return new Message(false, "数据错误", null);
	}

	// 某老人报名讲座(参加讲座、将讲座已预约人数修改)(同时修改lectureeEnroll)
	@Override
	public Message joinLecture(int olderid, int lectureid) {

		Lecturerecord lectureRecord = new Lecturerecord();
		lectureRecord.setLrecordolderid(olderid);
		lectureRecord.setLrecordlectureid(lectureid);
		lectureRecord.setLrecorddate(new Date());
		
		lecturerecordMapper.insert(lectureRecord);
		
		LectureExample lectureExample = new LectureExample();
		com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample.createCriteria();
		lectureCriteria.andLectureidEqualTo(lectureid);
		List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		int lectureenroll =lectureList.get(0).getLectureenroll()+1;
		Lecture lecture = new Lecture();
		lecture.setLectureid(lectureid);
		lecture.setLectureenroll(lectureenroll);
		int flag = lectureMapper.updateByPrimaryKey(lecture);
		if(flag==1){
			return new Message(true, "返回成功", null);
		}
		
		return new Message(false, "数据错误", null);

	}

	//播放热度列表实现
	@Override
	public Message videoHeatTop() {
		
		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause("videoheat DESC,videoid DESC");
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if(!videoList.isEmpty()){
			return new Message(true,"返回成功",videoList);
		}
		
		return new Message(false,"数据错误",null);
	}

	//发布课程
	@Override
	public Message publishVideos(Video video) {
		int flag = 0;
		flag = videoMapper.insert(video);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);
		
	}

	//发布讲座
	@Override
	public Message publishLectures(Lecture lecture) {
		int flag = 0;
		flag = lectureMapper.insert(lecture);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);
	}

	//老人查看自己的课程视频播放记录
	@Override
	public Message videoRecord(int olderid) {
		//查找老人播放过的videorcord
		VideorecordExample videorecordExample = new VideorecordExample();
		com.sds.em.po.VideorecordExample.Criteria videorecordCriteria = videorecordExample.createCriteria();
		videorecordCriteria.andVrecordolderidEqualTo(olderid);
		//得到记录表中所有老人的videoid
		List<Videorecord> videorecordList = videorecordMapper.selectByExample(videorecordExample);
		List<Video> videoList = null;
		if(! videorecordList.isEmpty()){
			for(int i = 0;i<videorecordList.size();i++){
				VideoExample videoExample = new VideoExample();
				Criteria videoCriteria = videoExample.createCriteria();
				videoCriteria.andVideoidEqualTo(videorecordList.get(i).getVrecordvideoid());
				List<Video> video = videoMapper.selectByExample(videoExample);
				videoList.add(i, video.get(0));
			}
			return new Message(true, "返回成功", videoList);
		}
			
		return new Message(false,"数据错误",null);
	}
	
	//活动发布
	@Override
	public Message publishAction(Action actions) {
		int flag = 0;
		flag = actionMapper.insert(actions);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);
	}

	//老人登陆后看到该片区所有活动
	@Override
	public Message allActionsByolder(int olderid, int olderbranchid) {
		ActionExample actionExample = new ActionExample();
		com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
		actionCriteria.andActionbranchidEqualTo(olderbranchid);
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		if(! actionList.isEmpty()){
			return new Message(true,"返回成功",actionList);
		}
		return new Message(false,"数据错误",null);
	}
	
	//所有活动
	@Override
	public Message allActions() {
		ActionExample actionExample = new ActionExample();
		com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		if(! actionList.isEmpty()){
			return new Message(true,"返回成功",actionList);
		}
		return new Message(false,"数据错误",null);
	}
	
	//老人参加过的活动
	@Override
	public Message olderActions(int olderid, int olderbranchid) {
		ActionrecordExample actionrecordExample = new ActionrecordExample();
		com.sds.em.po.ActionrecordExample.Criteria actionrecordCriteria = actionrecordExample.createCriteria();
		actionrecordCriteria.andArecordolderidEqualTo(olderid);
		//得到老人所参加活动的所有活动id
		List<Actionrecord> actionrcordList = actionrecordMapper.selectByExample(actionrecordExample);
		List<Action> actionList = null;
		if(!actionrcordList.isEmpty()){
			for(int i = 0;i<actionrcordList.size();i++){
				ActionExample actionExample = new ActionExample();
				com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
				actionCriteria.andActionidEqualTo(actionrcordList.get(i).getArecordactionid());
				List<Action> list = actionMapper.selectByExample(actionExample);
				actionList.add(i, list.get(0));//将单个action放入actionList
			}
			return new Message(true,"返回成功",actionList);
		}
		
		
		return new Message(false,"数据错误",actionList);
	}

	//插入活动记录表
	@Override
	public Message joinAction(int olderid, int lectureid) {
		
		return null;
	}






	

	
	

}