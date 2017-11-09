package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.CartMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.po.Cart;
import com.sds.em.po.CartExample;
import com.sds.em.po.CartExample.Criteria;
import com.sds.em.po.Message;
import com.sds.em.service.ShopPayFrontService;
import com.sds.em.shop.pojo.CartViewExtend;
import com.sds.em.shop.pojo.ConfirmOrderViewExtend;
import com.sds.em.shopfront.pojo.RightNowPayExtend;

public class ShopPayFrontServiceImpl implements ShopPayFrontService {
	@Autowired
	CartMapper cartMapper;
	@Autowired
	ProductMapper productMapper;

	@Override
	public Message addFirstShopcart(int olderid, int productid, int count) {
		try {
			CartExample cartExample = new CartExample();
			Criteria criteria = cartExample.createCriteria();
			criteria.andCartproductidEqualTo(productid);
			criteria.andCartolderidEqualTo(olderid);
			List<Cart> CartList = cartMapper.selectByExample(cartExample);

			if (CartList.isEmpty()) {
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
			cartExample.clear();
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

}
