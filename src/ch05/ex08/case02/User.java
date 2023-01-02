package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public User() {}
	
	public User(String userName, int age, LocalDate regDate) {
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
