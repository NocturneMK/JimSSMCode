package com.jim.util;

import java.beans.PropertyEditorSupport;
import java.util.Date;
/*
 * Date:被Calendar类替换好多方法
 */
public class MyDateEditorCharacter  extends       PropertyEditorSupport{
	    /*
	     * text:是设置属性的值
	     * (non-Javadoc)
	     * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	     */
	    public void setAsText(String text) throws IllegalArgumentException {
	    	Character   sex='女';
	    	this.setValue(sex);
	    }
}
