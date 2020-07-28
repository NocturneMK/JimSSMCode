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
/**
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述MyBatis对表进行curd.
 * @author         北京Jim老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
/*
 * 
 */
public class Test1MyBatis {
       public static void main(String[] args) throws IOException {
    	       //解析xml文件
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //创建会话工厂
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //创建会话对象,该对象可以对表进行操作
		       SqlSession           sqlSession=ssf.openSession();   
		       //操作
//		       test1_findById(sqlSession);
//		       test2_findByName(sqlSession);
//		       test3_findAll(sqlSession);
//		       test4_findByPage(sqlSession);
//		       test5_add(sqlSession);
		       
//		       test6_delete(sqlSession);
		       
//		       test7_update(sqlSession);
//		       test7_update1(sqlSession);
		       
		       sqlSession.close();
	   }
       public   static  void   test6_delete(SqlSession           sqlSession){
		       int  num=sqlSession.delete("test.deleteUser", 16);
		       System.out.println("num="+num);
		       sqlSession.commit();
	   }
       public   static  void  test5_add(SqlSession           sqlSession){
		       //假设从网页中获取User信息
		       User  user=new User();
		       user.setUsername("admin1");
		       user.setPassword("admin1");
		       
		       int  num=sqlSession.insert("test.insertUser", user);
		       System.out.println("num="+num);
		       sqlSession.commit();
	   }
       public   static  void  test4_findByPage(SqlSession           sqlSession){
		       int  page=1;
		       int  index=(page-1)*5;
		       List<User>   list=sqlSession.selectList("test.findUserByPage",index);
		       System.out.println(list.size());
	   }
       public   static  void  test3_findAll(SqlSession           sqlSession){
	       List<User>   list=sqlSession.selectList("test.findUserAll");
	       System.out.println(list.size());
       }
       public   static  void  test2_findByName(SqlSession           sqlSession){
    	   User   user=sqlSession.selectOne("test.findUserByName","xiaohongmao");  //查询user信息,不要重复，重复会报错
	       System.out.println(user.getUsername()+"   "+user.getPassword());
       }
       public   static  void  test1_findById(SqlSession           sqlSession){
    	   User   user=sqlSession.selectOne("test.findUserById",4);  //查询user信息
	       System.out.println(user.getUsername()+"   "+user.getPassword());
       }
       public  static  void   test7_update1(SqlSession           sqlSession){
	    	   User  user=sqlSession.selectOne("test.findUserById",1);
		       user.setUsername("admin1");
		       user.setPassword("admin1");
		       int  num=sqlSession.update("test.updateUser", user);
		       System.out.println("num="+num);
		       sqlSession.commit();
       }
       public  static  void   test7_update(SqlSession           sqlSession){
	    	   User  user=new User();
	    	   user.setId(1);
		       user.setUsername("admin");
		       user.setPassword("admin");
		       
		       int  num=sqlSession.update("test.updateUser", user);
		       System.out.println("num="+num);
		       sqlSession.commit();
       }
      
      
       
       
      
       
}
