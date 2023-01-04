package ch07.ex03.domain;

public class User {
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return this.userName;
	}
}
