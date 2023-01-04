package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		
		human.eat(new Ramen());
		human.eat(new Kimchi());
		human.eat(new Apple());
	}
}
