package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.Product;
import com.wat.dao.ProductDao;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述跟bean类属性传值
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test7Annotation {
         public static void main(String[] args) {
        	  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
              ProductDao  pd=(ProductDao) ac.getBean("productDao");
              pd.find();
         }
}
