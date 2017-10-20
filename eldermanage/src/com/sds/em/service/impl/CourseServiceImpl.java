package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.LectureMapper;
import com.sds.em.mapper.LecturerecordMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldertokenMapper;
import com.sds.em.mapper.VideoMapper;
import com.sds.em.mapper.VideorecordMapper;
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
import com.sds.em.service.CourseService;

/**
 * 
 * @author ������-2017-10-17
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

	// �������еĿγ� ���ؿγ��б�
	@Override
	public Message allClasses() {

		VideoExample videoExample = new VideoExample();
		Criteria videoCriteria = videoExample.createCriteria();
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if (!videoList.isEmpty()) {
			return new Message(true, "���سɹ�", videoList);
		}

		return new Message(false, "���ݴ���", null);

	}

	
	 //���ؿγ���Ƶ��ϸ
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
	 	return new Message(true,"���سɹ�",videoList.toString());
	 }
	 	return new Message(false,"���ݴ���",null);
	
	 }
	

	// ������˿γ̹ۿ���¼
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
			
			return new Message(true, "��ӳɹ�", null);
		}

		return new Message(false, "���ݴ���", null);
	}

	// ���ص�ǰ����
	@Override
	public Message currentLecture(int olderid,int olderbranchid) {

		 LectureExample lectureExample1 = new LectureExample();
	     com.sds.em.po.LectureExample.Criteria lectureCriteria = lectureExample1.createCriteria();
	     
		if(olderid != ' '){
		    
		     lectureCriteria.andLecturebranchidEqualTo(olderbranchid);
		     List<Lecture> lectureList1 = lectureMapper.selectByExample(lectureExample1);
		     if(!lectureList1.isEmpty()){
		     
		    	 return new Message(true, "���سɹ�", lectureList1);

		     }
		     else 
		    	 return new Message(false, "û�и÷�������", null);
		}
		else {
			List<Lecture> lectureList2 = lectureMapper.selectByExample(lectureExample1);
		    if(!lectureList2.isEmpty()){
		     
	    	     return new Message(true, "���سɹ�", lectureList2);
         	  }
	        else 
	    	     return new Message(false, "���ݴ���", null);
		}
		
	}

	// ���˱����μӽ���(����lectureeEnroll)
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
			return new Message(true, "���سɹ�", null);
		}
		
		return new Message(false, "���ݿ����", null);

	}

	//�����ȶ��б�ʵ��
	@Override
	public Message videoHeatTop() {
		
		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause("videoheat DESC,videoid DESC");
		
		List<Video> videoList = videoMapper.selectByExample(videoExample);
		if(!videoList.isEmpty()){
			return new Message(true,"���سɹ�",videoList);
		}
		
		return new Message(false,"���ݴ���",null);
	}

	//�����γ�
	@Override
	public Message publishVideos(Video video) {
		int flag = 0;
		flag = videoMapper.insert(video);
		if (flag != 0) {
			return new Message(true, "�����ɹ�", null);
		}
		return new Message(false, "���ݿ����", null);
		
	}

	//��������
	@Override
	public Message publishLectures(Lecture lecture) {
		int flag = 0;
		flag = lectureMapper.insert(lecture);
		if (flag != 0) {
			return new Message(true, "�����ɹ�", null);
		}
		return new Message(false, "���ݿ����", null);
	}
	
	

	
	

}