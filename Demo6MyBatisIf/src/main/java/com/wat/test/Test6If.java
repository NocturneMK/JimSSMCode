package com.wat.test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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
public class Test6If {
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
		       test1_findUserCount(userMapper);
		       
		       sqlSession.close();
	   }
       public   static  void  test2_findByName(UserMapper      userMapper){
    	       //从jsp获取的user信息
    	       UserInfo    uif=new   UserInfo();
    	       uif.setUsername("e");
    	       uif.setPassword("e");
    	   
    	       UserQueryVo     uqv=new   UserQueryVo();
    	       uqv.setUserInfo(uif);
	    	   User            user=userMapper.findUserByName(uqv);
		       System.out.println(user.getId()+"    "+user.getUsername()+"   "+user.getPassword());
	   }
       public   static  void  test1_findUserCount(UserMapper      userMapper){
	    	   UserInfo    uif=new   UserInfo();
		       uif.setUsername("李四");
		       uif.setPassword("李四");
		       
		       UserQueryVo     uqv=new   UserQueryVo();
    	       uqv.setUserInfo(uif);
    	   
	    	   int      num=userMapper.findUserCount(uqv);
		       System.out.println(num);
      }
}
