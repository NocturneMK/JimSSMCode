package com.jim.service.impl;

import com.jim.service.PersonService;

public class PersonServiceBean  implements    PersonService {
    public void init() {
		 System.out.println("初始化");
	}
    public PersonServiceBean() {
	     System.out.println("实例化对象");
	}
	public void save() {
		 System.out.println("保存数据");
	}
    public void  destroy() {
		 System.out.println("关闭打开的资源");
	}
}
