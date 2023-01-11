package ch07.ex02.dao;

import ch07.ex02.domain.User;

public class UserDaoImpl implements UserDao{
	@Override
	public User selectUser() { //선택한 사용자 이름은 최한석
		return new User("최한석");
	}
}
