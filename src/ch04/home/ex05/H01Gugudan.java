package ch04.home.ex05;

public class H01Gugudan {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 2; i <= 9; i++) {

			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j) );
			}
			System.out.println();
		}
	}
}
/*
과제: 구구단을 출력하라.
--

2*1=2
2*2=2
...
2*9=18

3*1=3
...
9*9=81
*/