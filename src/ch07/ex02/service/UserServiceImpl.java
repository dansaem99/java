package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}//이런 작업을 DI(Dependency Injection)라고 한다.
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
