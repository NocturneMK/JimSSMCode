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

import com.wat.bean.User;
import com.wat.bean.UserInfo;
import com.wat.bean.UserQueryVo;
import com.wat.mapper.UserMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述MyBatis中代理Mapper对表进行crud.
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test6ForEach {
       public static void main(String[] args) throws IOException {
    	       //解析xml文件
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //创建会话工厂
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //创建会话对象,该对象可以对表进行操作
		       SqlSession           sqlSession=ssf.openSession();   
		       //获取UserMapper对象
		       UserMapper      userMapper=sqlSession.getMapper(UserMapper.class);
		       
		       //操作
               List<Integer>    lists=new  ArrayList<Integer>();
               lists.add(1);
               lists.add(5);
               lists.add(6);
               
               UserQueryVo    uqv=new  UserQueryVo();
               uqv.setLists(lists);
               
               List<UserInfo>   lists2=userMapper.findUserByList(uqv);
               System.out.println(lists2.size());
		       
		       sqlSession.close();
	   }
}
