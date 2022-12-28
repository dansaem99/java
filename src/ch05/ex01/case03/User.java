package ch05.ex01.case03;

public class User {
	private String userName; //private감춘다.
	private int age;
	
	public String getUserName() { //getter
		return userName;
	}
	
	public void setUserName(String userName) { //setter
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	//domain을 디자인할 때  캡슣와해야한다.
	//accessor 접근자 제어자 이다.
		
}//set쓰다 get읽다
