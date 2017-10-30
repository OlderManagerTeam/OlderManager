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
	
	@RequestMapping(method = RequestMethod.POST, value = "product/info")
	public @ResponseBody Message addProduct(String productname,String productprice,String producttypenumber,
			String productinfo,MultipartFile productimg,String productweight,String productupondate,String productdiscountprice) throws Exception {
	
		String pic_path = "E:\\develop\\upload\\temp\\pic\\productPic\\";
		String picUrl = "http://localhost:8080/pic/productPic/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";

		File dnf1 = new File(pic_path + newFileName);
		productimg.transferTo(dnf1);
		
		Date date = DateSimp.simp(productupondate);
		
		Product product=new Product();
		product.setProductimg(picUrl + newFileName);
		product.setProductupondate(date);
		
		product.setProductdiscountprice(Float.valueOf(productdiscountprice));
		product.setProductinfo(productinfo);
		product.setProductname(productname);
		product.setProductprice(Float.valueOf(productprice));
		product.setProductdiscountprice(Float.valueOf(productdiscountprice));
		product.setProducttypenumber(Integer.valueOf(producttypenumber));
		product.setProductweight(Float.valueOf(productweight));
		return olderShopService.addProduct(product);
	}
}
