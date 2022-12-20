package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		/*System.out.printf("%d, %d\n", a, b);
		{
			a= b;
			System.out.printf("%d, ", a);
		}
		b= 1;
		System.out.printf("%d", b); */
	}
}
/*
과제 : 두 변수의 데이터를 교환하라.
a: 1, b: 2
a: 2, b: 1
*/