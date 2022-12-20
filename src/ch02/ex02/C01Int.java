package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		//정수 리터럴
		//정수 리터럴 저장할 수 있는 타입은 
		//byte, char, shory, int, long 이다.
		int x = 10; //decimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal 8진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; //hexa 16진수 
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; //2진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; // _는 숫자에 포함을 넣어도 숫자로 인식한다.
		System.out.println(x + 1);
		
		//실수 리터럴
		double y = 1e1;
		System.out.println(y); //실수 리터럴의 타입은 float, double이 있다.
 	}
}
/* 1234567 타입이 숫자이고
1,234,567은 타입이 캐릭터이다. 
숫자에 _와 $만 허용이 된다. 따라서 다른 특수문자는 숫자에 포함인 안되므로
문자타입으로 변한다.*/