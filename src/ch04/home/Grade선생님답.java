package ch04.home;

import java.util.Scanner;

public class Grade선생님답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";
		
		System.out.print("점수 :");
	 	score = sc.nextInt();
	 	
	 	tenDigit = score / 10;
	 	oneDigit = score % 10;
	 	
	 	if(tenDigit >= 9) grade = "A";
	 	else if(tenDigit >= 8) grade = "B";
	 	else grade = "C";
	 	
	 	if(score >= 80)	{
	 		if(oneDigit >= 8 || tenDigit == 10) grade += "+";
	 		else if(0 <= oneDigit && oneDigit <4) grade += "-";
	 	}
	 	
	 	System.out.println(grade);
	}
}//tradeoff
