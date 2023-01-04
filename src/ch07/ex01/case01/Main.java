package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c; // c타입이 b타입으로 프로모션한것.
		A a = c;
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		b = (B)c;
		
		a = (A)b;
		a = (A)c;
		
		//String s = (String)c; c가 String타입이 없기때문에 에러 
	}
}
