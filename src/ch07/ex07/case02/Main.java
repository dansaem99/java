package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		//human.walk(); static메서드이기 때문에 앞에 대문자를 사용해야한다
		Human.walk();
		human.sleep();
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
