package ch07.ex03.persentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		 String input = "";
		  boolean isGood = false;
		  
		  do {
		     Console.inMsg(msg);
		     input = sc.nextLine();
		     isGood = input.matches("[a-zA-Z가-힣]+");
		     if(!isGood) Console.err("문자가 아닙니다.");
		  } while(!isGood);
		  
		  return input;
	}
	
	static int inNum(String msg) {
	  String input = "";
	  boolean isGood = false;
	  
	  do {
	     Console.inMsg(msg);
	     input = sc.nextLine();
	     isGood = input.matches("[0-9]+");
	     if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
	  }while(!isGood);
	  
	  return Integer.parseInt(input);
	}
	
	static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
