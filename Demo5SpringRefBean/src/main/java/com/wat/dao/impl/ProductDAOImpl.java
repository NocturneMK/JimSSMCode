package com.wat.dao.impl;
import com.wat.util.ProductUtil;
/*
 * 局部变量没有默认值
 *  成员变量都有默认值：  String：null      boolean:false  int:0
 *                 所有引用数据类型默认值都是null,Integer,Boolean
 */
public class ProductDAOImpl {
	private    ProductUtil   productUtil;//ProductUtil   productUtil=xtz=new   ProductUtil();
	public ProductUtil getProductUtil() {
		return productUtil;
	}
	public void setProductUtil(ProductUtil productUtil){
		this.productUtil = productUtil;
	}
	public void addProduct() {
		     //null.close()
		     productUtil.close();
	}
}
