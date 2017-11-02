package com.sds.em.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.po.Message;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.ProductExample.Criteria;
import com.sds.em.po.Productrate;
import com.sds.em.po.ProductrateExample;
import com.sds.em.pojo.ProductrateExtend;
import com.sds.em.service.OlderShopService;

public class OlderShopServiceImpl implements OlderShopService {
	@Autowired
	ProductMapper productMapper;

	@Autowired
	ProductrateMapper productrateMapper;

	ProductExample productExample = new ProductExample();
	Criteria productCriteria;

	ProductrateExample productrateExample = new ProductrateExample();
	com.sds.em.po.ProductrateExample.Criteria productrateCriteria;

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
			productrateCriteria = productrateExample.createCriteria();
			productrateCriteria.andRateproductidEqualTo(productid);
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

}
