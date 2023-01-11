package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		
		cats.add(new Cat("야코미"));
		cats.add(new Cat("새코미"));
		cats.add(new Cat("헤롱이"));
		
		System.out.println(cats);
		
		for(Cat cat: cats) cat.eat();
		//(Cat cat: cats) 는 고양이 3마리 이름을 배열한것
		//cat.eat() 3마리가 먹는다는 뜻
	}
}
