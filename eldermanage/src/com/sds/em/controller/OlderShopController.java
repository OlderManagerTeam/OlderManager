package com.sds.em.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.po.Oldersick;
import com.sds.em.po.Product;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productpiclist;
import com.sds.em.po.Productviewlist;
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
	public @ResponseBody Message entryproduct(Product product, MultipartFile productImg, String productUpondate,@RequestParam(value="fileview",required=true)MultipartFile[] fileview,
			@RequestParam(value="filepic",required=true)MultipartFile[] filepic
			)
			throws Exception {
		List<Productpiclist> productpiclist=new ArrayList<Productpiclist>();
		List<Productviewlist> productviewlist=new ArrayList<Productviewlist>();
		String pic_path = "E:\\oldermanageresource\\productimg\\";
		String picUrl = "/productimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		if (!productImg.isEmpty()) {
			File productimg = new File(pic_path + newFileName);
			productImg.transferTo(productimg);
		}
		product.setProductimg(picUrl + newFileName);
		Date date = new Date();
		if (!productUpondate.isEmpty()) {
			date = DateSimp.simp(productUpondate);
		}
		if(filepic.length>0){
			String productpic_path = "E:\\oldermanageresource\\productpic\\";
			String url="/productpic/";
			for(MultipartFile filepicsingle:filepic){
				Productpiclist Productpic=new Productpiclist();
				newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
				File filePicSingle = new File(productpic_path + newFileName);
				filepicsingle.transferTo(filePicSingle);
				Productpic.setPpicurl(url + newFileName);
				productpiclist.add(Productpic);
			}
		}
		if(fileview.length>0){
			String productview_path = "E:\\oldermanageresource\\productview\\";
			String url="/productview/";
				Productviewlist productview=new Productviewlist();
				newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
				File filePicSingle = new File(productview_path + newFileName);
				fileview[0].transferTo(filePicSingle);
				productview.setPviewpicsmallpic(url + newFileName);
				newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
				filePicSingle = new File(productview_path + newFileName);
				fileview[1].transferTo(filePicSingle);
				productview.setPviewpicpic(url + newFileName);
				newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
				filePicSingle = new File(productview_path + newFileName);
				fileview[2].transferTo(filePicSingle);
				productview.setPviewpicbigpic(url + newFileName);
				productviewlist.add(productview);
		}
		product.setProductupondate(date);	
		return olderShopService.product(product,productpiclist,productviewlist);
	}

	// wuwenbo,修改商品信息
	@RequestMapping(method = RequestMethod.POST, value = "product/infoupdate")
	public @ResponseBody Message alterproduct(Product product, MultipartFile productImg, String productUpondate)
			throws Exception {
		String pic_path = "E:\\oldermanageresource\\productimg\\";
		String picUrl = "/productimg/";
		String newFileName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".jpg";
		Product productold = (Product) olderShopService.getproductinfo(product.getProductid()).getData();
		String[] productoldsplit = productold.getProductimg().split("/");
		String productoldname = productoldsplit[productoldsplit.length - 1];

		if (!productImg.isEmpty()) {
			File oldproductimg = new File(pic_path + productoldname);
			if (oldproductimg.exists())
				oldproductimg.delete();
			File productimg = new File(pic_path + newFileName);
			productImg.transferTo(productimg);
			product.setProductimg(picUrl + newFileName);
		}
		Date date = new Date();
		if (!productUpondate.isEmpty()) {
			date = DateSimp.simp(productUpondate);
		}
		product.setProductupondate(date);
		return olderShopService.productalter(product);
	}

	// wuwenbo,删除商品信息
	@RequestMapping(method = RequestMethod.DELETE, value = "product/info")
	public @ResponseBody Message deleteproduct(int productid) {
		return olderShopService.productdelete(productid);
	}

	// wuwenbo,查看订单列表
	@RequestMapping(method = RequestMethod.GET, value = "orders")
	public @ResponseBody Message getorders() {
		return olderShopService.getorders();
	}

	// wuwenbo,查看订单评价列表
	@RequestMapping(method = RequestMethod.GET, value = "orders/rate")
	public @ResponseBody Message getordersrate(int ordersid) {
		return olderShopService.getordersrate(ordersid);
	}

	// wuwenbo,删除订单
	@RequestMapping(method = RequestMethod.DELETE, value = "order")
	public @ResponseBody Message deleteorder(int ordersid) {
		return olderShopService.deleteorder(ordersid);
	}

	// wuwenbo,确认订单
	@RequestMapping(method = RequestMethod.POST, value = "order")
	public @ResponseBody Message orderok(int ordersid) {
		return olderShopService.orderok(ordersid);
	}

	// wuwenbo,取消订单
	@RequestMapping(method = RequestMethod.POST, value = "ordercancel")
	public @ResponseBody Message ordercancel(int ordersid) {
		return olderShopService.ordercancel(ordersid);
	}

	// wuwenbo,查看库存
	@RequestMapping(method = RequestMethod.GET, value = "productstore")
	public @ResponseBody Message getproductstore() {
		return olderShopService.getproductstore();
	}

	// wuwenbo,修改商品库存
	@RequestMapping(method = RequestMethod.POST, value = "productstore")
	public @ResponseBody Message addproductstore(int productid, int productcount) {
		return olderShopService.addproductstore(productid, productcount);
	}

	// wuwenbo,查看团购表
	@RequestMapping(method = RequestMethod.GET, value = "productgroup")
	public @ResponseBody Message getproductgroup() {
		return olderShopService.getproductgroup();
	}

	// wuwenbo,取消或删除团购
	@RequestMapping(method = RequestMethod.DELETE, value = "productgroup")
	public @ResponseBody Message deleteproductgroup(int groupid) {
		return olderShopService.deleteproductgroup(groupid);
	}

	// wuwenbo,结束并生成订单
	@RequestMapping(method = RequestMethod.POST, value = "productgroup/orders")
	public @ResponseBody Message ordersproductgroup(int groupid) {
		return olderShopService.ordersproductgroup(groupid);
	}

	// wuwenbo,查看团购参加者
	@RequestMapping(method = RequestMethod.GET, value = "productgroup/join")
	public @ResponseBody Message productgroupjoin(int groupid) {
		return olderShopService.productgroupjoin(groupid);
	}

	// wuwenbo,参看订单详情
	@RequestMapping(method = RequestMethod.GET, value = "orders/orderlist")
	public @ResponseBody Message getorderlist(int orderid) {
		return olderShopService.getorderlist(orderid);
	}

	// wuwenbo,发起新团购
	@RequestMapping(method = RequestMethod.POST, value = "productgroup/info")
	public @ResponseBody Message addproductgroup(String grouppublishDate, String groupstartDate, String groupstarttime,
			String groupfinishDate, Productgroup productgroup) {
		if (grouppublishDate != "")
			productgroup.setGrouppublishdate(new Date());
		Date groupstartdate = new Date();
		if (grouppublishDate != "") {
			try {
				groupstartdate = DateSimp.simp(groupstartDate);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if (groupstarttime != "") {
				SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm");
				try {
					groupstartdate = sdf.parse(groupstartDate + " " + groupstarttime);
				} catch (ParseException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			productgroup.setGroupstartdate(groupstartdate);
			if(groupfinishDate!=""){
			Long finishDate = Long.valueOf(groupfinishDate);
			groupstartdate.setTime(groupstartdate.getTime() + finishDate * 1000 * 60 * 60);}
			productgroup.setGroupfinishdate(groupstartdate);
		}
		productgroup.setGroupstatus("未开始");
		productgroup.setGrouppresentpeople(0);
		return olderShopService.addproductgroup(productgroup);
	}
	
	// wuwenbo,上传图片
	@RequestMapping(method = RequestMethod.POST, value = "uploadpic")
	public @ResponseBody String uploadpic(String grouppublishDate, String groupstartDate, String groupstarttime,
			String groupfinishDate, Productgroup productgroup,MultipartFile file_data ) {
				return "12345678";
	}
}
