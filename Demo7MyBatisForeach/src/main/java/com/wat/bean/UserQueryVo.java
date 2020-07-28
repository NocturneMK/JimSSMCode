package com.wat.bean;

import java.util.List;

public class UserQueryVo {
        private  UserInfo   userInfo;
		public UserInfo getUserInfo() {
			return userInfo;
		}
		public void setUserInfo(UserInfo userInfo) {
			this.userInfo = userInfo;
		}
		
		private   List<Integer>   lists;
		public List<Integer> getLists() {
			return lists;
		}
		public void setLists(List<Integer> lists) {
			this.lists = lists;
		}
}
