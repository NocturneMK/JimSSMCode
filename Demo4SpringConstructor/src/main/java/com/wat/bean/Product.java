package com.wat.bean;


public class Product {
        private   Integer  id;
        private   String   name;
        private   double   jiage;
        public  Product(){
        	  
        }
        public Product(Integer  id,String name,double  jiage) {
        	   this.id=id;
        	   this.name=name;
        	   this.jiage=jiage;
		}
        
		public Integer getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public double getJiage() {
			return jiage;
		}
}
