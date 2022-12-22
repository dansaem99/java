package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print("국어: "); a = sc.nextInt();
		System.out.print("영어: "); b = sc.nextInt();
		System.out.print("수학: "); c = sc.nextInt();
				
		System.out.println();
		
		int d = a + b + c;
		System.out.print("총점: ");
		System.out.println(d);
		
		double e = 1.0 * d / 3;
		double f = (int) ( e * 10) / 10.0 ;
		System.out.print("평균: ");
		System.out.println(f);
		
		System.out.print("학점: ");
		char mean = f >= 90 && f <= 100 ? 'A' : (f >= 80 ? 'B' : 'c' );
		System.out.println(mean);
	}
}
/*
국어, 영어, 수학 점수를 입력한다.
초점, 평균, 학점을 출력한다.
평균점수는 소수점 이하 한자리까지만 출력한다.

90 <= mean <= 100 : A
80 <= mean < 90   : B
      mean <80    : C

국어 : 95
영어 : 100
수학 : 100

총점 : 295
평균 : 98.3
학점 : A
*/