package ch04.ex04;

import java.util.Scanner;

public class C03InOnenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
		} while( !(1 <= input && input <= 9)); //과제: 자연수 1 이상 9이하를 입력할때까지 입력 받아라.
		
		System.out.println("끝.");
	}
}
