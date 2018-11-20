package com.dao;

import com.dao.impl.UserDaoImpl;

public class UserDaoFactory {
	public static UserDao getInstance(){
		return new UserDaoImpl();
	}
}
