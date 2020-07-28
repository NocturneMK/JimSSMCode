package com.jim.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;
/*
 * Date:被Calendar类替换好多方法
 */
public class MyDateEditorDate  extends       PropertyEditorSupport{
	    /*
	     * text:是设置属性的值
	     * (non-Javadoc)
	     * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	     */
	    public void setAsText(String text) throws IllegalArgumentException {
    	    System.out.println("text="+text);
    	    Date    date=new  Date(text);
    	    
    	    
    	    //date类型  this：本类对象    setValue：是父类的方法    给bean类中Date类型的属性赋值
    	    Date  date2=new  Date();
	    	this.setValue(date2);
	    }
}
