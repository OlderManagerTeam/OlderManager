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
}
