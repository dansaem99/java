package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; //A = 65, a = 97, 0 = 48 상식으로 기억해야한다.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041; //10진수로 65이다. 유니코드이다.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041'; // 유니코드라는 뜻이다.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
	}
}
