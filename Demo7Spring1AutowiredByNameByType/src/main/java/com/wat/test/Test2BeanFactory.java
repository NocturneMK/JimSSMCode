package com.wat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.Product;
import com.wat.bean.factory.BeanFactory;
/**
 * 这个类是讲述通过名称注入
 * @author Administrator
 *
 */
public class Test2BeanFactory {
        public static void main(String[] args) {
//        	      test1ByName();
        	      test2();
		}
        public  static   void  test1ByName(){
			  ApplicationContext   applicationContext=new   ClassPathXmlApplicationContext("applicationContext.xml");
    	      BeanFactory     beanFactory=(BeanFactory) applicationContext.getBean("beanFactory");
    	      beanFactory.PrintProduct();
        }
		public  static   void  test2(){
        	  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	   	      BeanFactory     beanFactory=(BeanFactory) ac.getBean("beanFactory");
	   	      beanFactory.PrintProduct();
        }
}
