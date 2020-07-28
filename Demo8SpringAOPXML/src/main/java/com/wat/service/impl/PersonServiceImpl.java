package com.wat.service.impl;
import com.wat.service.PersonService;
public class PersonServiceImpl  implements   PersonService{
        public void  save(){
        	    System.out.println("执行了save方法");
//        	    int c=10/0;
        	    return ;
        }
		public Integer save1(int a) {  //int  a=10;
			    
			    System.out.println("save1");
//			    int   c=a/0;
			    
			    return 10;
		}
		
}
