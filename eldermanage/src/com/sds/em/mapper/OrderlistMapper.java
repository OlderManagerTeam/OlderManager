package com.sds.em.mapper;

import com.sds.em.po.Orderlist;
import com.sds.em.po.OrderlistExample;
import com.sds.em.po.Productrate;
import com.sds.em.pojo.OrderlistExtend;
import com.sds.em.shop.pojo.MyOrderViewExtend;
import com.sds.em.shopfront.pojo.MyOrdersListExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlistMapper {
    int countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(Integer orderlistid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    Orderlist selectByPrimaryKey(Integer orderlistid);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);

    //wuwenbo,获取订单详情
	List<OrderlistExtend> getorderlist(int orderid);
	
	//lu
	//显示我的订单页面
	List<MyOrderViewExtend> shopMyOrderInfo(MyOrdersListExtend myOrdersListExtend);
	
	//显示购买记录页面
	List<MyOrderViewExtend> shopBuyRecordInfo(int olderid);
	
	//根据订单详情id得到以评论的内容
	Productrate RateInfo(int orderlistid);
	
}
/*
 * 	
 * 
 * */
 