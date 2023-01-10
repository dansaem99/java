package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		}; //2개 이상 쓰러면 {}를 사용하라.
		//리턴빼고 쓰고 2개 이상이면 {}를 사용하라.
		
		calculator = ( a, b) -> a + b;
		//리턴을 사용하면 이런식으로 {}쓴다.
		System.out.println(calculator.calc(1, 2));
	}
}
