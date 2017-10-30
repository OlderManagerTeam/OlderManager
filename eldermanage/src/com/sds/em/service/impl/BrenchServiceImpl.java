package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ActionMapper;
import com.sds.em.mapper.ActionrecordMapper;
import com.sds.em.mapper.BranchMapper;
import com.sds.em.mapper.LectureMapper;
import com.sds.em.mapper.LecturerecordMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.StaffbaseMapper;
import com.sds.em.mapper.VisitedMapper;
import com.sds.em.po.Action;
import com.sds.em.po.ActionExample;
import com.sds.em.po.Actionrecord;
import com.sds.em.po.ActionrecordExample;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Lecture;
import com.sds.em.po.LectureExample;
import com.sds.em.po.Lecturerecord;
import com.sds.em.po.LecturerecordExample;
import com.sds.em.po.LecturerecordExample.Criterion;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Oldersick;
import com.sds.em.po.OldersickExample;
import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.po.Visited;
import com.sds.em.po.VisitedExample;
import com.sds.em.pojo.ActionRecordOlderExtend;
import com.sds.em.pojo.BranchStaffBaseExtend;
import com.sds.em.po.OrdersExample.Criteria;
import com.sds.em.service.BrenchService;
import com.sds.em.util.DateSimp;
import com.sds.em.util.Md5;

public class BrenchServiceImpl implements BrenchService {
	@Autowired
	LecturerecordMapper lecturerecordMapper;
	
	@Autowired
	OlderbaseMapper oldersbaseMapper;

	@Autowired
	OldersickMapper oldersickMapper;

	@Autowired
	ActionMapper actionMapper;

	@Autowired
	OrdersMapper ordersMapper;

	@Autowired
	BranchMapper branchMapper;

	@Autowired
	VisitedMapper visitedMapper;

	@Autowired
	LectureMapper lectureMapper;

	@Autowired
	ActionrecordMapper actionrecordMapper;
	

	@Override
	public Message addElderInfo(Olderbase olderbase) throws Exception {
		try {
			int flag = 0;
			String pwdMD5 = Md5.MD5(olderbase.getOlderpassword());
			olderbase.setOlderpassword(pwdMD5);
			flag = oldersbaseMapper.insert(olderbase);
			if (flag != 0) {
				return new Message(true, "基本信息录入成功", null);
			} else {
				return new Message(false, "基本信息录入失败", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message addSicks(Oldersick oldersick) {
		try {
			oldersickMapper.insert(oldersick);
			return new Message(true, "病历信息录入成功", oldersick.getSickid());
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message modifyOlder(Olderbase olderbase) {
		try {
			int flag = 0;
			flag = oldersbaseMapper.updateByPrimaryKeySelective(olderbase);
			if (flag != 0) {
				return new Message(true, "基本信息修改成功", null);
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
	public Message olderRate(int olderId) throws Exception {
		try {
			List<JSONObject> jsonObjectList = new ArrayList();
			OrdersExample ordersExample = new OrdersExample();
			Criteria criteria = ordersExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderId);
			List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);

			for (Orders o : ordersList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("orderDate", o.getOrderdate());
				jsonObject.put("orderTotal", o.getOrdertotal());
				jsonObjectList.add(jsonObject);
			}

			Olderbase olderbase = oldersbaseMapper.selectByPrimaryKey(olderId);

			ActionExample actionExample = new ActionExample();
			com.sds.em.po.ActionExample.Criteria criteria2 = actionExample.createCriteria();
			criteria2.andActionbranchidEqualTo(olderbase.getOlderbranchid());

			List<Action> actionList = actionMapper.selectByExample(actionExample);

			for (Action a : actionList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("actionName", a.getActionname());
				jsonObject.put("actionStartDate", a.getActionstartdate());
				jsonObjectList.add(jsonObject);
			}

			OldersickExample oldersickExample = new OldersickExample();
			com.sds.em.po.OldersickExample.Criteria criteria3 = oldersickExample.createCriteria();
			criteria3.andSickolderidEqualTo(olderId);

			List<Oldersick> olderSickList = oldersickMapper.selectByExample(oldersickExample);

			for (Oldersick o : olderSickList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("sickDate", o.getSickdate());
				jsonObject.put("sickInfo", o.getSickinfo());
				jsonObjectList.add(jsonObject);

			}
			return new Message(true, "返回成功", jsonObjectList.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message publishAction(Action action) throws Exception {
		try {
			int flag = 0;
			flag = actionMapper.insert(action);
			if (flag != 0) {
				return new Message(true, "发布成功", null);
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
	public Message modifyAction(Action action) throws Exception {
		try {
			int flag = 0;
			flag = actionMapper.updateByPrimaryKeySelective(action);
			if (flag != 0) {
				return new Message(true, "修改成功", null);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getAallActions(int actionbranchid) throws Exception {
		try {
			ActionExample actionExample = new ActionExample();
			com.sds.em.po.ActionExample.Criteria criteria = actionExample.createCriteria();
			criteria.andActionbranchidEqualTo(actionbranchid);
			List<Action> actionList = actionMapper.selectByExample(actionExample);
			if (!actionList.isEmpty()) {
				return new Message(true, "返回成功", actionList);
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
	public Message getAction(int actionid) throws Exception {
		try {
			Action action = actionMapper.selectByPrimaryKey(actionid);
			if (action != null) {
				return new Message(true, "返回成功", action);
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
	public Message getActionOlder(int actionid) throws Exception {
		try {
			ActionrecordExample actionrecordExample = new ActionrecordExample();
			com.sds.em.po.ActionrecordExample.Criteria criteria = actionrecordExample.createCriteria();
			criteria.andArecordactionidEqualTo(actionid);

			List<Actionrecord> actionRecordList = actionrecordMapper.selectByExample(actionrecordExample);

			List<ActionRecordOlderExtend> extend = new ArrayList<ActionRecordOlderExtend>();

			for (Actionrecord a : actionRecordList) {
				Olderbase olderbase = oldersbaseMapper.selectByPrimaryKey(a.getArecordolderid());
				ActionRecordOlderExtend aroe = new ActionRecordOlderExtend();
				aroe.setOlderbase(olderbase);
				aroe.setArecorddate(a.getArecorddate());
				extend.add(aroe);
			}

			if (!extend.isEmpty()) {
				return new Message(true, "返回成功", extend);
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
	public Message getLectureOlder(int lectureid) throws Exception {
		return null;
/*		try {
			lecturerecordMapper
			
			
			}

			if (!extend.isEmpty()) {
				return new Message(true, "返回成功", extend);
			} else {
				return new Message(false, "数据库错误", null);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);

		}*/

	}

	@Override
	public Message getBranchName(int staffid) throws Exception {
		try {
			BranchExample branchExample = new BranchExample();
			com.sds.em.po.BranchExample.Criteria criteria = branchExample.createCriteria();
			criteria.andBranchmanageridEqualTo(staffid);
			List<Branch> branchList = branchMapper.selectByExample(branchExample);
			if (!branchList.isEmpty()) {
				return new Message(true, "返回成功", branchList.get(0).getBranchname());
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
	public Message getAllElder(int branchid) throws Exception {
		try {
			OlderbaseExample olderbaseExample = new OlderbaseExample();

			com.sds.em.po.OlderbaseExample.Criteria criteria = olderbaseExample.createCriteria();
			criteria.andOlderbranchidEqualTo(branchid);

			List<Olderbase> olderbasesList = oldersbaseMapper.selectByExample(olderbaseExample);

			if (!olderbasesList.isEmpty()) {
				List<Integer> olderAgeList = new ArrayList<Integer>();
				for (Olderbase o : olderbasesList) {
					String olderAgeS = DateSimp.simpToSting(o.getOlderbirthday());
					int olderAgeD = DateSimp.getAgeFromBirthTime(olderAgeS);
					olderAgeList.add(olderAgeD);
				}
				List<JSONObject> jsonObjectList = new ArrayList();
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("olderbasesList", olderbasesList);
				// jsonObject.put("olderAgeList", olderAgeList);

				jsonObjectList.add(jsonObject);
				return new Message(true, "返回成功", olderbasesList);
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
	public Message deleteANElder(String oldertel) throws Exception {
		try {
			// 先找到所对应的olderId
			OlderbaseExample olderbaseExample = new OlderbaseExample();
			com.sds.em.po.OlderbaseExample.Criteria criteria = olderbaseExample.createCriteria();
			criteria.andOldertelEqualTo(oldertel);
			List<Olderbase> olderbasesList = oldersbaseMapper.selectByExample(olderbaseExample);

			if (!olderbasesList.isEmpty()) {
				// 将其中的分店设置为null
				int flag = 0;
				Olderbase olderbase = new Olderbase();
				olderbase.setOlderid(olderbasesList.get(0).getOlderid());
				olderbase.setOlderbranchid(0);
				flag = oldersbaseMapper.updateByPrimaryKeySelective(olderbase);
				if (flag != 0) {
					return new Message(true, "删除成功", null);
				}
			}
			return new Message(false, "数据库错误", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getElder(String oldertel) throws Exception {
		try {
			OlderbaseExample olderbaseExample = new OlderbaseExample();

			com.sds.em.po.OlderbaseExample.Criteria criteria = olderbaseExample.createCriteria();
			criteria.andOldertelEqualTo(oldertel);

			List<Olderbase> olderbaseList = oldersbaseMapper.selectByExample(olderbaseExample);
			if (!olderbaseList.isEmpty()) {
				return new Message(true, "获取成功", olderbaseList.get(0));
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
	public Message getOlderAllSick(int olderid) throws Exception {
		try {
			OldersickExample oldersickExample = new OldersickExample();
			com.sds.em.po.OldersickExample.Criteria criteria = oldersickExample.createCriteria();
			criteria.andSickolderidEqualTo(olderid);
			List<Oldersick> olderSickList = oldersickMapper.selectByExample(oldersickExample);
			/*
			 * List<String> sickDataSList = new ArrayList<String>(); for
			 * (Oldersick o : olderSickList) { //o.getSickdate().toString();
			 * String sickDataS = DateSimp.simpToSting(o.getSickdate());
			 * sickDataSList.add(sickDataS); } JSONObject jsonObject = new
			 * JSONObject(); jsonObject.put("olderSickList", olderSickList);
			 * jsonObject.put("sickDataSList", sickDataSList);
			 */
			if (!olderSickList.isEmpty()) {
				return new Message(true, "返回成功", olderSickList);
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
	public Message deleteOlderSick(int sickid) throws Exception {
		try {
			int flag = 0;
			flag = oldersickMapper.deleteByPrimaryKey(sickid);
			if (flag != 0) {
				return new Message(true, "删除成功", null);
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
	public Message getOlderAllOrder(int olderid) throws Exception {
		try {
			OrdersExample orderExample = new OrdersExample();
			Criteria criteria = orderExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderid);
			List<Orders> orderList = ordersMapper.selectByExample(orderExample);
			if (!orderList.isEmpty()) {
				return new Message(true, "返回成功", orderList);
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
	public Message andOlderVisited(Visited visited) throws Exception {
		try {
			int flag = 0;
			flag = visitedMapper.insert(visited);
			if (flag != 0) {
				return new Message(true, "添加成功", null);
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
	public Message getOlderAllVisited(int olderid) throws Exception {
		try {
			VisitedExample visitedExample = new VisitedExample();

			com.sds.em.po.VisitedExample.Criteria criteria = visitedExample.createCriteria();
			criteria.andVisitedolderidEqualTo(olderid);
			List<Visited> visitedList = visitedMapper.selectByExample(visitedExample);
			if (!visitedList.isEmpty()) {
				return new Message(true, "返回成功", visitedList);
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
	public Message addLecture(Lecture lecture) throws Exception {
		try {
			int flag = 0;
			flag = lectureMapper.insert(lecture);
			if (flag != 0) {
				return new Message(true, "添加成功", null);
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
	public Message getAllLectures(int branchid) throws Exception {
		try {
			LectureExample lectureExample = new LectureExample();
			com.sds.em.po.LectureExample.Criteria criteria = lectureExample.createCriteria();
			criteria.andLecturebranchidEqualTo(branchid);

			List<Lecture> lectureList = lectureMapper.selectByExample(lectureExample);
			if (!lectureList.isEmpty()) {

				return new Message(true, "返回成功", lectureList);
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
	public Message getLecture(int lectureid) throws Exception {

		try {
			Lecture lecture = new Lecture();
			lecture = lectureMapper.selectByPrimaryKey(lectureid);
			if (lecture != null) {
				return new Message(true, "返回成功", lecture);
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
	public Message updateStatus(int lectureid, String lecturestatus) throws Exception {

		try {
			LectureExample lectureExample = new LectureExample();
			com.sds.em.po.LectureExample.Criteria criteria = lectureExample.createCriteria();
			criteria.andLectureidEqualTo(lectureid);
			int flag = 0;
			Lecture lecture = new Lecture();
			lecture.setLecturestatus(lecturestatus);
			flag = lectureMapper.updateByExampleSelective(lecture, lectureExample);

			if (flag != 0) {
				return new Message(true, "修改成功", null);
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
	public Message deleteLecture(int lectureid) throws Exception {
		try {
			int flag = 0;
			flag = lectureMapper.deleteByPrimaryKey(lectureid);
			if (flag != 0) {
				return new Message(true, "删除成功", null);
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
