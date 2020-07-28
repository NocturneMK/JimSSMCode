package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

import com.wat.bean.User;
import com.wat.mapper.UserMapper;
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述MyBatis中resultMap用来指明列名跟属性名对应.
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test5ResultMap {
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
		       test1_findById(userMapper);
		       
		       sqlSession.close();
	   }
       public   static  void  test1_findById(UserMapper      userMapper){
	    	   User            user=userMapper.findUserById(6);
		       System.out.println(user.getName()+"   "+user.getMima());
      }
}
