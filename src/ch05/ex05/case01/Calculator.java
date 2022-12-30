package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	 /*
	public int add(int x, int y) {
		return x + y;
	}
	이건 위에 add에 int,int가 같아서 사용할 수 없다.
	add int,int,int는 가능하다.
	*/
	//오버로딩은 하나의 클래스에 메소드이름이 같고 
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
