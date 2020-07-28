package com.wat.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PersonAspect {
        @Pointcut("execution(*  com.wat.service.impl.PersonServiceImpl.*(..))")
        public   void   anyMethod(){}   /*
                                              Pointcut:声明一个切入点
                                              execution:执行的意思，执行代理方法进行拦截
                                              *       ：函数的返回值类型
                                              *       ：方法名    代表该类PersonServiceImpl中所有的方法
                                              ..      : 代表参数，代表任何参数
                                         */
        @Before("anyMethod()")
        public    void    doAccessCheck(){
        	      System.out.println("前置通知");
        }
        @AfterReturning("anyMethod()")
        public   void     doAfterReturing(){
        	      System.out.println("后置通知");
        }
        @After("anyMethod()")
        public  void      doAfter(){
        	      System.out.println("最终通知");
        }
        @AfterThrowing("anyMethod()")
        public   void     doAfterThrowing(){
        	      System.out.println("例外通知");
        }
        @Around("anyMethod()")
        public     Object    doAround(ProceedingJoinPoint    pip) throws Throwable{
        	      Object   resObject=pip.proceed();    //执行代理的方法   resObject：返回值
        	      return null;
        }
}
