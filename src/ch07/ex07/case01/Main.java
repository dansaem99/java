package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello");
		//()이게 say이다.
		//lamda라고 한다.
		human.say(); // 휴먼이 세이하다.
	}
}
