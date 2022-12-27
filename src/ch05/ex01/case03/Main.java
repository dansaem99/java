package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		//user.userName
		
		user.setUserName("최한석");
		user.setAge(12);
		
		//System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
		
		user.setUserName("한아름");
		user.setAge(43);
		
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}
