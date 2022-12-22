package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128;
		byte b = 127;
		//b = b + 1;
		
		b++; //b = b+1를 줄여서 쓴 코드이다. -128
		b++; //-127
		
		System.out.println(b);
	}
}
