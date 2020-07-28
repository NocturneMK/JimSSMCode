package com.wat.bean.factory;
import com.wat.bean.Product;
public class BeanFactory {
        private  Product  product;
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
	    public  void    PrintProduct(){
	    	System.out.println("Ãû³Æ£º"+product.getName()+"   ÊýÁ¿:"+product.getNum());
	    }
}
