package com.wat.dao;

import java.util.List;

import com.wat.bean.User;

public interface UserDAO {
         public    int    save(User  user);
         public    User   findById(int  id);
         public    List<User>   findAll();
         public    List<User>   findByPage(int page);
         public    int     update(User user,int  oldId);
         public    int     delete(int id);
}
