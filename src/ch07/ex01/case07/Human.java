package ch07.ex01.case07;

public class Human {
	/*
	과제: 아래 세 method call 을 한 method call 로 refactoring 하라
	public void eat(Ramen ramen) {}
	public void eat(Kimchi kimchi) {}
	public void eat(Apple apple) {}
	*/
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}
}
