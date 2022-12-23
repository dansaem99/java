package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		case 3 -> coupon = "1천원";//이건 3이면 천원이다.
		// default -> coupon = "1천원"; 기본은 천원이다.
		}// if는 여러가지의 조건을 넣을 수 있다.
		//switch는 한가지의 조건을 넣어서 많은 글을 적어야한다.
		
		System.out.println(coupon);
	}
}
