package com.sds.em.mapper;

import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.pojo.OrdersExtend;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //wuwenbo,获取订单列表
	List<OrdersExtend> getorders();
//插入返回主键
	int keyinsert(Orders orders);
	
	//wuwenbo,近三十天商城商品类别销售数据
	List<com.sds.em.po.Producttype> typesales();
}