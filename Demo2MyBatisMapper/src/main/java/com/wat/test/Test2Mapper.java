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
 * @Description:   这个类是讲述MyBatis中代理Mapper对表进行crud.
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test2Mapper {
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
//		       test2_findByName(userMapper);
//		       test3_findAll(userMapper);
//		       test4_findByPage(userMapper);
		       test5_add(userMapper, sqlSession);
//		       test6_delete(userMapper, sqlSession);
		       test7_update(userMapper, sqlSession);
		       
		       sqlSession.close();
	   }
       public  static  void   test7_update(UserMapper      userMapper,SqlSession           sqlSession){
    	       User            user=userMapper.findUserById(6);
		       user.setUsername("admin3");
		       user.setPassword("admin3");
		       
		       int  num=userMapper.updateUser(user);
		       System.out.println("num="+num);
		       sqlSession.commit();
       }
       public   static  void   test6_delete(UserMapper      userMapper,SqlSession           sqlSession){
		       int  num=userMapper.deleteUser(19);
		       System.out.println("num="+num);
		       sqlSession.commit();
       }
       public   static  void  test5_add(UserMapper      userMapper,SqlSession           sqlSession){
		       //假设从网页中获取User信息
		       User  user=new User();
		       user.setUsername("admin");
		       user.setPassword("admin");
		       
		       int  num=userMapper.insertUser(user);
		       System.out.println("num="+num);
		       sqlSession.commit();
       }
       public   static  void  test4_findByPage(UserMapper      userMapper){
		       int  page=1;
		       int  index=(page-1)*5;
		       List<User>   list=userMapper.findUserByPage(index);
		       System.out.println(list.size());
       }
       public   static  void  test3_findAll(UserMapper      userMapper){
		       List<User>   list=userMapper.findUserAll();
		       System.out.println(list.size());
       }
       public   static  void  test2_findByName(UserMapper      userMapper){
	    	   User            user=userMapper.findUserByName("admin1");
		       System.out.println(user.getUsername()+"   "+user.getPassword());
	   }
       public   static  void  test1_findById(UserMapper      userMapper){
	    	   User            user=userMapper.findUserById(6);
		       System.out.println(user.getUsername()+"   "+user.getPassword());
      }
}
