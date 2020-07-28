package com.wat.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wat.bean.Product;
import com.wat.bean.User;

/*
 * @Autowired:按类型，属性名跟id名不一致没关系
 * @Autowired@Qualifier("product1"):按类型，product1必须跟id一致
 * 
 * 
 * @Resource：按属性/id名称，如果名称不一致也没关系，它会再按类型
 * @Resource(name="user1"):user1必须跟id一致。
 */
public class ProductDao {
//	     @Autowired
//	     Product  product;//null
	     
		 @Autowired@Qualifier("product1")
	     Product  product;//null
	
//	     @Resource
//        User     user;
         
	     @Resource(name="user1")
         User     user;
         
	     public    void find(){
        	      String  name=product.getName();
        	      System.out.println("name="+name);
        	      
        	      System.out.println("user="+user);
         }
         
}
