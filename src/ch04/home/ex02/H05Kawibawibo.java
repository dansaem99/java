package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int youChoice = 0;
		int meChoice = (int)(Math.random() * 3) + 1;
		String you = "";
		String me = "";
		String result = "";
		
		System.out.print("1.가위, 2.바워, 3.보\n> ");
		youChoice = sc.nextInt();
		
		if(youChoice == 1) you = "가위";
		else if(youChoice == 2) you = "바위";
		else if(youChoice == 3) you = "보";
		else you = "다시 입력해주세요.";
		
		System.out.printf("you : %s\n", you);

		
		if(meChoice == 1) me = "가위";
		else if(meChoice == 2) me = "바위";
		else if(meChoice == 3) me = "보";

		System.out.printf("me : %s\n", me);
		
		if(youChoice>3) result = "";
		else if(youChoice == meChoice) result = "Fair."; 
		else if(youChoice > meChoice  && youChoice < 2 || meChoice > 2 ) result = "You win.";
		else if(youChoice < meChoice) result = "You lose.";
		System.out.print(result);
		
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라.
결과는 
You win.
You lose.
Fair.
중 하나이다.
--
1.가위, 2. 바위, 3. 보
>1
you : 가위
Me : 보

You win.
*/