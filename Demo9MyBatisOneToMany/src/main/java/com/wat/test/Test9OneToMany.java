package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wat.bean.Customer;
import com.wat.bean.Ticket;
import com.wat.mapper.CustomerTicketMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述一对多
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test9OneToMany {
       public static void main(String[] args) throws IOException {
    	       //解析xml文件
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //创建会话工厂
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //创建会话对象,该对象可以对表进行操作
		       SqlSession           sqlSession=ssf.openSession();   
		       //获取UserMapper对象
		       CustomerTicketMapper      customerTicketMapper=sqlSession.getMapper(CustomerTicketMapper.class);
		       
		       //操作
		       Customer    ct=customerTicketMapper.findBycustomerName("小王");
		       System.out.println(ct.getCustomerTel()+"   "+ct.getCustomerName()+"  "+ct.getCustomerId());
		       
		       List<Ticket>    lists=ct.getLists();
		       for(Ticket   tt:  lists){
		    	        System.out.println(tt.getTicketAddress()+"    "+tt.getTicketPrice());
		       }
		       sqlSession.close();
	   }
}
