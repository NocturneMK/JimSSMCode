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

import com.wat.ssm.mapper.IdcardMapper;
import com.wat.ssm.po.Idcard;
/**
 * 
 * @ClassName:     Test2String.java
 * @Description:   这个类是讲述测试逆向工程
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test11NiXiang {
       public static void main(String[] args) throws IOException {
    	       //解析xml文件
		       InputStream          is=Resources.getResourceAsStream("SlqMapCongfig.xml");
		       //创建会话工厂
		       SqlSessionFactory    ssf=new   SqlSessionFactoryBuilder().build(is);
		       //创建会话对象,该对象可以对表进行操作
		       SqlSession           sqlSession=ssf.openSession();   
		       //获取UserMapper对象
		       IdcardMapper     idcardMapper=sqlSession.getMapper(IdcardMapper.class);
		      
		       //查询
//		       Idcard     idcard=idcardMapper.selectByPrimaryKey(2);
//		       System.out.println(idcard.getId()+"   "+idcard.getIdcardcode()+"   "+idcard.getPic());
		       
		       //添加
//		       Idcard   idcard=new  Idcard();
//		       idcard.setIdcardcode("999999");
//		       idcard.setPic("9999.png");
//		       idcardMapper.insert(idcard);
		       
		       //删除
//		       int  id=2;
//		       int    num=idcardMapper.deleteByPrimaryKey(id);
		       
		       //修改
		       Idcard     idcard=idcardMapper.selectByPrimaryKey(3);
		       idcard.setIdcardcode("8888888");
		       idcard.setPic("888888.png");
		       int     num=idcardMapper.updateByPrimaryKey(idcard);
		       
		       sqlSession.commit();
		       sqlSession.close();
	   }
}
