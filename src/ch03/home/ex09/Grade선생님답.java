package ch03.home.ex09;

import java.util.Scanner;

public class Grade선생님답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0; //국어점수
		int eng = 0; //영어점수
		int math = 0;//수학점수
		int tot =0;//총점
		double avg = 0;//평균
		char grade = 0;//학점
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
<<<<<<< HEAD
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
=======
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'c';
>>>>>>> refs/remotes/origin/master
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", tot, avg, grade);
	}
}
