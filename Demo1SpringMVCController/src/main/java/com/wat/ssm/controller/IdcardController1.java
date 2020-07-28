package com.wat.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.wat.ssm.po.Idcard;

public class IdcardController1  implements   Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		    System.out.println("进入了handleRequest方法");
		    List<Idcard>    list=new  ArrayList<Idcard>();
		    
		    Idcard     idcard=new  Idcard();
		    idcard.setId(1);
		    idcard.setIdcardcode("66666");
		    idcard.setPic("666.png");
		    
		    Idcard     idcard2=new  Idcard();
		    idcard2.setId(2);
		    idcard2.setIdcardcode("88888");
		    idcard2.setPic("888888.png");
		    
		    list.add(idcard);
		    list.add(idcard2);
		    
		    //创建modelAndview对象准备填充数据，设置视图
		    ModelAndView     mav=new   ModelAndView();
		    mav.addObject("idcardList",list);     //传数据给jsp
		    mav.setViewName("IdcardList");//跳转到jsp
	     	return mav;          /*返回结果给DispatcherServlet*/
	}
}
