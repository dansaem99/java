package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
   private static Scanner sc;
   
   static {
      sc = new Scanner(System.in);
   }
   
   private static void inMsg(String msg) {
      System.out.print(msg + "\n>");
   }
   
   public static String inStr(String msg) {
	  boolean isGood = false;
	  String msg1 = "";
      do { 
    	  Console.inMsg(msg);
    	  msg1 = sc.nextLine();
		  isGood = msg1.matches("[a-zA-Z가-힣]+");
		  if(!isGood) System.out.println("ERROR] 문자가 아닙니다.");		    
      } while(!isGood);
      return msg1;
   }
   
   public static String inNum(String msg) {
	  boolean isGood = false;
	  String num = "";
	  do {
		  Console.inMsg(msg);
		  num = sc.nextLine();
		  isGood = num.matches("[1-10]+");
		  if(!isGood) System.out.println("ERROR] 자연수가 아닙니다.");
	  } while(!isGood);
  return num;
   }
   public static void info(String msg) {
      System.out.println(msg);
   }
   

}