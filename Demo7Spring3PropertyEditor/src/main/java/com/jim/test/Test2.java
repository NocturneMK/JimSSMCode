package com.jim.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
       public static void main(String[] args) {
	    	Date   date=new   Date("1996/2/24");
	    	SimpleDateFormat     format=new  SimpleDateFormat("yyyyÄêMMÔÂddÈÕ E hh:mm:ss");
	    	String  time=format.format(date);
	    	Date   date2=new   Date(time);
	    	
	    	
	}
}
