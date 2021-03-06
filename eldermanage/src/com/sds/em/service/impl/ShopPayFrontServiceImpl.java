package com.sds.em.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.CartMapper;
import com.sds.em.mapper.JoingroupMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OrderlistMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductgroupMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.po.Cart;
import com.sds.em.po.CartExample;
import com.sds.em.po.CartExample.Criteria;
import com.sds.em.po.Joingroup;
import com.sds.em.po.JoingroupExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Orderlist;
import com.sds.em.po.Orders;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.service.ShopPayFrontService;
import com.sds.em.shop.pojo.CartViewExtend;
import com.sds.em.shop.pojo.ConfirmOrderViewExtend;
import com.sds.em.shopfront.pojo.RightNowPayExtend;

public class ShopPayFrontServiceImpl implements ShopPayFrontService {
	@Autowired
	CartMapper cartMapper;
	@Autowired
	ProductMapper productMapper;
	@Autowired
	OrderlistMapper orderlistMapper;
	@Autowired
	OrdersMapper ordersMapper;
	@Autowired
	OlderbaseMapper olderbaseMapper;

	@Autowired
	ProductstoreMapper productstoreMapper;

	@Autowired
	ProductgroupMapper productgroupMapper;

	@Autowired
	JoingroupMapper joingroupMapper;

	@Override
	public Message addFirstShopcart(int olderid, int productid) {
		try {
			CartExample cartExample = new CartExample();
			Criteria criteria = cartExample.createCriteria();
			criteria.andCartproductidEqualTo(productid);
			criteria.andCartolderidEqualTo(olderid);
			List<Cart> CartList = cartMapper.selectByExample(cartExample);

			if (CartList.isEmpty()) {
				Cart cart = new Cart();
				int flag = 0;
				cart.setCartcount(1);
				cart.setCartolderid(olderid);
				cart.setCartproductid(productid);
				flag = cartMapper.insertSelective(cart);
				if (flag != 0) {
					return new Message(true, "添加成功", null);
				} else {
					return new Message(false, "数据库错误", null);
				}
			} else {
				return new Message(false, "已加入购物车，不能重复!", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message addShopcart(int olderid, int productid, int count) {
		CartExample cartExample = new CartExample();
		Criteria criteria = cartExample.createCriteria();
		criteria.andCartproductidEqualTo(productid);
		criteria.andCartolderidEqualTo(olderid);
		List<Cart> CartList = cartMapper.selectByExample(cartExample);

		if (CartList.isEmpty()) {// 第一次添加
			Cart cart = new Cart();
			int flag = 0;
			cart.setCartcount(count);
			cart.setCartolderid(olderid);
			cart.setCartproductid(productid);
			flag = cartMapper.insertSelective(cart);
			if (flag != 0) {
				return new Message(true, "添加成功", null);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} else {// 已加入过购物车，应该是修改
			Cart cart = new Cart();
			int flag = 0;
			cart.setCartcount(count);
			flag = cartMapper.updateByExampleSelective(cart, cartExample);
			if (flag != 0) {
				return new Message(true, "修改成功", null);
			} else {
				return new Message(false, "数据库错误", null);
			}
		}
	}

	@Override
	public Message ShopcartView(int olderid) {
		try {
			List<CartViewExtend> extendList = cartMapper.ShopcartView(olderid);
			if (!extendList.isEmpty()) {
				return new Message(true, "返回成功", extendList);
			} else {
				return new Message(false, "购物车为空", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message cartProductRemove(int olderid, int productid) {
		try {
			CartExample cartExample = new CartExample();
			Criteria criteria = cartExample.createCriteria();
			criteria.andCartproductidEqualTo(productid);
			criteria.andCartolderidEqualTo(olderid);
			int flag = 0;
			flag = cartMapper.deleteByExample(cartExample);
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
	public Message confirmOrderRightNow(int olderid, int productid) {
		try {
			RightNowPayExtend rightNowPayExtend = new RightNowPayExtend();
			rightNowPayExtend.setOlderid(olderid);
			rightNowPayExtend.setProductid(productid);
			List<ConfirmOrderViewExtend> extendList = productMapper.confirmOrderRightNow(rightNowPayExtend);
			if (!extendList.isEmpty()) {
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
	public Message confirmOrderCart(int olderid) {
		try {
			List<ConfirmOrderViewExtend> extendList = cartMapper.confirmOrderCart(olderid);
			if (!extendList.isEmpty()) {
				return new Message(true, "返回成功", extendList);
			} else {
				return new Message(false, "购物车为空", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message updateCart(int olderid, int[] productid, int[] count) {
		try {
			boolean flag = true;
			int f = 1;
			for (int i = 0; i < productid.length; i++) {
				flag = this.addShopcart(olderid, productid[i], count[i]).isSuccess();
				if (!flag) {// 当有一个为false时候
					f = 0;
					break;
				}
			}
			if (f == 1) {
				return new Message(true, "修改成功", null);
			} else {
				return new Message(false, "修改失败", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message orderFormation(int olderid, float ordertotal, int ordertakepoint) {
		try {
			CartExample cartExample = new CartExample();
			Criteria criteria = cartExample.createCriteria();
			criteria.andCartolderidEqualTo(olderid);
			List<Cart> CartList = cartMapper.selectByExample(cartExample);

			if (!CartList.isEmpty()) {// 当本老人购物车中商品不为空
				Orders orders = new Orders();
				orders.setOrderdate(new Date());
				orders.setOrderolderid(olderid);
				orders.setOrderstatus("备货中");
				orders.setOrdertakepoint((float) ordertakepoint);
				orders.setOrdertotal(ordertotal);
				ordersMapper.keyinsert(orders);
				if (orders.getOrderid() != null) {// 当订单表生成成功
					int flag = 0;
					boolean flag2 = true;
					for (Cart c : CartList) {
						float productprice = productMapper.selectByPrimaryKey(c.getCartproductid())
								.getProductdiscountprice();

						Orderlist orderlist = new Orderlist();
						orderlist.setOrderlistfid(orders.getOrderid());
						orderlist.setOrderproductcount(c.getCartcount());
						orderlist.setOrderproductid(c.getCartproductid());
						float orderdiscountprice = c.getCartcount() * productprice;
						orderlist.setOrderdiscountprice(orderdiscountprice);
						// 生成订单详情表
						flag = orderlistMapper.insert(orderlist);
						// 更新库存表
						ProductstoreExample productstoreExample = new ProductstoreExample();
						com.sds.em.po.ProductstoreExample.Criteria criteria2 = productstoreExample.createCriteria();
						criteria2.andStoreproductidEqualTo(c.getCartproductid());

						Productstore productstore = productstoreMapper.selectByExample(productstoreExample).get(0);

						productstore.setStorecount(productstore.getStorecount() - c.getCartcount());
						productstore.setStoredaysales(productstore.getStoredaysales() + c.getCartcount());
						productstore.setStoretotalsales(productstore.getStoretotalsales() + c.getCartcount());

						productstore.setStoremonthsales(productstore.getStoremonthsales() + c.getCartcount());
						productstore.setStoreyearsales(productstore.getStoreyearsales() + c.getCartcount());

						int flag5 = 0;
						flag5 = productstoreMapper.updateByExampleSelective(productstore, productstoreExample);

						if (flag == 0) {
							flag2 = false;
							break;
						} else {
							if (flag5 == 0) {
								flag2 = false;
								break;
							}
						}
					}
					if (flag2) {// 当订单详情表生成成功,库存表更新成功
						// 修改老人积分情况
						Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(olderid);
						olderbase.setOlderid(olderid);
						olderbase.setOldermaxpoint((int) (olderbase.getOldermaxpoint() + ordertotal));
						olderbase.setOlderpoint((olderbase.getOlderpoint() + (int) ordertotal - ordertakepoint));

						int flag3 = 0;
						flag3 = olderbaseMapper.updateByPrimaryKeySelective(olderbase);
						if (flag3 != 0) {
							int flag4 = 0;

							flag4 = cartMapper.deleteByExample(cartExample);// 本老人清空购物车
							if (flag4 != 0) {
								return new Message(true, "订单详情，库存表及老人积分更新成功,本老人购物车以清空", null);
							} else {
								return new Message(false, "订单详情，库存表及老人积分更新成功,本老人购物车清空失败", null);
							}
						} else {
							return new Message(false, "订单详情，库存表及老人积分更新失败", null);
						}

					} else {
						return new Message(false, "订单详情生成失败", null);
					}
				} else {
					return new Message(false, "订单表生成失败", null);
				}
			} else {
				return new Message(false, "购物车为空", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message rightNowOrderFormation(int olderid, float ordertotal, int ordertakepoint, int productid, int count) {
		try {
			Orders orders = new Orders();
			orders.setOrderdate(new Date());
			orders.setOrderolderid(olderid);
			orders.setOrderstatus("备货中");
			orders.setOrdertakepoint((float) ordertakepoint);
			orders.setOrdertotal(ordertotal);
			ordersMapper.keyinsert(orders);
			if (orders.getOrderid() != null) {// 当订单表生成成功
				int flag = 0;
				int flag1 = 0;
				float productprice = productMapper.selectByPrimaryKey(productid).getProductdiscountprice();

				Orderlist orderlist = new Orderlist();
				orderlist.setOrderproductid(productid);
				orderlist.setOrderlistfid(orders.getOrderid());
				orderlist.setOrderproductcount(count);
				float orderdiscountprice = count * productprice;
				orderlist.setOrderdiscountprice(orderdiscountprice);
				flag = orderlistMapper.insert(orderlist);
				if (flag != 0) {// 订单详情生成成功
					// 更新库存表
					ProductstoreExample productstoreExample = new ProductstoreExample();
					com.sds.em.po.ProductstoreExample.Criteria criteria2 = productstoreExample.createCriteria();
					criteria2.andStoreproductidEqualTo(productid);

					Productstore productstore = productstoreMapper.selectByExample(productstoreExample).get(0);

					productstore.setStorecount(productstore.getStorecount() - count);
					productstore.setStoredaysales(productstore.getStoredaysales() + count);
					productstore.setStoretotalsales(productstore.getStoretotalsales() + count);

					productstore.setStoremonthsales(productstore.getStoremonthsales() + count);
					productstore.setStoreyearsales(productstore.getStoreyearsales() + count);

					flag1 = productstoreMapper.updateByExampleSelective(productstore, productstoreExample);
					if (flag1 != 0) {// 库存表更新成功
						// 修改老人积分情况
						Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(olderid);
						olderbase.setOlderid(olderid);
						olderbase.setOldermaxpoint((int) (olderbase.getOldermaxpoint() + ordertotal));
						olderbase.setOlderpoint((olderbase.getOlderpoint() + (int) ordertotal - ordertakepoint));

						int flag3 = 0;
						flag3 = olderbaseMapper.updateByPrimaryKeySelective(olderbase);
						if (flag3 != 0) {// 老人积分更新成功
							return new Message(true, "订单详情，库存表及老人积分更新成功", null);
						} else {
							return new Message(true, "老人积分更新失败", null);
						}
					} else {
						return new Message(false, "库存表更新失败", null);
					}
				} else {
					return new Message(false, "订单详情生成失败", null);
				}

			} else {
				return new Message(false, "订单表生成失败", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message joinGroup(int olderid, int groupid) {
		try {
			JoingroupExample joingroupExample = new JoingroupExample();
			com.sds.em.po.JoingroupExample.Criteria criteria = joingroupExample.createCriteria();
			criteria.andJoinidEqualTo(groupid);
			criteria.andJoinolderidEqualTo(olderid);

			List<Joingroup> groupList = joingroupMapper.selectByExample(joingroupExample);

			if (groupList.isEmpty()) {// 为空的才能参与

				Joingroup group = new Joingroup();
				group.setJoindate(new Date());
				group.setJoinid(groupid);
				group.setJoinolderid(olderid);
				int flag = 0;
				flag = joingroupMapper.insert(group);
				if (flag != 0) {
					return new Message(true, "申请参团成功", null);
				} else {
					return new Message(false, "申请参团失败", null);
				}
			} else {
				return new Message(false, "不能重复参与", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message judgeJoinGroup(int olderid, int groupid) {
		try {
			JoingroupExample joingroupExample = new JoingroupExample();
			com.sds.em.po.JoingroupExample.Criteria criteria = joingroupExample.createCriteria();
			criteria.andJoinidEqualTo(groupid);
			criteria.andJoinolderidEqualTo(olderid);

			List<Joingroup> groupList = joingroupMapper.selectByExample(joingroupExample);

			if (!groupList.isEmpty()) {
				return new Message(true, "参与过", null);
			} else {
				return new Message(false, "没有参与过", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message judgeAddCart(int olderid, int productid) {
		try {
			CartExample cartExample = new CartExample();
			Criteria criteria = cartExample.createCriteria();
			criteria.andCartproductidEqualTo(productid);
			criteria.andCartolderidEqualTo(olderid);
			List<Cart> CartList = cartMapper.selectByExample(cartExample);

			if (!CartList.isEmpty()) {// 以加入过购物车
				return new Message(true, "已加过", null);
			} else {
				return new Message(false, "没有加过", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

}
