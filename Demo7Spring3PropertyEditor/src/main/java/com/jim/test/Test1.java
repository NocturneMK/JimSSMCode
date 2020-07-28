package com.jim.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jim.bean.UserInfo;

/**
 * 这个类是讲述自定义属性编辑器
 * @author Administrator
 */
public class Test1 {
    public static void main(String[] args) {
	   ApplicationContext    applicationContext=new   ClassPathXmlApplicationContext("applicationContext.xml");
	   UserInfo      userInfo=(UserInfo)applicationContext.getBean("user1");
	   userInfo.printInfo();
	}
}
