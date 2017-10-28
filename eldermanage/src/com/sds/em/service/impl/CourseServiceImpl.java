package com.sds.em.service.impl;

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
import com.sds.em.po.Video;
import com.sds.em.po.VideoExample;
import com.sds.em.po.VideoExample.Criteria;
import com.sds.em.po.Videorecord;
import com.sds.em.po.VideorecordExample;
import com.sds.em.pojo.ActionExtend;
import com.sds.em.pojo.LectureExtend;
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

	// 查询所有的视频(返回课程列表)

	@Override
	public Message allClasses(String videopartition) {
		List<Video> videoList = null;
		// VideoExample videoExample = new VideoExample();
		// videoExample.setOrderByClause("videoid DESC,videoheat DESC");
		// Criteria videoCriteria = videoExample.createCriteria();
		// videoCriteria.andVideopartitionEqualTo(videopartition);
		//
		// List<Video> videoList = videoMapper.selectByExample(videoExample);
		// videopartition="健康视频";
		if (videopartition.equals("健康视频")) {
			videoList = videoMapper.select_video_healthy();
		} else if (videopartition.equals("讲座回放")) {
			videoList = videoMapper.select_video_lecture();
		}

		if (!videoList.isEmpty()) {
			return new Message(true, "返回成功", videoList);
		}

		return new Message(false, "数据错误", null);
	}

	// 返回课程（视频）详细
	@Override
	public Message classDetail(int videoId) {

		VideoExample videoExample = new VideoExample();
		Criteria videoCriteria = videoExample.createCriteria();
		videoCriteria.andVideoidEqualTo(videoId);
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if (!videoList.isEmpty()) {
			JSONObject jsonObject = new JSONObject();
			try {
				jsonObject.put("videoName", videoList.get(0).getVideoname());
				jsonObject.put("videoUrl", videoList.get(0).getVideopicurl());
				jsonObject.put("videoPublishDate", videoList.get(0).getVideopublishdate());
				jsonObject.put("videoDetail", videoList.get(0).getVideodetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new Message(true, "返回成功", videoList.toString());
		}
		return new Message(false, "数据错误", null);

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
		List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
		
		List<LectureExtend> lectureExtendList = new ArrayList<LectureExtend>();
		if (!lectureList.isEmpty()) {
			for(Lecture  l: lectureList){
				LectureExtend extend = new LectureExtend();
				if (l.getLecturepublishdate() == null) {
					extend.setLecture(l);
					extend.setPublishDateStirng("未定");

				} else {
					extend.setPublishDateStirng("有值");
				}
				extend.setJoinStatus("QQ");
				lectureExtendList.add(extend);
			}
			return new Message(true, "返回成功", lectureExtendList);
		}
		return new Message(false, "数据错误", null);
	}

	// 返回登录后的所有讲座
	@Override
	public Message allLectureByolder(int olderid) {
     
		// 判断该老人是否有参加讲座的记录（参加过的话，将改状态传至前端，更改已参加）
		LecturerecordExample lecturerecordExample = new LecturerecordExample();
		com.sds.em.po.LecturerecordExample.Criteria lecturercordCriteria = lecturerecordExample.createCriteria();
		lecturercordCriteria.andLrecordolderidEqualTo(olderid);
		// 得到老人参加过的讲座id
		List<Lecturerecord> recordListByOlder = lecturerecordMapper.selectByExample(lecturerecordExample);
		
		List<LectureExtend> lectureExtendList = new ArrayList<LectureExtend>();
		if (!recordListByOlder.isEmpty()) {//表明老人有参加的讲座
			for (Lecturerecord l : recordListByOlder) {
				LectureExample lectureExampleTrue = new LectureExample();
				com.sds.em.po.LectureExample.Criteria lectureCriteriaTrue = lectureExampleTrue.createCriteria();
				lectureCriteriaTrue.andLectureidEqualTo(l.getLrecordlectureid());
				List<Lecture> lectureListTrue = lectureMapper.selectByExample(lectureExampleTrue);
				if (!lectureListTrue.isEmpty()) {
					for (Lecture e : lectureListTrue) {
						LectureExtend extend = new LectureExtend();
						System.out.println(e.getLectureid());
						if (e.getLecturepublishdate() == null) {
							extend.setLecture(e);
							extend.setPublishDateStirng("未定");

						} else {
							extend.setPublishDateStirng("有值");
						}
						extend.setJoinStatus("已报名");
						lectureExtendList.add(extend);
					}

				}
				lectureExampleTrue.clear();
				
               //查找老人参加过的讲座之外的lectureid
				LectureExample lectureExampleFalse = new LectureExample();
				com.sds.em.po.LectureExample.Criteria lectureCriteriaFalse = lectureExampleFalse.createCriteria();
				lectureCriteriaFalse.andLectureidNotEqualTo(l.getLrecordlectureid());
			    //老人没有参加过得讲座List
				List<Lecture> lectureListFalse = lectureMapper.selectByExample(lectureExampleFalse);

				if (!lectureListFalse.isEmpty()) {
					for (Lecture e : lectureListFalse) {
						LectureExtend extend = new LectureExtend();
						System.out.println(e.getLectureid());
						if (e.getLecturepublishdate() == null) {
							extend.setLecture(e);
							extend.setPublishDateStirng("未定");

						} else {
							extend.setPublishDateStirng("有值");
						}
						extend.setJoinStatus("未报名");
						lectureExtendList.add(extend);
					}

				}
				if (!lectureExtendList.isEmpty()) {
					return new Message(true, "返回成功", lectureExtendList);

				} else {
					return new Message(false, "数据错误", null);
				}

			}
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
		int lectureenroll = lectureList.get(0).getLectureenroll() + 1;
		Lecture lecture = new Lecture();
		lecture.setLectureid(lectureid);
		lecture.setLectureenroll(lectureenroll);
		int flag = lectureMapper.updateByPrimaryKey(lecture);
		if (flag == 1) {
			return new Message(true, "返回成功", null);
		}

		return new Message(false, "数据错误", null);

	}

	// 播放热度列表实现
	@Override
	public Message videoHeatTop() {

		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause("videoheat DESC,videoid DESC");
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if (!videoList.isEmpty()) {
			return new Message(true, "返回成功", videoList);
		}

		return new Message(false, "数据错误", null);
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
		List<Video> videoList = null;
		if (!videorecordList.isEmpty()) {
			for (int i = 0; i < videorecordList.size(); i++) {
				VideoExample videoExample = new VideoExample();
				Criteria videoCriteria = videoExample.createCriteria();
				videoCriteria.andVideoidEqualTo(videorecordList.get(i).getVrecordvideoid());
				List<Video> video = videoMapper.selectByExample(videoExample);
				videoList.add(i, video.get(0));
			}
			return new Message(true, "返回成功", videoList);
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
		ActionrecordExample actionrecordExample = new ActionrecordExample();
		com.sds.em.po.ActionrecordExample.Criteria recordCriteria = actionrecordExample.createCriteria();
		recordCriteria.andArecordolderidEqualTo(olderid);
		//得到老人报名的活动
		List<Actionrecord> recordListByolder = actionrecordMapper.selectByExample(actionrecordExample);
		
		List<ActionExtend> actionExtendList = new  ArrayList<ActionExtend>();
		if(!recordListByolder.isEmpty()){//表明老人有参加的活动
			for(Actionrecord a : recordListByolder){
				ActionExample actionExampletrue = new ActionExample();
				com.sds.em.po.ActionExample.Criteria actionCriteria = actionExampletrue.createCriteria();
				actionCriteria.andActionidEqualTo(a.getArecordactionid());
				List<Action> actiontrue = actionMapper.selectByExample(actionExampletrue);
				
				if (!actiontrue.isEmpty()) {
					ActionExtend actionExtend = new ActionExtend();
					for (Action aa : actiontrue) {
						if (aa.getActionstartdate() == null) {
							actionExtend.setAction(aa);
							actionExtend.setStartDate("未定");
						} else {
							actionExtend.setStartDate("有值");
						}
						actionExtend.setJionStatu("您已报名");
						actionExtendList.add(actionExtend);
					}
				}
				//老人无参加的活动
				ActionExample actionExamplefalse = new ActionExample();
				com.sds.em.po.ActionExample.Criteria criteriafalse = actionExamplefalse.createCriteria();
				criteriafalse.andActionidNotEqualTo(a.getArecordid());
				List<Action> actionFalse = actionMapper.selectByExample(actionExamplefalse);
				if (!actionFalse.isEmpty()) {
					for (Action aa : actionFalse) {
						ActionExtend actionExtend = new ActionExtend();
						if (aa.getActionstartdate() == null) {
							actionExtend.setAction(aa);
							actionExtend.setStartDate("未定");

						} else {
							actionExtend.setStartDate("有值");
						}
						actionExtend.setJionStatu("您已报名");
						actionExtendList.add(actionExtend);
					}
				}
				if(!actionExtendList.isEmpty()){
					return new Message(true, "返回成功", actionExtendList);
				}else {
					return new Message(false, "数据错误", null);
				}
			}
		} 
		return new Message(false, "数据错误", null);
	}

	// 未登录时显示所有活动
	@Override
	public Message allActions() {
		ActionExample actionExample = new ActionExample();
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		
		if (!actionList.isEmpty()) {
			
			
			return new Message(true, "返回成功", actionList);
		}
		return new Message(false, "数据错误", null);
	}

	// 老人参加过的活动
	@Override
	public Message olderActions(int olderid, int olderbranchid) {
		ActionrecordExample actionrecordExample = new ActionrecordExample();
		com.sds.em.po.ActionrecordExample.Criteria actionrecordCriteria = actionrecordExample.createCriteria();
		actionrecordCriteria.andArecordolderidEqualTo(olderid);
		// 得到老人所参加活动的所有活动id
		List<Actionrecord> actionrcordList = actionrecordMapper.selectByExample(actionrecordExample);
		List<Action> actionList = null;
		if (!actionrcordList.isEmpty()) {
			for (int i = 0; i < actionrcordList.size(); i++) {
				ActionExample actionExample = new ActionExample();
				com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
				actionCriteria.andActionidEqualTo(actionrcordList.get(i).getArecordactionid());
				List<Action> list = actionMapper.selectByExample(actionExample);
				actionList.add(i, list.get(0));// 将单个action放入actionList
			}
			return new Message(true, "返回成功", actionList);
		}

		return new Message(false, "数据错误", null);
	}

	// 插入活动记录表
	@Override
	public Message joinAction(int olderid, int actionid) {
		// ActionrecordExample actionrecordExample = new ActionrecordExample();
		Actionrecord actionRecord = new Actionrecord();
		actionRecord.setArecordolderid(olderid);
		actionRecord.setArecordactionid(actionid);
		actionRecord.setArecorddate(new Date());
		actionrecordMapper.insert(actionRecord);

		ActionExample actionExample = new ActionExample();
		com.sds.em.po.ActionExample.Criteria actionCriteria = actionExample.createCriteria();
		actionCriteria.andActionidEqualTo(actionid);
		List<Action> actionList = actionMapper.selectByExample(actionExample);
		Action action = new Action();
		action.setActionid(actionid);
		action.setActionenroll(actionList.get(0).getActionenroll() + 1);
		int flag = actionMapper.updateByPrimaryKey(action);
		if (flag == 1) {
			return new Message(true, "添加修改成功", null);
		}

		return new Message(false, "添加失败", null);
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



}