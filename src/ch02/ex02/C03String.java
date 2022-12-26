package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1; //데이터는 stack에 쌓인다.
		int b = 2; 
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		int i = Integer.parseInt(sumStr);
		
		String s = a + b + ""; // 숫자의 3이 아니라 문자의 3이다.
		System.out.println(s);
		
		s = "" + a + b; // "1" + b 이고 ""은 붙여 놓기로 설정해서 "12"이다.
		System.out.println(s);
		
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
	}
}
