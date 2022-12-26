package ch04.home.ex04;

import java.util.Scanner;

public class H02calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+"); // +는 한글자 이상
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]"); //정교식 regular expression 0개이상이라는 의미가 있기떄문에
				if(!isGood) System.out.println("input on of them(+, -, *, /).");
			}while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			}while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/s)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
/*
과제: 계산기를 만들어라.
a,b는 자연수 또는 0이다.
연산자는 +, -, *, / 이다.
/는 몫만을 구한다.
cintinue(y/n)? 에서 y 또는 Y를 입력하면 계산 작업을 재수행한다.
y 또는 Y 외를 입력하면 앱을 종료한다.
--


a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/