package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate subscription;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		boolean username = false;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getSubscription() {
		return subscription;
	}
	
	public void setSubscription(LocalDate subscription) {
		this.subscription = subscription;
	}

	public void setRegDate(LocalDate regDate) {
		// TODO Auto-generated method stub
		
	}

	public Object getRegDate() {
		// TODO Auto-generated method stub
		return null;
	}
}
