package com.wat.bean;

import java.util.List;

public class Customer {
         private     Integer   customerId;
         private     String    customerName;
         private     Integer   customerTel;
         private     List<Ticket>    lists;
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Integer getCustomerTel() {
			return customerTel;
		}
		public void setCustomerTel(Integer customerTel) {
			this.customerTel = customerTel;
		}
		public List<Ticket> getLists() {
			return lists;
		}
		public void setLists(List<Ticket> lists) {
			this.lists = lists;
		}
}
