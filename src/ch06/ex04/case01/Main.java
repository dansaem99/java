package ch06.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("야코미", 3);
		
		// 과제: 콘솔에 null 0 이 출력되도록 하라.
		cat = new Cat(null, 0);
		//new는 새로운 객체를 만들어서 cat에 덮어쓰운다.
		
		System.out.println(cat);
	}
}