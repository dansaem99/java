package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); 
		// parameter
		System.out.println(score);
		System.out.println(100 + 1); 
		// expression 표현한다. 수식. 값을 표현한다.
		System.out.println(Math.random()); 
		//method 0.0이상 1.0이하로 리턴한다. random은 double이다.
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); 
		//'이면 테어터타입은 캐릭터이고 "이면 테어터타입은 문자이다. \n 엔터를 표현한거다. 특수문자이다.
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); // separator
		// 과제: 위 출력문에서 구분자로 / 를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name +"은 " + age + "살입니다."); 
		//snippet name +"은 " + age + "살입니다."은 expression이라고 말한다. +는 concatenate라고 한다.
		// name은 variable 변수이고 "은"은 constant 상수라고 한다.
	}
}