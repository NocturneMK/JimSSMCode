package com.wat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.dao.impl.ProductDAOImpl;

public class Test5Ref {
         public static void main(String[] args) {
//        	 ProductDAOImpl  productDAOImpl=new   ProductDAOImpl();
//        	 productDAOImpl.addProduct();//
        	 
        	 
        	  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          ProductDAOImpl     productDAOIMPL=(ProductDAOImpl) ac.getBean("productDAOImpl6");//多态：接口引用指向实现类对象
	          productDAOIMPL.addProduct();
	          
	          
	          
	          
	          
         }
}
