package com.sds.em.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Product;
import com.sds.em.service.OlderShopService;
import com.sds.em.util.DateSimp;

/*
 * 作者：刘露
 * 描述：老人电商管理系统的后台相关功能
 * 
 * 
 * */
@Controller
@RequestMapping("v1/oldershop/")
public class OlderShopController {
	@Autowired
	OlderShopService olderShopService;

	// wuwenbo,按类别查看商品
	@RequestMapping(method = RequestMethod.GET, value = "productlist")
	public @ResponseBody Message viewproductlist(int producttypenumber) throws Exception {
		return olderShopService.getproductlist(producttypenumber);
	}

	// wuwenbo,查看商品详细信息
	@RequestMapping(method = RequestMethod.GET, value = "product/info")
	public @ResponseBody Message viewproductinfo(int productid) throws Exception {
		return olderShopService.getproductinfo(productid);
	}

	// wuwenbo,查看商品评价
	@RequestMapping(method = RequestMethod.GET, value = "product/rate")
	public @ResponseBody Message viewproductrate(int productid) throws Exception {
		return olderShopService.getproductrate(productid);
	}

	// wuwenbo,添加商品信息
	@RequestMapping(method = RequestMethod.POST, value = "product/info")
	public @ResponseBody Message entryproduct(Product product, MultipartFile productImg, String productUpondate)
			throws Exception {
		String pic_path = "E:\\oldermanageresource\\productimg\\";
		String picUrl = "http://localhost:8080/productimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		if (!productImg.isEmpty()) {
			File productimg = new File(pic_path + newFileName);
			productImg.transferTo(productimg);
		}
		product.setProductimg(picUrl+newFileName);
		Date date = new Date();
		if(!productUpondate.isEmpty()){
			date = DateSimp.simp(productUpondate);
		}
		product.setProductupondate(date);
		return olderShopService.product(product);
	}
	
	// wuwenbo,修改商品信息
	@RequestMapping(method = RequestMethod.POST, value = "product/infoupdate")
	public @ResponseBody Message alterproduct(Product product, MultipartFile productImg, String productUpondate)
			throws Exception {
		String pic_path = "E:\\oldermanageresource\\productimg\\";
		String picUrl = "http://localhost:8080/productimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		Product productold=(Product) olderShopService.getproductinfo(product.getProductid()).getData();
		String[] productoldsplit=productold.getProductimg().split("/");
		String productoldname= productoldsplit[productoldsplit.length-1];
		
		if (!productImg.isEmpty()) {
			File oldproductimg=new File(pic_path+productoldname);
			if(oldproductimg.exists())
				oldproductimg.delete();
			File productimg = new File(pic_path + newFileName);
			productImg.transferTo(productimg);
			product.setProductimg(picUrl+newFileName);
		}
		Date date = new Date();
		if(!productUpondate.isEmpty()){
			date = DateSimp.simp(productUpondate);
		}
		product.setProductupondate(date);
		return olderShopService.productalter(product);
	}
	
	// wuwenbo,删除商品信息
	@RequestMapping(method = RequestMethod.DELETE, value = "product/info")
	public @ResponseBody Message deleteproduct(int productid){
		return olderShopService.productdelete(productid);
	}

	//wuwenbo,查看订单列表
	@RequestMapping(method = RequestMethod.GET, value = "orders")
	public @ResponseBody Message getorders(){
		return olderShopService.getorders();
	}
	
	//wuwenbo,查看订单评价列表
	@RequestMapping(method = RequestMethod.GET, value = "orders/rate")
	public @ResponseBody Message getordersrate(int ordersid){
		return olderShopService.getordersrate(ordersid);
	}
	
	//wuwenbo,删除订单
	@RequestMapping(method = RequestMethod.DELETE, value = "order")
	public @ResponseBody Message deleteorder(int ordersid){
		return olderShopService.deleteorder(ordersid);
	}
	
	//wuwenbo,确认订单
	@RequestMapping(method = RequestMethod.POST, value = "order")
	public @ResponseBody Message orderok(int ordersid){
		return olderShopService.orderok(ordersid);
	}
	
	//wuwenbo,取消订单
	@RequestMapping(method = RequestMethod.POST, value = "ordercancel")
	public @ResponseBody Message ordercancel(int ordersid){
		return olderShopService.ordercancel(ordersid);
	}
	
	//wuwenbo,查看库存
	@RequestMapping(method = RequestMethod.GET, value = "productstore")
	public @ResponseBody Message getproductstore(){
		return olderShopService.getproductstore();
	}
	
	//wuwenbo,修改商品库存
	@RequestMapping(method = RequestMethod.POST, value = "productstore")
	public @ResponseBody Message addproductstore(int productid,int productcount){
		return olderShopService.addproductstore(productid,productcount);
	}
	
	//wuwenbo,查看团购表
	@RequestMapping(method = RequestMethod.POST, value = "productgroup")
	public @ResponseBody Message getproductgroup(){
		return olderShopService.getproductgroup();
	}
}
