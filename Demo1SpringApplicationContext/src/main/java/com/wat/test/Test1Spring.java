package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.dao.ProductDAO;
import com.wat.dao.impl.ProductDAOImpl;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述Spring测试的第一个例子
 * @author         jim老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test1Spring {
         public static void main(String[] args) {
        	      //解析xml文件  多态   接口引用指向了实现类对象
        	      ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
        	      //获取对象  CGLIB代理      JDK代理
        	      //多态的本质：  编译看左边   运行看右边
		          ProductDAOImpl    productDAOImpl=(ProductDAOImpl) ac.getBean("productDAOImpl");//多态：接口引用指向实现类对象
		          int               num=productDAOImpl.addProduct();
		          System.out.println("num="+num);
		          
		}
}
