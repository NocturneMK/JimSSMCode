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
/*
 * Exception in thread "main" java.lang.NullPointerException
	at com.sun.proxy.$Proxy10.add(Unknown Source)
	at com.wat.test.Test1AOP1.main(Test1AOP1.java:22)
	说明环绕通知得有返回值，如果返回null,就报上面异常。
 */
/*
 * AOP  : Aspect   Oriented   Programming: 面向切面编程 ，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。
 *       是OOP的延续，是函数式编程的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各个部分之间的耦合度降低，提高
 *       程序的可重用性，同时也是为了提高编程效率。
 * OOP  ： Object   Oriented   Programming 面向对象编程      
 * 
 * 
 */
public class Test1AOP1 {
         public static void main(String[] args) {
			        ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			       
			        
			        PersonServiceImpl        ps=(PersonServiceImpl) ac.getBean("personService");
//			        ps.save();
			        ps.save1(10);
			        
			        
//			 这是方法可以被拦截才这样执行，如果拦截不了这个方法，那么可能其中一两个也会不执行。       
//			        前置--> 环绕进入--> 执行方法--> 环绕退出 --> 最终通知--> 后置通知(无异常)
//			        前置--> 环绕进入--> 执行方法--> 异常通知--> 最终通知(有异常)
			        
//			        int   a=0;
//			        try {
//			        	 //前置通知
			             //环绕进入
//			        	 //本来要执行的service方法   //要判断有没有异常
			             //环绕退出 
//					} catch (Exception e) {
//			              a=1;
//						 //例外通知
//					}finally{
			             //最终通知
//					}
//			        if(a==0){
//			        	 //后置通知   //注意:在aop里面，如果上面代码没
//			        }
			        
		}
}
