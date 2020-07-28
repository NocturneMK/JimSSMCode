package com.wat.dao.impl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.wat.dao.UserDAO;
public class UserDAOImpl  extends   JdbcDaoSupport   implements   UserDAO {
	public void add() {
				  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      
			      int   a=10/1;       //事务会回滚，上面和下面的代码都不会执行。
			      
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
	}
}

/*第一种情况：
                  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      
			      int   a=10/0;       //事务会回滚，上面和下面的代码都不会执行。
			      
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
			      
 第二种情况：
                  String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
			      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
			      jdbcTemplate.execute(sql);
			      try {
			    	  int   a=10/0;       //事务不会回滚，而且上面下面代码都执行。
				  } catch (Exception e) {
					  
				  }
			      
			      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
			      jdbcTemplate.execute(sql2);
  第三种：
                   try {
					      String   sql="insert  into  tb_user(username,password)values('Jik9','a9')";
					      JdbcTemplate      jdbcTemplate=this.getJdbcTemplate();
					      jdbcTemplate.execute(sql);
					      
					      int   a=10/0;       //能确定下面的代码不会执行，事务不会回滚，上面的代码会执行。
					      
					      String   sql2="insert  into  tb_user(username,password)values('Jik99','a99')";
					      jdbcTemplate.execute(sql2);
		      
				   } catch (Exception e) {
					   
				   }
*/