package com.jim.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jim.service.PersonService;
/**
 * 这个类是讲述对bean的特殊处理
 * @author Administrator
 *
 */

/*
 *--接口ApplicationContext 
 *    --接口：ConfigurableApplicationContext
 *       --类AbstractApplicationContext
 */
public class Test1 {
        public static void main(String[] args) {
        	 AbstractApplicationContext    applicationContext=new  ClassPathXmlApplicationContext("applicationContext.xml");
        	 //默认执行构造函数和init方法
        	 PersonService     personService=(PersonService) applicationContext.getBean("personservice");
//        	 personService.save();
        	 System.out.println(123);
        	 //默认去执行destroy方法
        	 applicationContext.close();
		}
}
