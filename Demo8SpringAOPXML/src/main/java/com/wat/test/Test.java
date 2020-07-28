package com.wat.test;

public class Test {
      public static void main(String[] args) {
	        int   a=0;
	        try {
	        	 System.out.println("前置通知");
	        	 System.out.println("环绕进入");
	        	 
	        	 //没有异常的
//	        	 System.out.println("本来要执行的service方法");
//	        	 int  a=10/1;
	        	 
	        	 //有异常的
	        	 System.out.println("本来要执行的service方法");
//	        	 int  a=10/0;
	        	 
	        	 System.out.println("环绕退出 ");
			} catch (Exception e) {
	              a=1;
				  System.out.println("例外通知");
			}finally{
	              System.out.println("最终通知");
			}
	        if(a==0){
	        	   System.out.println("后置通知");   //注意:在aop里面，如果上面代码没
	        }
	}
}
