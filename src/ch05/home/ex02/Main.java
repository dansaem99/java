package ch05.home.ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName = "";
		String msg = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		
		do {
			System.out.print("메세지: ");
			msg = sc.nextLine();
			isGood = msg.matches("[a-zA-Z가-힟]+");
			if(!isGood) System.out.println("ERROR] 메세지를 입력하세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("작성자명: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힟]+");
			if(!isGood) System.out.println("ERROR] 이름을 입력하세요.");
		} while(!isGood);
		
		Board board = new Board();
		board.setMsg(msg);
		board.setUserName(userName);
		
		System.out.printf("\n%s form %s", board.getMsg(), board.getUserName());
	}
}
/*
과제: 종이에 메세지와 작성자명을 기록하라.
--

메세지: hello
작성자명 : terry

hello form terry.
*/