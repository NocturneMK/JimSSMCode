package com.jim.bean;
import java.util.Date;
public class UserInfo {
     private    String    name;
     private    Character      sex;
     private    Date      date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public   void  printInfo(){
		   System.out.println("姓名:"+name+"     性别:"+sex+"     出生日期:"+date.toLocaleString());
	}
}
