package com.sds.em.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ActionMapper;
import com.sds.em.mapper.ActionrecordMapper;
import com.sds.em.mapper.LectureMapper;
import com.sds.em.mapper.LecturerecordMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldertokenMapper;
import com.sds.em.mapper.VideoMapper;
import com.sds.em.mapper.VideocollectionMapper;
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
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.VideoExample.Criteria;
import com.sds.em.po.Videocollection;
import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;
import com.sds.em.pojo.ActionExtend;
import com.sds.em.pojo.LectureExtend;
import com.sds.em.pojo.VideoExtend;
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
	@Autowired
	OlderbaseMapper olderbaseMapper;
	@Autowired
	ActionMapper actionMapper;
	@Autowired
	ActionrecordMapper actionrecordMapper;
	@Autowired
	VideocollectionMapper videocollectionMapper;


	// // 登录后返回所有的视频(返回课程列表)
	@Override
	public Message allClasses(int olderid,String videopartition) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		List<VideoExtend> videoextendList  = new ArrayList<VideoExtend>();
		List<VideoExtend> videoextendList2  = new ArrayList<VideoExtend>();
		if(!olderbaseList.isEmpty()){//有该老人信息
			List<Video> videocollectionListByOlder = videoMapper.select_videocollection_true(olderbaseList.get(0));
			if(!videocollectionListByOlder.isEmpty()){//有收藏记录
				//加载已收藏的视频
				for(Video v : videocollectionListByOlder){
					VideoExtend videoExtend = new VideoExtend();
					videoExtend.setVideo(v);
					videoExtend.setCollectionStatue("已收藏");
					videoextendList.add(videoExtend);
				}
				//加载没收藏的视频
				List<Video> videofalseList  =  videoMapper.select_videocollection_false(olderbaseList.get(0));
				for(Video b : videofalseList){
					VideoExtend videoExtend = new VideoExtend();
					videoExtend.setVideo(b);
					videoExtend.setCollectionStatue("未收藏");
					videoextendList.add(videoExtend);
				}
				return new Message(true, "返回成功", videoextendList);
			}else{//无收藏记录
				List<Video> videofalseList  =  videoMapper.select_videocollection_false(olderbaseList.get(0));
				for(Video b : videofalseList){
					VideoExtend videoExtend = new VideoExtend();
					videoExtend.setVideo(b);
					videoExtend.setCollectionStatue("未收藏");
					videoextendList.add(videoExtend);
				}
			}
			if(!videoextendList.isEmpty()){//得到所有视频后
				for(VideoExtend ve :videoextendList){
				  	if(ve.getVideo().getVideopartition().equals("健康视频")){
				  		videoextendList2.add(ve);
				  	}else if(ve.getVideo().getVideopartition().equals("讲座回放")){
				  		videoextendList2.add(ve);
				  	}
				}

				return new Message(true, "返回成功", videoextendList2);
			}else {
				return new Message(false, "错误，没有包装进去", null);
			}
		}else{//无该老人信息
			return new Message(false, "数据错误,无该老人信息", null);
		}
		
		
	}
	
	//未登录下的所有视频
	@Override
	public Message allClassesno(String videopartition) {
	
		List<Video> videoList1 = videoMapper.select_video_healthy();
		List<Video> videoList2 = videoMapper.select_video_lecture();
		List<VideoExtend> videoextendList  = new ArrayList<VideoExtend>();
		if (videopartition.equals("健康视频")) {
			for(Video v1:videoList1){
				VideoExtend videoe1 = new VideoExtend();
				videoe1.setVideo(v1);
				videoe1.setCollectionStatue("未登录");
				
				videoextendList.add(videoe1);
			}
			
		} else if (videopartition.equals("讲座回放")) {
			for(Video v2:videoList2){
				VideoExtend videoe2 = new VideoExtend();
				videoe2.setVideo(v2);
				videoe2.setCollectionStatue("未登录");
				videoextendList.add(videoe2);
			}
		}

		if (!videoextendList.isEmpty()) {
			return new Message(true, "返回成功", videoextendList);
		}

		
		return new Message(false, "数据错误", null);
	}

	// 播放热度列表实现
	@Override
	public Message videoHeatTop(int olderid) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		//videocollectionListByOlder为老人收藏过的视频id
		List<Video> videocollectionListByOlder = videoMapper.select_videocollection_true(olderbaseList.get(0));
		List<VideoExtend> videoextendList  = new ArrayList<VideoExtend>();
		if(!olderbaseList.isEmpty()){//老人信息存在
			VideoExample videoExample = new VideoExample();
			videoExample.setOrderByClause("videoheat DESC,videoid DESC");
			List<Video> videoList = videoMapper.selectByExample(videoExample);//得到按热度排序的所有视频
			if (!videoList.isEmpty()) {//热度视频不为空
				for(Video v1 : videoList){
					for(Video v2 : videocollectionListByOlder){//加载已收藏的
						if(v1.getVideoid()==v2.getVideoid()){
							VideoExtend vExtend = new VideoExtend();
							vExtend.setVideo(v1);
							vExtend.setCollectionStatue("已收藏");
							videoextendList.add(vExtend);
						}else{
							VideoExtend vExtend = new VideoExtend();
							vExtend.setVideo(v1);
							vExtend.setCollectionStatue("未登录");
							videoextendList.add(vExtend);
						}
					}
					
				}
				if(!videoextendList.isEmpty()){
					return new Message(true, "返回成功", videoextendList);
				}else{
					return new Message(false, "没有包装到数据", null);
				}
				
			}else{//热度视频为空
				return new Message(false, "热度视频为空", null);
			}
		}else{//老人信息不存在
			return new Message(false, "老人信息不存在", null);
		}
		
	}

	//播放热度列表实现-- 未登录
		@Override
		public Message videoHeatTopNo() {
			VideoExample videoExample = new VideoExample();
			videoExample.setOrderByClause("videoheat DESC,videoid DESC");
			List<Video> videoList = videoMapper.selectByExample(videoExample);//得到按热度排序的所有视频
			List<VideoExtend> videoextendList  = new ArrayList<VideoExtend>();
			if(!videoList.isEmpty()){//有热度视频
				for(Video v:videoList){
					VideoExtend ve = new VideoExtend();
					ve.setVideo(v);
					ve.setCollectionStatue("未登录");
					videoextendList.add(ve);
				}
				if(!videoextendList.isEmpty()){
					return new Message(true, "返回成功", videoextendList);
				}else{
					return new Message(false, "没有包装到数据", null);
				}
			}else{//无热度视频
			return new Message(false, "没有热门视频", null);
			}
		}

	
	// 返回课程（视频）详细
	@Override
	public Message classDetail(int videoId) {

		VideoExample videoExample = new VideoExample();
		Criteria videoCriteria = videoExample.createCriteria();
		videoCriteria.andVideoidEqualTo(videoId);
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		
		if (!videoList.isEmpty()) {
			//找到该视频,将videoheat+1
			int flag1 =0;
			Video video = new Video();
			video.setVideoid(videoList.get(0).getVideoid());
			video.setVideoheat(videoList.get(0).getVideoheat()+1);
			flag1 = videoMapper.updateByPrimaryKey(video);
			if(flag1 !=0){//更新成功
				return new Message(true, "更新数据成功", null);
			}else{
				return new Message(false, "更新数据失败", null);
			}
		}else{
			return new Message(false, "数据错误", null);
		}
		

	}

	// 添加老人观看课程（视频）记录表
	@Override
	public Message classRecord(int olderid, int videoid, Date lrecorddate) {

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

			int videoheat = videoList.get(0).getVideoheat() + 1;

			Video video = new Video();
			video.setVideoid(videoid);
			video.setVideoheat(videoheat);
			videoMapper.updateByPrimaryKey(video);

			return new Message(true, "返回成功", null);
		}

		return new Message(false, "数据错误", null);
	}

	// 返回未登录时的所有讲座
	@Override
	public Message allLectures() {
		LectureExample lectureExample = new LectureExample();
		//按逆序
		lectureExample.setOrderByClause("lectureid DESC,lectureid DESC");
		List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		
		List<LectureExtend> lectureExtendList = new ArrayList<LectureExtend>();
		if (!lectureList.isEmpty()) {
			for(Lecture  l: lectureList){
				LectureExtend extend = new LectureExtend();
				if (l.getLecturepublishdate() == null) {
					extend.setLecture(l);
					extend.setPublishDateStirng("未定");

				} else {
					extend.setLecture(l);
					extend.setPublishDateStirng("有值");
				}
				extend.setJoinStatus("未登录");
				lectureExtendList.add(extend);
			}
			return new Message(true, "返回成功", lectureExtendList);
		}
		return new Message(false, "数据错误", null);
	}

	// 返回登录后的所有讲座
	@Override
	public Message allLectureByolder(int olderid) {
        // 查出该老人所在片区
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria criteria1 = olderbaseExample.createCriteria();
		criteria1.andOlderidEqualTo(olderid);
		//得到该老人信息
		List<Olderbase> olderBaseList = olderbaseMapper.selectByExample(olderbaseExample);
		List<LectureExtend> lectureExtendList = new ArrayList<LectureExtend>();	
		if(!olderBaseList.isEmpty()){//有该老人信息，得到branchid
			int branchid = olderBaseList.get(0).getOlderbranchid();
			
			LectureExample lectureex = new LectureExample();
			com.sds.em.po.LectureExample.Criteria cri = lectureex.createCriteria();
			cri.andLecturebranchidEqualTo(branchid);
			//得到该片区所有讲座
			List<Lecture> lectureListall = lectureMapper.selectByExample(lectureex);
			if(!lectureListall.isEmpty()){//该片区有讲座
				//查询该老人所参加讲座
				List<Lecture> lecturetrueList  =  lectureMapper.selectByOlderJoinTrue(olderBaseList.get(0));
				if(!lecturetrueList.isEmpty()){//有参加讲座记录
					//加载已参加的活动
					for(Lecture l : lecturetrueList){
						LectureExtend lectureExtend = new LectureExtend();
						if (l.getLecturepublishdate() == null) {
							lectureExtend.setLecture(l);
							lectureExtend.setPublishDateStirng("未定");

						} else {
							lectureExtend.setLecture(l);
							lectureExtend.setPublishDateStirng("有值");
						}
						lectureExtend.setJoinStatus("已报名");
						lectureExtendList.add(lectureExtend);
					}
					//加载没参加的讲座
					List<Lecture> lecturefalseList  =  lectureMapper.selectByOlderJoinFalse(olderBaseList.get(0));
					for(Lecture b : lecturefalseList){
						LectureExtend lectureExtend = new LectureExtend();
						if (b.getLecturepublishdate() == null) {
							lectureExtend.setLecture(b);
							lectureExtend.setPublishDateStirng("未定");

						} else {
							lectureExtend.setLecture(b);
							lectureExtend.setPublishDateStirng("有值");
						}
						lectureExtend.setJoinStatus("未报名");
						lectureExtendList.add(lectureExtend);
					}
				}else{//无参加讲座记录
					List<Lecture> lecturefalseList  =  lectureMapper.selectByOlderJoinFalse(olderBaseList.get(0));
					for(Lecture b : lecturefalseList){
						LectureExtend lectureExtend = new LectureExtend();
						if (b.getLecturepublishdate() == null) {
							lectureExtend.setLecture(b);
							lectureExtend.setPublishDateStirng("未定");

						} else {
							lectureExtend.setLecture(b);
							lectureExtend.setPublishDateStirng("有值");
						}
						lectureExtend.setJoinStatus("未报名");
						lectureExtendList.add(lectureExtend);
					}
				}
				if(!lectureExtendList.isEmpty()){
					return new Message(true, "返回成功", lectureExtendList);
				}else {
					return new Message(false, "错误，没有包装进去", null);
				}
			}else{//该片区无讲座
				return new Message(false, "该片区无讲座", null);
			}
			
		}else{//数据错误
			return new Message(false, "数据错误无该老人片区信息", null);
		}
		
	}

	// 某老人报名讲座(参加讲座、将讲座已预约人数修改)(同时修改lectureeEnroll)
	@Override
	public Message joinLecture(int olderid, int lectureid) {
		//判断是否插入lecture表成功
		int flag1 =0;
		Lecturerecord lectureRecord = new Lecturerecord();
		lectureRecord.setLrecordolderid(olderid);
		lectureRecord.setLrecordlectureid(lectureid);
		lectureRecord.setLrecorddate(new Date());
		flag1 = lecturerecordMapper.insert(lectureRecord);
        if(flag1!=0){//插入成功
        	return new Message(true,"报名成功",null);
        } else{
        	return new Message(false,"插入操作失败",null);
        }

	}
	
	// 某老人报名活动（插入活动记录表）
		@Override
		public Message joinAction(int olderid, int actionid) {
			//判断是否插入表成功
			int flag1 = 0;
			// ActionrecordExample actionrecordExample = new ActionrecordExample();
			Actionrecord actionRecord = new Actionrecord();
			
			actionRecord.setArecordolderid(olderid);
			actionRecord.setArecordactionid(actionid);
			actionRecord.setArecorddate(new Date());
			flag1=actionrecordMapper.insert(actionRecord);
			
			if(flag1 !=0){//插入成功
				return new Message(true, "报名成功", null);
			}else{
				return new Message(false, "插入失败", null);
			}
			
			
		}


	// 发布课程
	@Override
	public Message publishVideos(Video video) {
		int flag = 0;
		flag = videoMapper.insert(video);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);

	}

	// 发布讲座
	@Override
	public Message publishLectures(Lecture lecture) {
		int flag = 0;
		flag = lectureMapper.insert(lecture);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);
	}

	// 老人查看自己的课程视频播放记录
	@Override
	public Message videoRecord(int olderid) {
		// 查找老人播放过的videorcord
		VideorecordExample videorecordExample = new VideorecordExample();
		com.sds.em.po.VideorecordExample.Criteria videorecordCriteria = videorecordExample.createCriteria();
		videorecordCriteria.andVrecordolderidEqualTo(olderid);
		// 得到记录表中所有老人的videoid
		List<Videorecord> videorecordList = videorecordMapper.selectByExample(videorecordExample);
		List<VideoExtend> videoExtendList = new ArrayList<VideoExtend>();
		if (!videorecordList.isEmpty()) {
			for(Videorecord v:videorecordList){
				
				VideoExample videoExample = new VideoExample();
				Criteria videoCriteria = videoExample.createCriteria();
				videoCriteria.andVideoidEqualTo(v.getVrecordvideoid());
				List<Video> video = videoMapper.selectByExample(videoExample);
				if(!video.isEmpty()){
					for(Video vd:video){
						VideoExtend videoE  = new VideoExtend();
						videoE.setVideo(vd);
						videoE.setVrecorddate(v.getVrecorddate());
						videoExtendList.add(videoE);
					}
				}
			}
			return new Message(true, "返回成功", videoExtendList);
		}

		return new Message(false, "数据错误", null);
	}

	// 活动发布
	@Override
	public Message publishAction(Action actions) {
		int flag = 0;
		flag = actionMapper.insert(actions);
		if (flag != 0) {
			return new Message(true, "返回成功", null);
		}
		return new Message(false, "数据错误", null);
	}

	// 老人登陆后看到该片区所有活动
	@Override
	public Message allActionsByolder(int olderid) {
		 
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria criteria1 = olderbaseExample.createCriteria();
		criteria1.andOlderidEqualTo(olderid);
		// 得到该老人的信息
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		List<ActionExtend> actionExtendList = new  ArrayList<ActionExtend>();
		if(!olderbaseList.isEmpty()){//有该老人信息，得到branchid
			int branchid = olderbaseList.get(0).getOlderbranchid();
			System.out.println("/////////////////////"+branchid);
			
			ActionExample actionall = new ActionExample();
			com.sds.em.po.ActionExample.Criteria actionCriteriaBybranch = actionall.createCriteria();
			actionCriteriaBybranch.andActionbranchidEqualTo(branchid);
			//得到老人的片区所有活动
			List<Action> actionListBybranch = actionMapper.selectByExample(actionall);
			if(!actionListBybranch.isEmpty()){//该片区有活动
				//查询该老人所参加活动
				List<Action> actiontrueList  =  actionMapper.selectByOlderJoinTrue(olderbaseList.get(0));
				if(!actiontrueList.isEmpty()){//有参加活动记录
					//加载已参加的活动
					for(Action a : actiontrueList){
						ActionExtend actionExtend = new ActionExtend();
						if (a.getActionstartdate() == null) {
							actionExtend.setAction(a);
							actionExtend.setStartDateString("未定");

						} else {
							actionExtend.setAction(a);
							actionExtend.setStartDateString("有值");
						}
						actionExtend.setJionStatuString("已报名");
						actionExtendList.add(actionExtend);
					}
					//加载没参加的活动
					List<Action> actionfalseList  =  actionMapper.selectByOlderJoinFalse(olderbaseList.get(0));
					for(Action b : actionfalseList){
						ActionExtend actionExtend = new ActionExtend();
						if (b.getActionstartdate() == null) {
							actionExtend.setAction(b);
							actionExtend.setStartDateString("未定");

						} else {
							actionExtend.setAction(b);
							actionExtend.setStartDateString("有值");
						}
						actionExtend.setJionStatuString("未报名");
						actionExtendList.add(actionExtend);
					}
				}else{//无活动记录
					List<Action> actionfalseList  =  actionMapper.selectByOlderJoinFalse(olderbaseList.get(0));
					for(Action b : actionfalseList){
						ActionExtend actionExtend = new ActionExtend();
						if (b.getActionstartdate() == null) {
							actionExtend.setAction(b);
							actionExtend.setStartDateString("未定");

						} else {
							actionExtend.setAction(b);
							actionExtend.setStartDateString("有值");
						}
						actionExtend.setJionStatuString("未报名");
						actionExtendList.add(actionExtend);
					}
				}
				if(!actionExtendList.isEmpty()){
					return new Message(true, "返回成功", actionExtendList);
				}else {
					return new Message(false, "错误，没有包装进去", null);
				}
			}else{//该片区无活动
				return new Message(false, "该片区无活动", null);
			}
		}else{
			return new Message(false,"数据错误，没得到老人信息",null);
		}
	}

	// 未登录时显示所有活动
	@Override
	public Message allActions() {
		ActionExample actionExample = new ActionExample();
		actionExample.setOrderByClause("actionid DESC,actionid DESC");
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		List<ActionExtend> actionExtendList = new ArrayList<ActionExtend>();
		if (!actionList.isEmpty()) {
			for(Action  a:actionList){
				ActionExtend extend = new ActionExtend();
				if (a.getActionstartdate() == null) {
					extend.setAction(a);
					extend.setStartDateString("未定");
				} else {
					extend.setAction(a);
					extend.setStartDateString("有值");
				}
				extend.setJionStatuString("未登录");
				actionExtendList.add(extend);
			}
			return new Message(true, "返回成功", actionExtendList);
		}
		return new Message(false, "数据错误", null);
	}

	// 老人参加的活动
	@Override
	public Message olderActions(int olderid) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		if(!olderbaseList.isEmpty()){//有该老人信息
			List<Action> actionListByOlder = actionMapper.slelectOlderActionRecord(olderbaseList.get(0));
			if(!actionListByOlder.isEmpty()){//有参加的活动
				return new Message(true, "返回成功", actionListByOlder);
			}else{//无参加的活动
				return new Message(true, "该老人无参加活动记录", actionListByOlder);
			}
		}else{//无该老人信息
			return new Message(false, "数据错误,无该老人信息", null);
		}
	}

	//老人参加的讲座
		@Override
		public Message olderLectures(int olderid) {
			OlderbaseExample olderbaseExample = new OlderbaseExample();
			com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
			olderbaseC.andOlderidEqualTo(olderid);
			List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
			if(!olderbaseList.isEmpty()){//有该老人信息
				List<Lecture> lectureListByOlder = lectureMapper.slelectOlderLectureRecord(olderbaseList.get(0));
				if(!lectureListByOlder.isEmpty()){//有参加的讲座
					return new Message(true, "返回成功", lectureListByOlder);
				}else{//无参加的讲座
					return new Message(true, "该老人无参加活动记录", lectureListByOlder);
				}
			}else{//无该老人信息
				return new Message(false, "数据错误,无该老人信息", null);
			}
		}

	// 讲座详情
	@Override
	public Message selectLecturedetail(int lectureid) {
		LectureExample lectureExample = new LectureExample();
		com.sds.em.po.LectureExample.Criteria lectureCruteria = lectureExample.createCriteria();
		lectureCruteria.andLectureidEqualTo(lectureid);
		List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		if (!lectureList.isEmpty()) {
			return new Message(true, "返回成功", lectureList.get(0));
		}
		return new Message(false, "数据错误", null);
	}

	// 活动详情
	@Override
	public Message selelctActiondetail(int actionid) {
		ActionExample actionExample = new ActionExample();
		com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
		actionCriteria.andActionidEqualTo(actionid);
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		if (!actionList.isEmpty()) {
			return new Message(true, "返回成功", actionList.get(0));
		}
		return new Message(false, "数据错误", null);
	}

	//得到近期所有活动（按发布时间排序）
	@Override
	public Message getAllNewActions() {
		ActionExample actionExample = new ActionExample();
		actionExample.setOrderByClause("actionstartdate DESC,actionid DESC");
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		
		if(!actionList.isEmpty()){
			return new Message(true,"返回成功",actionList);
		}
		return new Message(false,"数据错误",null);
	}

	//老年人取消参加某活动
	@Override
	public Message deleteActionRecord(int olderid, int actionid) {
		int flag1 = 0;
		ActionrecordExample actionrecordExample = new ActionrecordExample();
		com.sds.em.po.ActionrecordExample.Criteria criteria = actionrecordExample.createCriteria();
		criteria.andArecordolderidEqualTo(olderid);
		criteria.andArecordactionidEqualTo(actionid);
		List<Actionrecord> actionrecordList = actionrecordMapper.selectByExample(actionrecordExample);
		if(!actionrecordList.isEmpty()){//找到该老年人参加某活动的id记录
			flag1 = actionrecordMapper.deleteByExample(actionrecordExample);
			if(flag1 != 0){//删除操作成功
				ActionExample actionExample = new ActionExample();
				com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
				actionCriteria.andActionidEqualTo(actionid);
				List<Action> actionList = actionMapper.selectByExample(actionExample);//得到该活动
				List<ActionExtend> actionExtendList = new ArrayList<ActionExtend>();
				if(!actionList.isEmpty()){//活动不为空
					//包装该活动状态
					for(Action  a:actionList){
						ActionExtend extend = new ActionExtend();
						if (a.getActionstartdate() == null) {
							extend.setAction(a);
							extend.setStartDateString("未定");

						} else {
							extend.setAction(a);
							extend.setStartDateString("有值");
						}
						extend.setJionStatuString("未报名");
						actionExtendList.add(extend);
					}
					return new Message(true,"取消成功",actionExtendList);
				}else{
					return new Message(false,"活动为空",null);
				}
				
			  }else{
				return new Message(false,"删除操作失败",null);
			  }
			}else{
			return new Message(false,"数据错误，无该老人参加的活动记录",null);
		}
	}

	//老年人取消参加某讲座
	@Override
	public Message deleteLectureRecord(int olderid, int lectureid) {
		int flag1 = 0;
		LecturerecordExample lecturecordExample = new LecturerecordExample();
		com.sds.em.po.LecturerecordExample.Criteria criteria = lecturecordExample.createCriteria();
		criteria.andLrecordolderidEqualTo(olderid);
		criteria.andLrecordlectureidEqualTo(lectureid);
		List<Lecturerecord> lecturerecordList = lecturerecordMapper.selectByExample(lecturecordExample);
		if(!lecturerecordList.isEmpty()){//找到该老年人参加某讲座的id记录
			flag1 = lecturerecordMapper.deleteByExample(lecturecordExample);
			if(flag1 != 0){//删除操作成功
				LectureExample lectureExample = new LectureExample();
				com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample.createCriteria();
				lectureCriteria.andLectureidEqualTo(lectureid);
				List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);//得到该讲座
				List<LectureExtend> lectureExtendList = new ArrayList<LectureExtend>();
				if(!lectureList.isEmpty()){//讲座不为空
					//包装该活动状态
					for(Lecture  a:lectureList){
						LectureExtend extend = new LectureExtend();
						if (a.getLecturepublishdate()== null) {
							extend.setLecture(a);;
							extend.setPublishDateStirng("未定");

						} else {
							extend.setLecture(a);
							extend.setPublishDateStirng("有值");
						}
						extend.setJoinStatus("未报名");
						lectureExtendList.add(extend);
					}
					return new Message(true,"取消成功",lectureExtendList);
				}else{
					return new Message(false,"活动为空",null);
				}
			  }else{
				return new Message(false,"删除操作失败",null);
			  }
		}else{
			return new Message(false,"数据错误，无该老人参加的讲座",null);
		}
	}
	//收藏视频（插入视频收藏记录表）
	@Override
	public Message insertVCollectin(int olderid, int videoid) {
		int flag = 0;
		Videocollection videocollection = new Videocollection();
		videocollection.setVideocollevideoid(videoid);
		videocollection.setVideocolledate(new Date());
		flag = videocollectionMapper.insert(videocollection);
		if(flag != 0){//插入成功
			return new Message(true,"收藏成功",null);
			
		}else{//插入失败
			return new Message(false,"数据错误，插入失败",null);
		}
		
	}
	//查看已收藏视频
	@Override
	public Message videoCollectinRecord(int olderid) {
		OlderbaseExample olderbaseExample = new OlderbaseExample();
		com.sds.em.po.OlderbaseExample.Criteria olderbaseC = olderbaseExample.createCriteria();
		olderbaseC.andOlderidEqualTo(olderid);
		List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
		if(!olderbaseList.isEmpty()){//有该老人信息
			List<Video> videocollectionListByOlder = videoMapper.select_videocollection_true(olderbaseList.get(0));
			if(!videocollectionListByOlder.isEmpty()){//有收藏记录
				return new Message(true, "返回成功", videocollectionListByOlder);
			}else{//无收藏记录
				return new Message(true, "该老人无收藏记录", null);
			}
		}else{//无该老人信息
			return new Message(false, "数据错误,无该老人信息", null);
		}
	}
	

	
}