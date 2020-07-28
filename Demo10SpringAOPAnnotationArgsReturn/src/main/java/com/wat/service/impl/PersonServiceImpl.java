package com.wat.service.impl;
import com.wat.service.PersonService;
public class PersonServiceImpl  implements   PersonService{
        public void  save(){
        	    System.out.println("执行了save方法");
        }
		public void update(int a) {
			System.out.println("执行了update方法  a:"+a);
		}
		public int add() {
			System.out.println("执行了add方法");
			return 0;
		}
		
}
