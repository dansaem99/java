package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 작업을 할때 위와 같이 적으면 된다. sc는 변수다. sanner
		//글자아래 빨간줄은 컴파일러 알아듣지 못해서 발생하는 일이다.
		// 자동으로 컴파일러 하기때문에 계속 뜨는것이다. 오타가 없는데 뜰때는 ctrl+Shift+o를 눌러준다.
		/*
		System.out.print("문자열을 입력하세요.\n> ");
		
		/*
		sc.nextLine();
		System.out.println("입력했습니다."); 
		*/
		//과제: '<입력값>을 입력했습니다.'를 출력하라.
		/*
		String str = sc.nextLine(); //soft coding 
		System.out.printf("%s을 입력했습니다.", str); */	

		System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();
		System.out.println( i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		i = sc.nextInt(); sc.nextLine();
		System.out.println( i + "을 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		System.out.println( str + "을 입력했습니다.");

		
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(1); //0은 hello에서 h이다.
		System.out.println(c+ "를 입력했습니다.");
	}
}