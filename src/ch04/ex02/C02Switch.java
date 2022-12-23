package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원"; //화살표는 arrow
		case "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		switch(grade) { //case 옆에 변수는 grade와 같은 변수를 적어야한다.
		case "gold", "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}
