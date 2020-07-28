package com.wat.test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.service.impl.PersonServiceBean;


public class Test6 {
       public static void main(String[] args) {
			  ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	          PersonServiceBean    psb=(PersonServiceBean) ac.getBean("psb");
	          
	          Set   set=new   HashSet();
	          
	          Set<String>          sets=psb.getSets();
	          
	          List<String>         lists=psb.getLists();
	          
	          Map<String,String>   maps=psb.getMaps();
	          
	          Properties           pp=psb.getProperties();
	   }
}
