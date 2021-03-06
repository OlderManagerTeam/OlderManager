package com.sds.em.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sds.em.mapper.JoingroupMapper;
import com.sds.em.mapper.OlderbaseMapper;
import com.sds.em.mapper.OldermessageMapper;
import com.sds.em.mapper.OrderlistMapper;
import com.sds.em.mapper.OrdersMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductgroupMapper;
import com.sds.em.mapper.ProductpiclistMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.mapper.ProducttypetwoMapper;
import com.sds.em.mapper.ProductviewlistMapper;
import com.sds.em.po.Joingroup;
import com.sds.em.po.JoingroupExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderbase;
import com.sds.em.po.Oldermessage;
import com.sds.em.po.OldermessageExample;
import com.sds.em.po.Orderlist;
import com.sds.em.po.OrderlistExample;
import com.sds.em.po.Orders;
import com.sds.em.po.OrdersExample;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.ProductExample.Criteria;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productpiclist;
import com.sds.em.po.ProductpiclistExample;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.po.Producttypetwo;
import com.sds.em.po.ProducttypetwoExample;
import com.sds.em.po.Productviewlist;
import com.sds.em.po.ProductviewlistExample;
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
	OlderbaseMapper olderbaseMapper;

	@Autowired
	ProductpiclistMapper productpiclistMapper;
	ProductpiclistExample productpiclistExample = new ProductpiclistExample();
	com.sds.em.po.ProductpiclistExample.Criteria productpiclistCriteria;
	
	@Autowired
	OldermessageMapper oldermessageMapper;
	OldermessageExample oldermessageExample = new OldermessageExample();
	com.sds.em.po.OldermessageExample.Criteria oldermessageCriteria;

	@Autowired
	ProductviewlistMapper productviewlistMapper;
	ProductviewlistExample productviewlistExample = new ProductviewlistExample();
	com.sds.em.po.ProductviewlistExample.Criteria productviewlistCriteria;

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

	@Autowired
	ProducttypetwoMapper producttypetwoMapper;

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
			if (product == null)
				return new Message(false, "无记录", product);
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
	@Transactional
	public Message product(Product product, List<Productpiclist> productpiclist, List<Productviewlist> productviewlist,
			int storecount) {
		productMapper.keyinsert(product);
		for (Productpiclist productpic : productpiclist) {
			productpic.setPproductid(product.getProductid());
			productpiclistMapper.insertSelective(productpic);
		}
		for (Productviewlist productpic : productviewlist) {
			productpic.setPviewpicproductid(product.getProductid());
			productviewlistMapper.insertSelective(productpic);
		}
		Productstore productstore = new Productstore();
		productstore.setStorecount(storecount);
		productstore.setStoredaybrowse(0);
		productstore.setStoredaysales(0);
		productstore.setStoremonthbrowse(0);
		productstore.setStoremonthsales(0);
		productstore.setStoreproductid(product.getProductid());
		productstore.setStoretotalbrowse(0);
		productstore.setStoretotalsales(0);
		productstore.setStoreyearbrowse(0);
		productstore.setStoreyearsales(0);
		productstoreMapper.insertSelective(productstore);
		return new Message(true, "上传成功", null);
	}

	@Override
	// wuwenbo,修改商品信息
	public Message productalter(Product product, List<Productviewlist> productviewlist,
			List<Productpiclist> productpiclist) {
		try {
			productMapper.updateByPrimaryKeySelective(product);
			productpiclistExample.clear();
			productpiclistCriteria = productpiclistExample.createCriteria();
			productpiclistCriteria.andPproductidEqualTo(product.getProductid());
			productpiclistMapper.deleteByExample(productpiclistExample);
			for (Productpiclist productpic : productpiclist) {
				productpic.setPproductid(product.getProductid());
				productpiclistMapper.insertSelective(productpic);
			}
			productviewlistExample.clear();
			productviewlistCriteria = productviewlistExample.createCriteria();
			productviewlistCriteria.andPviewpicproductidEqualTo(product.getProductid());
			productviewlistMapper.deleteByExample(productviewlistExample);
			for (Productviewlist productpic : productviewlist) {
				productpic.setPviewpicproductid(product.getProductid());
				productviewlistMapper.insertSelective(productpic);
			}
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
			orders.setOrderstatus("已签收");
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
			Orders orders =  ordersMapper.selectByPrimaryKey(ordersid);;
			orders.setOrderid(ordersid);
			orders.setOrderstatus("已取消");
			ordersMapper.updateByPrimaryKeySelective(orders);
			orderlistCriteria = orderlistExample.createCriteria();
			orderlistCriteria.andOrderlistfidEqualTo(ordersid);
			Oldermessage oldermessage=new Oldermessage();
			oldermessage.setMessagecontent("您的订单已取消");
			oldermessage.setMessagedate(new Date());
			oldermessage.setMessageolderid(orders.getOrderolderid());
			oldermessage.setMessagestatus("未读");
			oldermessage.setMessagetype("商城消息");
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
				orders.setOrderstatus("备货中");
				orders.setOrdertakepoint((float) 0.0);
				orders.setOrdertotal(productgroup.getGroupdiscountprice());
				ordersMapper.keyinsert(orders);
				Orderlist orderlist = new Orderlist();
				orderlist.setOrderdiscountprice(productgroup.getGroupdiscountprice());
				orderlist.setOrderlistfid(orders.getOrderid());
				orderlist.setOrderproductcount(1);
				orderlist.setOrderproductid(productgroup.getGroupproductid());
				orderlistMapper.insertSelective(orderlist);
				Productstore productstore = productstoreMapper.selectByExample(productstoreExample).get(0);
				productstore.setStorecount(productstore.getStorecount() - 1);
				productstore.setStoredaysales(productstore.getStoredaysales() + 1);
				productstore.setStoretotalsales(productstore.getStoretotalsales() + 1);
				productstore.setStoremonthsales(productstore.getStoremonthsales() + 1);
				productstore.setStoreyearsales(productstore.getStoreyearsales() + 1);
				productstoreMapper.updateByPrimaryKeySelective(productstore);
				Olderbase olderbase = olderbaseMapper.selectByPrimaryKey(joingroup.getJoinolderid());
				olderbase.setOlderid(joingroup.getJoinolderid());
				olderbase.setOldermaxpoint((int) (olderbase.getOldermaxpoint() + productgroup.getGroupdiscountprice()));
				olderbase.setOlderpoint((olderbase.getOlderpoint() + productgroup.getGroupdiscountprice().intValue()));
				olderbaseMapper.updateByPrimaryKeySelective(olderbase);
				Oldermessage oldermessage=new Oldermessage();
				oldermessage.setMessagecontent("你的团购订单已生成");
				oldermessage.setMessagedate(new Date());
				oldermessage.setMessageolderid(joingroup.getJoinolderid());
				oldermessage.setMessagestatus("未读");
				oldermessage.setMessagetype("商城消息");
				oldermessageMapper.insertSelective(oldermessage);
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
	// 添加团购
	public Message addproductgroup(Productgroup productgroup) {
		try {
			productgroupMapper.insertSelective(productgroup);
			return new Message(true, "添加成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 商品获取二级标签
	public Message typeTwoTypeId(int productTypeNumber) {
		ProducttypetwoExample producttypetwoExample = new ProducttypetwoExample();
		ProducttypetwoExample.Criteria Criteria = producttypetwoExample.createCriteria();
		Criteria.andTypetwotypeidEqualTo(productTypeNumber);
		try {
			List<Producttypetwo> list = producttypetwoMapper.selectByExample(producttypetwoExample);
			return new Message(true, "返回成功", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return new Message(false, "失败成功", null);
		}
	}

	@Override
	// 确认订单已送出
	public Message ordersend(int ordersid) {
		try {
			Orders orders = ordersMapper.selectByPrimaryKey(ordersid);
			orders.setOrderid(ordersid);
			orders.setOrderstatus("送货中");
			ordersMapper.updateByPrimaryKeySelective(orders);
			Oldermessage oldermessage=new Oldermessage();
			oldermessage.setMessagecontent("您的订单已送出");
			oldermessage.setMessagedate(new Date());
			oldermessage.setMessageolderid(orders.getOrderolderid());
			oldermessage.setMessagestatus("未读");
			oldermessage.setMessagetype("商城消息");
			return new Message(true, "修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	// 得到商品图片
	public List<Productpiclist> getproductpiclist(Integer productid) {
		productpiclistExample.clear();
		productpiclistCriteria = productpiclistExample.createCriteria();
		productpiclistCriteria.andPproductidEqualTo(productid);
		return productpiclistMapper.selectByExample(productpiclistExample);
	}

	@Override
	// 得到商品预览图
	public List<Productviewlist> getproductviewlist(Integer productid) {
		productviewlistExample.clear();
		productviewlistCriteria = productviewlistExample.createCriteria();
		productviewlistCriteria.andPviewpicproductidEqualTo(productid);
		return productviewlistMapper.selectByExample(productviewlistExample);
	}
}
