package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String input = "";
		int length = 0;
		
		do {
			System.out.print("입력: ");
			num = sc.nextInt();
			input = sc.nextLine();
			length = input.length();
		} while( !(0 <= num && num <= 9));
		while(length != 0);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.println("끝.");
	} 
}
/*
과제: 한자리 자연수를 입력 받아라.
*/