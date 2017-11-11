package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OrderlistMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.po.ProductrateExample.Criteria;
import com.sds.em.pojo.ProductrateExtend;
import com.sds.em.service.ShopPersonalFrontService;
import com.sds.em.shop.pojo.MyOrderViewExtend;
import com.sds.em.shop.pojo.OlderOrdersExtend;
import com.sds.em.shopfront.pojo.MyOrdersListExtend;

public class ShopPersonalFrontServiceImpl implements ShopPersonalFrontService {

	@Autowired
	OlderbaseMapper olderbaseMapper;
	@Autowired
	OrderlistMapper orderlistMapper;
	@Autowired
	ProductrateMapper productrateMapper;
	@Autowired
	OrdersMapper ordersMapper;

	@Override
	public Message shopPersonalInfo(int olderid) throws Exception {
		try {
			Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(olderid);

			if (olderbase != null) {
				return new Message(true, "返回成功", olderbase);
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
	public Message shopMyOrderInfo(int olderid) throws Exception {
		try {
			OrdersExample ordersExample = new OrdersExample();
			com.sds.em.po.OrdersExample.Criteria criteria = ordersExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderid);
			List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);

			List<OlderOrdersExtend> olderOrdersList = new ArrayList<OlderOrdersExtend>();

			for (Orders o : ordersList) {
				MyOrdersListExtend myOrdersListExtend = new MyOrdersListExtend();
				myOrdersListExtend.setOlderid(olderid);
				myOrdersListExtend.setOrderid(o.getOrderid());
				List<MyOrderViewExtend> extend = orderlistMapper.shopMyOrderInfo(myOrdersListExtend);

				OlderOrdersExtend olderOrders = new OlderOrdersExtend();
				olderOrders.setOlderOrders(extend);
				olderOrdersList.add(olderOrders);
			}

			if (olderOrdersList != null) {
				return new Message(true, "返回成功", olderOrdersList);
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
	public Message shopBuyRecordInfo(int olderid) throws Exception {
		try {
			List<MyOrderViewExtend> extendList = orderlistMapper.shopBuyRecordInfo(olderid);

			for (MyOrderViewExtend m : extendList) {
				ProductrateExample productrateExtend = new ProductrateExample();
				Criteria criteria = productrateExtend.createCriteria();
				criteria.andRateorderidEqualTo(m.getOrderlistid());
				List<Productrate> rateList = productrateMapper.selectByExample(productrateExtend);

				Map<Integer, String> ratestatus = new HashMap<Integer, String>();

				if (!rateList.isEmpty()) {
					ratestatus.put(rateList.get(0).getRateid(), "查看评价");
					m.setRatestatus(ratestatus);
				} else {
					ratestatus.put(0, "未评价");
					m.setRatestatus(ratestatus);
				}
			}

			if (extendList != null) {
				return new Message(true, "返回成功", extendList);
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
	public Message AddRate(Productrate productrate) throws Exception {
		try {
			int flag = 0;
			flag = productrateMapper.insert(productrate);
			if (flag != 0) {
				return new Message(true, "评论成功", null);
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
	public Message RateInfo(int rateid) throws Exception {

		try {
			Productrate productrate = productrateMapper.selectByPrimaryKey(rateid);
			if (productrate != null) {
				return new Message(true, "返回成功", productrate);

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
	public Message myOrderSure(int olderid, int orderid) throws Exception {
		try {
			OrdersExample ordersExample = new OrdersExample();
			com.sds.em.po.OrdersExample.Criteria criteria = ordersExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderid);
			criteria.andOrderidEqualTo(orderid);

			List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
			if (!ordersList.isEmpty()) {
				Orders orders = ordersList.get(0);
				orders.setOrderstatus("已签收");
				int flag = 0;
				flag = ordersMapper.updateByExampleSelective(orders, ordersExample);
				if (flag != 0) {
					return new Message(true, "签收成功", null);
				} else {
					return new Message(false, "数据库错误", null);
				}
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
	public Message myOrderApplyCancel(int olderid, int orderid) throws Exception {
		try {
			OrdersExample ordersExample = new OrdersExample();
			com.sds.em.po.OrdersExample.Criteria criteria = ordersExample.createCriteria();
			criteria.andOrderolderidEqualTo(olderid);
			criteria.andOrderidEqualTo(orderid);

			List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
			if (!ordersList.isEmpty()) {
				Orders orders = ordersList.get(0);
				orders.setOrderstatus("申请退货");
				int flag = 0;
				flag = ordersMapper.updateByExampleSelective(orders, ordersExample);
				if (flag != 0) {
					return new Message(true, "申请退货请求成功", null);
				} else {
					return new Message(false, "数据库错误", null);
				}
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
