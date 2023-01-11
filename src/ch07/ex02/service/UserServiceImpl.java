package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) { //인터페이스는 객체를 못만들어서 Ipml를 넣어 객체를 만들 수 있게 해준다.
		this.userDao = userDao;
	}//이런 작업을 DI(Dependency Injection)의존성 주입라고 한다.
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
