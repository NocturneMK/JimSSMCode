package com.wat.mapper;
import java.util.List;
import com.wat.bean.User;
public interface UserMapper {
       public  User   findUserById(int id);
       public  User   findUserByName(String username);
       public  List<User>   findUserAll();
       public  List<User>   findUserByPage(int  index);
       public  int    insertUser(User  user);
       public  int    deleteUser(int  id);
       public  int    updateUser(User  user);
}
