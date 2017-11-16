package com.sds.em.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.em.mapper.CartMapper;
import com.sds.em.mapper.OlderproductviewMapper;
import com.sds.em.mapper.ProductMapper;
import com.sds.em.mapper.ProductgroupMapper;
import com.sds.em.mapper.ProductpiclistMapper;
import com.sds.em.mapper.ProductrateMapper;
import com.sds.em.mapper.ProductstoreMapper;
import com.sds.em.mapper.ProducttypeMapper;
import com.sds.em.mapper.ProducttypetwoMapper;
import com.sds.em.mapper.ProductviewlistMapper;
import com.sds.em.po.Cart;
import com.sds.em.po.CartExample;
import com.sds.em.po.Message;
import com.sds.em.po.Olderproductview;
import com.sds.em.po.OlderproductviewExample;
import com.sds.em.po.Product;
import com.sds.em.po.ProductExample;
import com.sds.em.po.Productgroup;
import com.sds.em.po.Productpiclist;
import com.sds.em.po.ProductpiclistExample;
import com.sds.em.po.Productrate;
import com.sds.em.po.Productstore;
import com.sds.em.po.ProductstoreExample;
import com.sds.em.po.ProductstoreExample.Criteria;
import com.sds.em.po.Productviewlist;
import com.sds.em.po.ProductviewlistExample;
import com.sds.em.pojo.ProductrateExtend;
import com.sds.em.service.ShopViewFrontService;
import com.sds.em.shop.pojo.ProductAmount;
import com.sds.em.shop.pojo.ProductGroupExtend;
import com.sds.em.shop.pojo.productGradeExtend;
import com.sds.em.shop.pojo.productGradeExtend;

public class ShopViewFrontServiceImpl implements ShopViewFrontService {

	@Autowired
	ProductstoreMapper productstoreMapper;
	@Autowired
	ProductMapper productMapper;

	@Autowired
	ProducttypeMapper producttypeMapper;
	@Autowired
	ProducttypetwoMapper producttypetwoMapper;

	@Autowired
	OlderproductviewMapper olderproductviewMapper;

	@Autowired
	ProductrateMapper productrateMapper;

	@Autowired
	ProductpiclistMapper productpiclistMapper;
	@Autowired
	ProductgroupMapper productgroupMapper;

	@Autowired
	ProductviewlistMapper productviewlistMapper;
	@Autowired
	CartMapper cartMapper;

	@Override
	public Boolean addOlderProductBrowse(int olderid, int productid) {
		OlderproductviewExample olderproductviewExample = new OlderproductviewExample();
		com.sds.em.po.OlderproductviewExample.Criteria criteria = olderproductviewExample.createCriteria();
		criteria.andPviewolderidEqualTo(olderid);
		criteria.andPviewproductidEqualTo(productid);
		List<Olderproductview> viewList = olderproductviewMapper.selectByExample(olderproductviewExample);

		Olderproductview view = new Olderproductview();
		view.setPviewolderid(olderid);
		view.setPviewproductid(productid);
		view.setPviewdate(new Date());
		if (!viewList.isEmpty()) {// 说明这个商品，老人已经浏览了-修改浏览量就行
			int flag1 = 0;
			view.setPviewocount(viewList.get(0).getPviewocount() + 1);
			flag1 = olderproductviewMapper.updateByExampleSelective(view, olderproductviewExample);
			if (flag1 != 0) {
				return true;
			} else {
				return false;
			}

		} else {// 说明这个商品，老人第一次浏览，新增记录，浏览量为1
			int flag = 0;
			view.setPviewocount(1);
			flag = olderproductviewMapper.insert(view);
			if (flag != 0) {
				return true;
			} else {
				return false;
			}
		}

	}

	@Override
	public Message todayRecommend() throws Exception {
		try {
			List<Product> productList = productMapper.todayRecommend();
			if (productList != null) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message typeRecommend(String typecontent) throws Exception {
		try {
			List<Product> productList = productMapper.typeRecommend(typecontent);
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message productSearch(String info) throws Exception {
		try {
			List<Product> productList = productMapper.productSearch(info);

			List<ProductAmount> amountList = new ArrayList<ProductAmount>();

			for (Product i : productList) {
				ProductAmount productAmount = new ProductAmount();
				productAmount = productMapper.productSearchId(i.getProductid());
				amountList.add(productAmount);
			}
			if (!amountList.isEmpty()) {
				return new Message(true, "返回成功", amountList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message productSearchSort(String info, String sort) throws Exception {
		try {
			List<ProductAmount> productList = null;
			if (sort.equals("销量排序")) {
				productList = productMapper.productSearchSortA(info);
			} else if (sort.equals("价格优先")) {
				productList = productMapper.productSearchSortP(info);
			} else if (sort.equals("评价为主")) {

			}
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message typeTwoProducts(String typetwocontent) throws Exception {
		try {
			List<ProductAmount> amountList = productMapper.typeTwoRecommend(typetwocontent);
			if (!amountList.isEmpty()) {
				return new Message(true, "返回成功", amountList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message typeTwoProductsSort(String typetwocontent, String sort) throws Exception {
		try {
			List<ProductAmount> productList = null;
			if (sort.equals("销量排序")) {
				productList = productMapper.typeTwoRecommendA(typetwocontent);
			} else if (sort.equals("价格优先")) {
				productList = productMapper.typeTwoRecommendP(typetwocontent);
			}
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getProduct(int productid) throws Exception {
		try {
			ProductAmount productAmount = new ProductAmount();
			productAmount = productMapper.productSearchId(productid);
			List<String> picList = new ArrayList<String>();
			if (productAmount != null) {
				ProductpiclistExample productpiclistExample = new ProductpiclistExample();
				com.sds.em.po.ProductpiclistExample.Criteria criteria = productpiclistExample.createCriteria();
				criteria.andPproductidEqualTo(productid);

				List<Productpiclist> list = productpiclistMapper.selectByExample(productpiclistExample);

				for (Productpiclist p : list) {
					String pic;
					pic = p.getPpicurl();
					picList.add(pic);
				}
				productAmount.setPicList(picList);
				// 增加日浏览量和总浏览量

				ProductstoreExample productstoreExample = new ProductstoreExample();
				com.sds.em.po.ProductstoreExample.Criteria criteria2 = productstoreExample.createCriteria();
				criteria2.andStoreproductidEqualTo(productid);

				Productstore productstore = productstoreMapper.selectByExample(productstoreExample).get(0);

				productstore.setStoredaybrowse(productstore.getStoredaybrowse() + 1);
				productstore.setStoretotalbrowse(productstore.getStoretotalbrowse() + 1);
				int flag1 = 0;
				flag1 = productstoreMapper.updateByExampleSelective(productstore, productstoreExample);
				if (flag1 != 0) {// 库存表更新成功
					return new Message(true, "返回成功", productAmount);
				} else {
					return new Message(false, "数据库错误,库存表更新失败", null);
				}
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message repeatedView() throws Exception {
		try {
			List<Product> productList = productMapper.repeatedView();
			if (productList != null) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message repeatedOlderView(int olderid) throws Exception {
		try {
			List<Product> productList = olderproductviewMapper.repeatedOlderView(olderid);
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message getProductGrade(int productid) {
		try {
			List<ProductrateExtend> rateList = productrateMapper.getProductRateInfo(productid);
			int totalRate = rateList.size();
			int highRate = 0;
			int mediumRate = 0;
			int badRate = 0;

			double avg = 0.0;
			for (Productrate p : rateList) {
				if (p.getRatestar() >= 4) {
					highRate++;
				} else if (p.getRatestar() <= 2) {
					badRate++;
				} else {
					mediumRate++;
				}
				avg = avg + (p.getRatestar() / 5.0);
			}
			String percent = "" + (int) ((avg / totalRate) * 100);

			productGradeExtend productGradeExtend = new productGradeExtend();
			productGradeExtend.setPercent(percent);
			productGradeExtend.setBadRate(badRate);
			productGradeExtend.setHighRate(highRate);
			productGradeExtend.setMediumRate(mediumRate);
			productGradeExtend.setTotalRate(totalRate);
			if (productGradeExtend != null) {
				return new Message(true, "返回成功", productGradeExtend);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getProductRateInfo(int productid) {
		try {
			List<ProductrateExtend> rateList = productrateMapper.getProductRateInfo(productid);
			if (!rateList.isEmpty()) {
				return new Message(true, "返回成功", rateList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message GroupIndexView() {
		try {
			List<ProductGroupExtend> productList = productgroupMapper.GroupIndexView();
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message GroupEndView() {
		try {
			List<ProductGroupExtend> productList = productgroupMapper.GroupEndView();
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message GroupNoView() {
		try {
			List<ProductGroupExtend> productList = productgroupMapper.GroupNoView();
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message guessLikeView(int productid) {

		try {
			int typeTwoTypeId = productMapper.selectByPrimaryKey(productid).getTypetwotypeid();
			ProductExample productExample = new ProductExample();
			com.sds.em.po.ProductExample.Criteria criteria = productExample.createCriteria();
			criteria.andTypetwotypeidEqualTo(typeTwoTypeId);

			List<Product> productList = productMapper.selectByExample(productExample);
			/*
			 * int index = 0; for (int i = 0; i < productList.size(); i++) { if
			 * (productid == productList.get(i).getProductid()) { index = i; } }
			 * productList.remove(index);
			 */

			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message guessLikeOlderView(int olderid) {
		try {
			List<Product> productList = olderproductviewMapper.guessLikeOlderView(olderid);
			if (!productList.isEmpty()) {
				return new Message(true, "返回成功", productList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message magnifyingGlassView(int productid) {
		try {
			ProductviewlistExample productviewlistExample = new ProductviewlistExample();
			com.sds.em.po.ProductviewlistExample.Criteria criteria = productviewlistExample.createCriteria();
			criteria.andPviewpicproductidEqualTo(productid);
			List<Productviewlist> List = productviewlistMapper.selectByExample(productviewlistExample);
			if (!List.isEmpty()) {
				return new Message(true, "返回成功", List);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message preferentialView() {
		try {
			List<ProductAmount> amountList = productMapper.preferentialView();
			if (!amountList.isEmpty()) {
				return new Message(true, "返回成功", amountList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

	@Override
	public Message getProductGroup(int groupid) {
		try {
			Productgroup groupList = productgroupMapper.selectByPrimaryKey(groupid);
			if (groupList != null) {
				return new Message(true, "返回成功", groupList);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}

	}

	@Override
	public Message getOlderCartAmount(int olderid) {
		try {
			CartExample cartExample = new CartExample();
			com.sds.em.po.CartExample.Criteria criteria = cartExample.createCriteria();
			criteria.andCartolderidEqualTo(olderid);
			List<Cart> cartList = cartMapper.selectByExample(cartExample);
			if (!cartList.isEmpty()) {
				int count = cartList.size();
				return new Message(true, "返回成功", count);
			} else {
				return new Message(false, "数据库错误", null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Message(false, "数据库错误", null);
		}
	}

}
