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
		String errMsg = "다시 입력해주세요.";
		String tmp = "";
		
		do {
			username = false;
			username = tmp.matches("[a-zA-z]+");
			if(username) userName = Integer.parseInt(tmp);
			else System.out.println(errMsg);
		} while(!username);
				
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
}
