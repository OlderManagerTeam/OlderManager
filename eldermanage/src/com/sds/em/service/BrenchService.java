package com.sds.em.service;

import com.sds.em.po.Action;
import com.sds.em.po.Lecture;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Visited;

public interface BrenchService {
	// 老人基本信息的录入
	public Message addElderInfo(Olderbase olderbase) throws Exception;

	// 老人基本信息的修改
	public Message modifyOlder(Olderbase olderbase) throws Exception;

	// 老人病历信息的录入
	public Message addSicks(Oldersick oldersick) throws Exception;

	// 老人评价

	public Message olderRate(int olderId) throws Exception;

	// 发布活动
	public Message publishAction(Action action) throws Exception;

	// 修改活动
	public Message modifyAction(Action action) throws Exception;

	// 查看本店的所有活动信息
	public Message getAallActions(int actionbranchid) throws Exception;

	// 查看活动的详情信息
	public Message getAction(int actionid) throws Exception;

	// 查找本活动参加的老人信息
	public Message getActionOlder(int actionid) throws Exception;

	// 查询这个管理员所在的分店名
	public Message getBranchName(int staffid) throws Exception;

	// 查询本分店所有老人的基本信息
	public Message getAllElder(int branchid) throws Exception;

	//// 删除某个老人的信息
	public Message deleteANElder(String oldertel) throws Exception;

	// 获取某个老人的信息
	public Message getElder(String oldertel) throws Exception;

	// 查看本老人的所有病历信息
	public Message getOlderAllSick(int olderid) throws Exception;

	// 删除一条老人病历信息
	public Message deleteOlderSick(int sickid) throws Exception;

	// 查看本老人的订单信息
	public Message getOlderAllOrder(int olderid) throws Exception;

	// 给本老人添加回访记录
	public Message andOlderVisited(Visited visited) throws Exception;

	// 查看本老人的所有回访记录信息
	public Message getOlderAllVisited(int olderid) throws Exception;

	// 添加讲座信息
	public Message addLecture(Lecture lecture) throws Exception;

	// 查看本分店的所有讲座信息
	public Message getAllLectures(int branchid) throws Exception;

	// 查看讲座的详细信息
	public Message getLecture(int lectureid) throws Exception;
	
	////修改讲座的状态
	public Message updateStatus(int lectureid,String lecturestatus)throws Exception;

	//删除一条讲座信息
	public Message deleteLecture(int lectureid)throws Exception;
}
