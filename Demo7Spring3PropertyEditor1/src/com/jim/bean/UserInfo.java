package com.jim.bean;

import java.util.Date;

public class UserInfo {
     private    String    name;
     private    char      sex;
     private    Date      date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public   void  printInfo(){
		   System.out.println("出生日期:"+date.toLocaleString());
	}
}
