package com.wat.test;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wat.bean.User;
import com.wat.dao.UserDAO;
/**
 * @ClassName:     Test2String.java
 * @Description:   开发者能够获得 JdbcTemplate 来访问数据库
 * @author         北京汪爱提老师 
 * @version        jdk8.0  
 * @Date         
                     一切你想得到的东西，得到它最可靠的方法是你配得上它
                     如果你是老板,会愿意聘用现在的自己吗?
 */
public class Test11JdbcTemplate {
        public static void main(String[] args) {
			    ApplicationContext    ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
			    UserDAO              userDAO=(UserDAO) ac.getBean("userDAO");
			    
			    //测试添加
//			    User  user=new User();
//			    user.setUsername("aaaa");
//			    user.setPassword("a");
//			    int    num=userDAO.save(user);
//			    System.out.println("num="+num);
			    
			    //测试查询
//			    int  id=1;
//			    User    user=userDAO.findById(id);
//			    System.out.println(""+user.getUsername()+"   "+user.getPassword());
			    
			    //测试查询所有
			    List<User>   list=userDAO.findAll();
			    System.out.println(list.size());
		}
}
