package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void sava(User user) {
		System.out.println("保存用户信息到数据库！！！！");
	}

}
