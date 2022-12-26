package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
		} while( !(0 <= input && input <= 9));
		
		System.out.println("끝.");
	} 
}
/*
과제: 한자리 자연수를 입력 받아라.
*/