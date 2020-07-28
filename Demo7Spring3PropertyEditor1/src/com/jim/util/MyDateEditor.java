package com.jim.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;
/*
 * Date:被Calendar类替换好多方法
 */
public class MyDateEditor  extends       PropertyEditorSupport{
	    public void setAsText(String text) throws IllegalArgumentException {
    	    System.out.println("text="+text);
    	    Date    date=new  Date(text);
	    	this.setValue(date);
	    }
}
