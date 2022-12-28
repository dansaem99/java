package ch05.home.ex02;

import java.util.Scanner;

public class Main선생님답 {
	public static void main(String[] args) {
		Paper paper = new Paper();
		String msg = "";
		String writerName = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		
		do {
			System.out.print("메세지: ");
			msg = sc.nextLine();
			isGood = msg.matches("[a-zA-Z가-힣]+");
			if(isGood) paper.setMsg(msg);
			else System.out.println("ERROR] 메세지를 입력하세요.");
		} while(!isGood);
		
		isGood = false;
		do {
			System.out.print("작성자명: ");
			writerName = sc.nextLine();
			isGood = writerName.matches("[a-zA-Z가-힣]+");
			if(isGood) paper.setWriterName(writerName);
			else System.out.println("ERROR] 이름을 입력하세요.");
		} while(!isGood);
		
		System.out.printf("\n%s form %s", paper.getMsg(), paper.getWriterName());
	}
}
