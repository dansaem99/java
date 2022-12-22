package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		 c = a * b;
		System.out.println(c);
		
		c = (long)a * b; //overflow를 long를 써서 나타나게한다.
		System.out.println(c);
		
		int x = a * b / a;
		x = a / b * a;
		System.out.println(x);
	}
}
