package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();//사용자를 받다.
	public void addUser(User user); //사용자를 추가하다.
	public void fixUser(String userName); //사용자를 수정하다.
	public void delUser();//사용자를 삭제하다.
}
