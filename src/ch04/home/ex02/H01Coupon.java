package ch04.home.ex02;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if(grade == 1) coupon = "5만원";
		else if (grade ==2) coupon = "1만원";
		else coupon = "1천원";
		
		System.out.println(coupon);
	}
}
/*
과제 : ch04.ex02.C01Swich 를 if로 refactoring 하라.
*/