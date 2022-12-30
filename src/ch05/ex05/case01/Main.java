package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {//보철머신이 이 메인을 콜한다.
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);// main메소드가 add를 콜한거다.
		result = calculator.add(1, 2, 3);
		
		System.out.print(result);
	}
}
