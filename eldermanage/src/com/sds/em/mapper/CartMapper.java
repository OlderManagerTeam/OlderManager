package com.sds.em.mapper;

import com.sds.em.po.Cart;
import com.sds.em.po.CartExample;
import com.sds.em.shop.pojo.CartViewExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
	int countByExample(CartExample example);

	int deleteByExample(CartExample example);

	int deleteByPrimaryKey(Integer cartid);

	int insert(Cart record);

	int insertSelective(Cart record);

	List<Cart> selectByExample(CartExample example);

	Cart selectByPrimaryKey(Integer cartid);

	int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

	int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

	int updateByPrimaryKeySelective(Cart record);

	int updateByPrimaryKey(Cart record);

	// lu
	// 显示购物车页面-所加入的商品信息-老人积分信息
	public List<CartViewExtend> ShopcartView(int olderid);
	
	// 从购物车中删除一个商品
	
}