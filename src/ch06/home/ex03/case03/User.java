package ch06.home.ex03.case03;

public class User extends Object {
	private String userName;
	private int age;

	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d살", userName, age);
	}
}
