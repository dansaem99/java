package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		//과제 : 초기값을 i = 1상황에서, 0 이상 9 이하를 출력하라.
		
		for(int i = 1; i < 11; i++)
			System.out.print(i - 1 + " ");
	}
}
