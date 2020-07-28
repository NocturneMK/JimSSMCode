package com.wat.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class PersonAspect {
        public   void   anyMethod(){
        	      System.out.println("执行了切入点!");
        }   
        public    void    doAccessCheck(){             //拦截方法里面有int型参数的函数，add和save不会拦截
        	      System.out.println("前置通知");
        }
        public   void     doAfterReturing(){
        	      System.out.println("后置通知");
        }
        public  void      doAfter(){
	  	      System.out.println("最终通知");
	    }
        public  void      doAfter1(int  p){
        	      System.out.println("p="+p);
        	      System.out.println("最终通知");
        }
        public   void     doAfterThrowing(){
        	      System.out.println("例外通知");
        }
        public     Object    doAround(ProceedingJoinPoint    pip) throws Throwable{
        	      System.out.println("进入方法啦");
        	      //获取对应函数的返回值，并且执行我们的代理的方法
        	      Object   resObject=pip.proceed();    //执行代理的方法   resObject：返回值

        	      System.out.println("退出方法啦，"+resObject);
        	      return resObject;
        }
}
