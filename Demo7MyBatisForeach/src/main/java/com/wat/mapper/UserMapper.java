package com.wat.mapper;
import java.util.List;

import com.wat.bean.User;
import com.wat.bean.UserInfo;
import com.wat.bean.UserQueryVo;
public interface UserMapper {
	      public  List<UserInfo>   findUserByList(UserQueryVo    uqv);
}
