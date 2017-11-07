package com.sds.em.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.JoingroupMapper;
import com.sds.em.mapper.OrderlistMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductgroupMapper;
import com.sds.em.mapper.ProductpiclistMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.mapper.ProductviewlistMapper;
import com.sds.em.po.Joingroup;
import com.sds.em.po.JoingroupExample;
import com.sds.em.po.Message;
import com.sds.em.po.Orderlist;
import com.sds.em.po.OrderlistExample;
import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.ProductExample.Criteria;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productpiclist;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.po.Productviewlist;
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
	
	@Autowired
	ProductpiclistMapper productpiclistMapper;
	
	@Autowired
	ProductviewlistMapper productviewlistMapper;

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

	@Autowired
	ProductgroupMapper productgroupMapper;

	@Autowired
	JoingroupMapper joingroupMapper;

	JoingroupExample joingroupExample = new JoingroupExample();
	JoingroupExample.Criteria joingroupCriteria;

	
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
	public Message product(Product product, List<Productpiclist> productpiclist, 
			List<Productviewlist> productviewlist) {
		try {
			productMapper.keyinsert(product);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
		for(Productpiclist productpic:productpiclist){
			productpic.setPproductid(product.getProductid());
			productpiclistMapper.insertSelective(productpic);
		}
		for(Productviewlist productpic:productviewlist){
			productpic.setPviewpicproductid(product.getProductid());
			productviewlistMapper.insertSelective(productpic);
		}
		return new Message(true, "上传成功", null);
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
			if (orderlists != null)
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
	// wuwenbo,修改商品库存
	public Message addproductstore(int productid, int productcount) {
		try {
			productstoreExample.clear();
			productstorCriteria = productstoreExample.createCriteria();
			productstorCriteria.andStoreproductidEqualTo(productid);
			List<Productstore> productstoreList = productstoreMapper.selectByExample(productstoreExample);
			Productstore productstore;
			if (!productstoreList.isEmpty()) {
				productstore = productstoreList.get(0);
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
	// 查看团购表
	public Message getproductgroup() {
		try {
			List<com.sds.em.pojo.ProductgroupExtend> productgroupList = productgroupMapper.getproductgroup();
			return new Message(true, "返回成功", productgroupList);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 删除一条团购
	public Message deleteproductgroup(int groupid) {
		// TODO 自动生成的方法存根
		try {
			productgroupMapper.deleteByPrimaryKey(groupid);
			joingroupCriteria = joingroupExample.createCriteria();
			joingroupCriteria.andJoinidEqualTo(groupid);
			joingroupMapper.deleteByExample(joingroupExample);
			return new Message(true, "删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 成交并生成订单
	public Message ordersproductgroup(int groupid) {
		try {
			Productgroup productgroup = productgroupMapper.selectByPrimaryKey(groupid);
			productgroup.setGroupstatus("已成交");
			productgroupMapper.updateByPrimaryKeySelective(productgroup);
			joingroupCriteria = joingroupExample.createCriteria();
			joingroupCriteria.andJoinidEqualTo(groupid);
			List<Joingroup> joingroupList = joingroupMapper.selectByExample(joingroupExample);
			for (Joingroup joingroup : joingroupList) {
				Orders orders = new Orders();
				orders.setOrderolderid(joingroup.getJoinolderid());
				orders.setOrderdate(new Date());
				orders.setOrderstatus("送货中");
				orders.setOrdertakepoint((float) 0.0);
				orders.setOrdertotal(productgroup.getGroupdiscountprice());
				ordersMapper.keyinsert(orders);
				Orderlist orderlist = new Orderlist();
				orderlist.setOrderdiscountprice(productgroup.getGroupdiscountprice());
				orderlist.setOrderlistfid(orders.getOrderid());
				orderlist.setOrderproductcount(1);
				orderlist.setOrderproductid(productgroup.getGroupproductid());
				orderlistMapper.insertSelective(orderlist);
			}
			return new Message(true, "操作成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,查看团购参加者
	public Message productgroupjoin(int groupid) {
		try {
			joingroupCriteria = joingroupExample.createCriteria();
			joingroupCriteria.andJoinidEqualTo(groupid);
			List<com.sds.em.pojo.JoingroupExtend> joingroupList = joingroupMapper.getJoingroup(groupid);
			return new Message(true, "返回成功", joingroupList);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// wuwenbo,获取订单详情
	public Message getorderlist(int orderid) {
		try {
			List<com.sds.em.pojo.OrderlistExtend> orderlist = orderlistMapper.getorderlist(orderid);
			return new Message(true, "返回成功", orderlist);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	//添加团购
	public Message addproductgroup(Productgroup productgroup) {
		try {
		productgroupMapper.insertSelective(productgroup);
		return new Message(true, "添加成功", null);
	} catch (Exception e) {
		e.printStackTrace();
		return new Message(false, "数据库错误", null);
	}
	}
}
