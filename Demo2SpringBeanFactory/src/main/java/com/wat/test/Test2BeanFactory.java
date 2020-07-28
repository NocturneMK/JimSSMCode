package com.wat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.Product;
import com.wat.bean.factory.BeanFactory;

public class Test2BeanFactory {
        public static void main(String[] args) {
			      test2(); 
//        	      test1();
        	
        	
		}
        public  static   void  test2(){
    	      ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          /*
	           *  ac.getBean("product3"):相当于BeanFactory.createProduct3() 
	           */
    	      Product     product=(Product) ac.getBean("product3");
	          product.show();
        }
        public  static   void  test1(){
      	      ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          /*
	           * getBean("product2"):就相当于是beanFactory.createProduct()方法。
	           */
      	      Product     product=(Product) ac.getBean("product2");
	          product.show();
      }
       
        
}
