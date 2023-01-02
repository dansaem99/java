package ch05.home.ex06.case02선생님답;

import java.util.Scanner;

public class Console {
	   private static Scanner sc;
	   
	   static {
	      sc = new Scanner(System.in);
	   }
	   //static 맴버변수를 초기화 할 때 위와 같이 쓴다.
	   //바이트 코드가 로딩되면 sc변수가 생기고 
	   //명령문도 바로 시작된다.
	   
	   private static void inMsg(String msg) {
	      System.out.print(msg + "\n> ");
	   }
	   
	   public static String inStr(String msg) {
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
	   
	   public static int inNum(String msg) {
	      String input = "";
	      boolean isGood = false;
	      
	      do {
	    	  Console.inMsg(msg);
	    	  input = sc.nextLine();
	    	  isGood = input.matches("^[1-9][0-9]*");
	    	  if(!isGood) Console.err("자연수가 아닙니다.");
	      } while(!isGood);
	      
	      return Integer.parseInt(input);
	   }
	   
	   public static void info(String msg) {
	      System.out.println(msg);
	   }
	   
	   public static void err(String msg) {
	      System.out.println("ERROR] " + msg);
	   }
}
