package com.wat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.Product;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述跟bean类属性传值
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test4Constructor {
         public static void main(String[] args) {
        	    test2_gouzao();
		}
         public  static   void  test2_gouzao(){
       	     ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          Product     product=(Product) ac.getBean("product2");//多态：接口引用指向实现类对象
	          System.out.println("name="+product.getName());
       }
}
