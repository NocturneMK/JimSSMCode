package com.wat.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.wat.ssm.po.Idcard;

public class IdcardController2  implements   HttpRequestHandler{
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		
		    //设置数据模型
		    request.setAttribute("idcardList", list);
		    //视图
		    request.getRequestDispatcher("/WEB-INF/page/IdcardList.jsp").forward(request, response);
	}

}
