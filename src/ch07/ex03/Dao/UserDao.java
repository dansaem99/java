package ch07.ex03.Dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();//사용자를 선택한다.
	public void insertUser(User user);//사용자를 끼워 넣다. 추가
	public void updateUser(String userName);//사용자를 갱신한다. 수정
	public void deleteUser();//사용자를 삭제한다.
}
