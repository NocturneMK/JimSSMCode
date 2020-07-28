package com.wat.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wat.bean.User;

public class UserRowMapper implements   RowMapper{
	/*
	 * ªÒ»°user
	 * (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Object mapRow(ResultSet res, int  index) throws SQLException {
		User   user=new  User();
		user.setId(res.getInt("id"));
		user.setUsername(res.getString("username"));
		user.setPassword(res.getString("password"));
		return user;
	}
        
}
