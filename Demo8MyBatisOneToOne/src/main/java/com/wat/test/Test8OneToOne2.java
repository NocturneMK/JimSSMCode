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

import com.wat.bean.Idcard;
import com.wat.bean.People;
import com.wat.mapper.IdcardCustomerMapper;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述主键关联和外键关联
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */

public class Test8OneToOne2 {
       public static void main(String[] args) throws IOException {
    	       //解析xml文件
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //创建会话工厂
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //创建会话对象,该对象可以对表进行操作
		       SqlSession           sqlSession=ssf.openSession();   
		       //获取UserMapper对象
		       IdcardCustomerMapper      idcardCustomMapper=sqlSession.getMapper(IdcardCustomerMapper.class);
		       
		       //操作
		       List<Idcard>        list=idcardCustomMapper.findIdCardPeople("李四");
		       for(Idcard   id:   list){
		    	          System.out.println(id.getId()+"   "+id.getIdcardcode()+"    "+id.getPic());
		    	          People   people=id.getPeople();
		    	          System.out.println(people.getName()+"   "+people.getSex()+"   "+people.getAge()+"   "+people.getIdcardid());
		       }
		       sqlSession.close();
	   }
}
