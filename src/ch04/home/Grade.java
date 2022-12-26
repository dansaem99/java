package ch04.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	 	int score = 0;
	 	String grade = "";
	   
	   
	 	System.out.print("점수 :");
	 	score = sc.nextInt();
	   
	 	if(score >= 98) grade = "A+";
	 	else if(score >= 94) grade = "A";
	 	else if(score >= 90) grade = "A-";
	   
	 	else if(score >= 88) grade = "B+";
	 	else if(score >= 84) grade = "B";
	 	else if(score >= 80) grade = "B-";
	   
	 	else grade = "C";
	   
	 	System.out.println(grade);
		

		int core = 0;
		String rade = "" ;
				
		System.out.print("점수:");
		score = sc.nextInt();
		
		if(score >= 98) grade = "A+";
		else if(score >= 94) grade = "A";
		else if(score >= 90) grade = "A-";
		 
		else if(score >= 88) grade = "B+";
		else if(score >= 84) grade = "B";
		else if(score >= 80) grade = "B-";
		
		else grade = "c";
		
		System.out.print(grade);

	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C

점수:100
A+
*/