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
 * @Description:   ������ǽ���MyBatis�Ա����curd.
 * @author         ����Jim��ʦ 
 * @version        jdk8.0  
 * @Date         
                     һ������õ��Ķ������õ�����ɿ��ķ��������������
                     ��������ϰ�,��Ը��Ƹ�����ڵ��Լ���?
 */
/*
 * 
 */
public class Test1MyBatis {
       public static void main(String[] args) throws IOException {
    	       //����xml�ļ�
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //�����Ự����
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //�����Ự����,�ö�����ԶԱ���в���
		       SqlSession           sqlSession=ssf.openSession();   
		       //����
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
		       //�������ҳ�л�ȡUser��Ϣ
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
    	   User   user=sqlSession.selectOne("test.findUserByName","xiaohongmao");  //��ѯuser��Ϣ,��Ҫ�ظ����ظ��ᱨ��
	       System.out.println(user.getUsername()+"   "+user.getPassword());
       }
       public   static  void  test1_findById(SqlSession           sqlSession){
    	   User   user=sqlSession.selectOne("test.findUserById",4);  //��ѯuser��Ϣ
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
