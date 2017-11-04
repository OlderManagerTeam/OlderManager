package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.OrderlistMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Orderlist;
import com.sds.em.po.OrderlistExample;
import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.ProductExample.Criteria;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.pojo.OrdersExtend;
import com.sds.em.pojo.ProductrateExtend;
import com.sds.em.pojo.ProductstoreExtend;
import com.sds.em.service.OlderShopService;

public class OlderShopServiceImpl implements OlderShopService {
	@Autowired
	ProductMapper productMapper;

	@Autowired
	ProductrateMapper productrateMapper;

	@Autowired
	OrderlistMapper orderlistMapper;

	@Autowired
	OrdersMapper ordersMapper;

	ProductExample productExample = new ProductExample();
	Criteria productCriteria;

	ProductrateExample productrateExample = new ProductrateExample();
	com.sds.em.po.ProductrateExample.Criteria productrateCriteria;

	OrdersExample ordersExample = new OrdersExample();
	com.sds.em.po.OrdersExample.Criteria ordersCriteria;

	OrderlistExample orderlistExample = new OrderlistExample();
	OrderlistExample.Criteria orderlistCriteria;

	@Autowired
	ProductstoreMapper productstoreMapper;

	ProductstoreExample productstoreExample = new ProductstoreExample();
	ProductstoreExample.Criteria productstorCriteria;

	@Override
	// wuwenbo,添加商品
	public Message addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// wuwenbo,根据类别获得商品列表
	public Message getproductlist(int producttypenumber) throws Exception {
		try {
			productExample.clear();
			productCriteria = productExample.createCriteria();
			productCriteria.andProducttypenumberEqualTo(producttypenumber);
			List<Product> productlist = productMapper.selectByExample(productExample);
			return new Message(true, "返回成功", productlist);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,查看商品详细信息
	public Message getproductinfo(int productid) {
		try {

			Product product = productMapper.selectByPrimaryKey(productid);
			return new Message(true, "返回成功", product);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,查看商品评价
	public Message getproductrate(int productid) {
		try {
			List<ProductrateExtend> productratelist = productrateMapper.getproductrate(productid);
			return new Message(true, "返回成功", productratelist);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,添加商品信息
	public Message product(Product product) {
		try {
			productMapper.insertSelective(product);
			return new Message(true, "上传成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,修改商品信息
	public Message productalter(Product product) {
		try {
			productMapper.updateByPrimaryKeySelective(product);
			return new Message(true, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,删除商品信息
	public Message productdelete(int productid) {
		try {
			Product product = new Product();
			product.setProductid(productid);
			product.setProducttypenumber(11);
			productMapper.updateByPrimaryKeySelective(product);
			return new Message(true, "删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 获得订单列表
	public Message getorders() {
		try {
			List<OrdersExtend> odersList = ordersMapper.getorders();
			return new Message(true, "获取成功", odersList);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 得到訂單評價
	public Message getordersrate(int ordersid) {
		try {
			List<ProductrateExtend> productratelist = productrateMapper.getorderrate(ordersid);
			return new Message(true, "返回成功", productratelist);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 删除订单及订单详细
	public Message deleteorder(int ordersid) {
		try {
			ordersMapper.deleteByPrimaryKey(ordersid);
			orderlistCriteria = orderlistExample.createCriteria();
			orderlistCriteria.andOrderlistfidEqualTo(ordersid);
			orderlistMapper.deleteByExample(orderlistExample);
			return new Message(true, "删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 确认订单提交
	public Message orderok(int ordersid) {
		try {
			Orders orders = new Orders();
			orders.setOrderid(ordersid);
			orders.setOrderstatus("已成交");
			ordersMapper.updateByPrimaryKeySelective(orders);
			return new Message(true, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 取消订单
	public Message ordercancel(int ordersid) {
		try {
			Orders orders = new Orders();
			orders.setOrderid(ordersid);
			orders.setOrderstatus("已取消");
			ordersMapper.updateByPrimaryKeySelective(orders);
			orderlistCriteria = orderlistExample.createCriteria();
			orderlistCriteria.andOrderlistfidEqualTo(ordersid);
			List<Orderlist> orderlists = orderlistMapper.selectByExample(orderlistExample);
			if (!orderlists.isEmpty())
				for (Orderlist orderlist : orderlists) {
					productstoreExample.clear();
					productstorCriteria = productstoreExample.createCriteria();
					productstorCriteria.andStoreproductidEqualTo(orderlist.getOrderproductid());
					List<Productstore> productstoreList = productstoreMapper.selectByExample(productstoreExample);
					int count = orderlist.getOrderproductcount();
					Productstore productstor = null;
					if (!productstoreList.isEmpty()) {
						productstor = productstoreList.get(0);
						productstor.setStorecount(productstor.getStorecount() + count);
						productstor.setStoretotalsales(productstor.getStoretotalsales() - count);
						productstor.setStoremonthsales(productstor.getStoremonthsales() - count);
						productstor.setStoreyearsales(productstor.getStoreyearsales() - count);
						productstoreMapper.updateByPrimaryKeySelective(productstor);
					}
				}
			return new Message(true, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,查看库存
	public Message getproductstore() {
		try {
			List<ProductstoreExtend> productstoreList = productstoreMapper.getproductstore();
			return new Message(true, "返回成功", productstoreList);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	//wuwenbo,修改商品库存
	public Message addproductstore(int productid,int productcount) {
		try {
		productstoreExample.clear();
		productstorCriteria=productstoreExample.createCriteria();
		productstorCriteria.andStoreproductidEqualTo(productid);
		List<Productstore> productstoreList= productstoreMapper.selectByExample(productstoreExample);
		Productstore productstore;
		if(!productstoreList.isEmpty()){
			productstore=productstoreList.get(0);
			productstore.setStorecount(productcount);
			productstoreMapper.updateByPrimaryKeySelective(productstore);
		}
		return new Message(true, "修改成功", null);
	} catch (Exception e) {
		e.printStackTrace();
		return new Message(false, "数据库错误", null);
	}
	}

	@Override
	//查看团购表
	public Message getproductgroup() {
		
		return null;
	}

}
