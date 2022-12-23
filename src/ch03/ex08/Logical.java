package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 > 1 && 2 > 1;
		b = 2 > 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // ||는 x가 트루이기 때문에 y를 계산안한다.
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0; // |는 x가 트루이고 y를 계산한다.
		
		System.out.printf("x: %d, y: %d, b: %b" , x, y, b);
	}
}
