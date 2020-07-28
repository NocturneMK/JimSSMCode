package com.wat.bean.factory;
import com.wat.bean.Product;
public class BeanFactory {
       public    Product      createProduct(){
    	       return   new  Product();
       }
       public    static  Product     createProduct3(){
	           return   new  Product();
       }
}
