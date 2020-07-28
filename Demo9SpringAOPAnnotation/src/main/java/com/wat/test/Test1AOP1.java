package com.wat.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.service.PersonService;
import com.wat.service.impl.PersonServiceImpl;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述面向切面编程
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test1AOP1 {
         public static void main(String[] args) {
			        ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			        PersonService        ps=(PersonService) ac.getBean("personService");
			        ps.save();
			        
			        
//			        try {
//			        	 //前置通知
//			        	 //异常的代码
//						 //后置通知
//					} catch (Exception e) {
//						 //例外通知
//					}finally{
//						 //最终通知
//					}
			        
		}
}
