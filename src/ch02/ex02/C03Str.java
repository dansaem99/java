package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1; //데이터는 stack에 쌓인다.
		int b = 2; 
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; //git 도구
		System.out.println(sumStr);
		
	}
}
