package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ActionMapper;

import com.sds.em.mapper.BranchMapper;

import com.sds.em.mapper.BranchMapper;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldersickMapper;
import com.sds.em.mapper.OrderMapper;
import com.sds.em.po.Action;
import com.sds.em.po.ActionExample;
import com.sds.em.po.Branch;
import com.sds.em.po.BranchExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.OlderbaseExample;
import com.sds.em.po.Oldersick;
import com.sds.em.po.OldersickExample;
import com.sds.em.po.Order;
import com.sds.em.po.OrderExample;
import com.sds.em.po.OrderExample.Criteria;
import com.sds.em.service.BrenchService;
import com.sds.em.util.DateSimp;

public class BrenchServiceImpl implements BrenchService {
	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Autowired
	OldersickMapper oldersickMapper;

	@Autowired
	ActionMapper actionMapper;

	@Autowired
	OrderMapper orderMapper;

	@Autowired
	BranchMapper branchMapper;

	@Override
	public Message addElderInfo(Olderbase olderbase) throws Exception {
		try {
			olderbaseMapper.insertOlderBase(olderbase);
			if (olderbase.getOlderid() != null) {
				return new Message(true, "基本信息录入成功", olderbase.getOlderid());
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
			oldersickMapper.insertOlderSick(oldersick);
			if (oldersick.getSickid() != null) {
				return new Message(true, "病历信息录入成功", oldersick.getSickid());
			} else {
				return new Message(false, "病历信息录入失败", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message modifyOlder(Olderbase olderbase) {
		try {
			int flag = 0;
			flag = olderbaseMapper.updateByPrimaryKeySelective(olderbase);
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
			OrderExample orderExample = new OrderExample();
			Criteria criteria = orderExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderId);
			List<Order> orderList = orderMapper.selectByExample(orderExample);

			for (Order o : orderList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("orderDate", o.getOrderdate());
				jsonObject.put("orderTotal", o.getOrdertotal());
				jsonObjectList.add(jsonObject);
			}

			Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(olderId);

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

			List<Olderbase> olderbasesList = olderbaseMapper.selectByExample(olderbaseExample);
			List<Integer> olderAgeList = new ArrayList<Integer>();
			for (Olderbase o : olderbasesList) {
				String olderAgeS = DateSimp.simpToSting(o.getOlderbirthday());
				int olderAgeD = DateSimp.getAgeFromBirthTime(olderAgeS);
				olderAgeList.add(olderAgeD);
			}

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("olderbasesList", olderbasesList);
			jsonObject.put("olderAgeList", olderAgeList);

			if (!olderbasesList.isEmpty()) {
				return new Message(true, "返回成功", jsonObject);
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
			List<Olderbase> olderbasesList = olderbaseMapper.selectByExample(olderbaseExample);

			if (!olderbasesList.isEmpty()) {
				// 将其中的分店设置为null
				int flag = 0;
				Olderbase olderbase = new Olderbase();
				olderbase.setOlderid(olderbasesList.get(0).getOlderid());
				olderbase.setOlderbranchid(0);
				flag = olderbaseMapper.updateByPrimaryKeySelective(olderbase);
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

			List<Olderbase> olderbaseList = olderbaseMapper.selectByExample(olderbaseExample);
			if (!olderbaseList.isEmpty()) {
				return new Message(true, "获取成功", olderbaseList);
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
			OrderExample orderExample = new OrderExample();
			Criteria criteria = orderExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderid);
			List<Order> orderList = orderMapper.selectByExample(orderExample);
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
}
