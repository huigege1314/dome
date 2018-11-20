package com.service.impl;

import com.dao.UserDao;
import com.dao.UserDaoFactory;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	// 声明接口类型的引用，和具体实现类解耦合
		private UserDao dao;

		// dao 属性的setter访问器，会被Spring调用，实现设值注入
		public void setDao(UserDao dao) {
			this.dao = dao;
		}

		public void addNewUser(User user) {
			// 调用用户DAO的方法保存用户信息
			dao.sava(user);
		}

}
