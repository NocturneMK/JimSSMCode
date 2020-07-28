package com.wat.bianchengshi;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BianChengShiManager {
        private     PlatformTransactionManager   transactionManager;
        private     TransactionTemplate          transactionTemplate;
        private     JdbcTemplate                 jdbcTemplate;
		public PlatformTransactionManager getTransactionManager() {
			return transactionManager;
		}
		public void setTransactionManager(PlatformTransactionManager transactionManager) {
			this.transactionManager = transactionManager;
		}
		public TransactionTemplate getTransactionTemplate() {
			return transactionTemplate;
		}
		public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
			this.transactionTemplate = transactionTemplate;
		}
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		public  void  test(){
			      //transactionTemplate创建一个事务
			try {
				  
				  transactionTemplate.execute(
						  //new了一个匿名实现类对象
						  new  TransactionCallback<Object>() {
								public Object doInTransaction(TransactionStatus transactionStatus) {
								
									try {
										String  sql="insert  into   tb_user(username,password) values('mike3','a3')";
										jdbcTemplate.update(sql);  //跟前面是一样的
										
										String  sql3="insert  into   tb_user(username,password) values('mike33','a33')";
										jdbcTemplate.update(sql3);  //跟前面是一样的
										
										int   a=10/0;  //故意弄一个异常
										
										String  sql2="insert  into   tb_user(username,password) values('mike3333','a3333')";
										jdbcTemplate.update(sql2);  
										
									} catch (Exception e) {
									     transactionManager.rollback(transactionStatus);  //事务回滚，利用事务管理器回滚，上一步的操作就失效啦。
									     System.out.println(e.getMessage());
									}
									return null;
								}
				          }
				 );
			} catch (Exception e) {
				   System.out.println("事务的异常:"+e.getMessage());
			}
					      
		}
		
}
