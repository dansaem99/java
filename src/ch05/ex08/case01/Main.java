package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); //new라는 연산자가 실행되서 객체만들어졌다.
		baby.setBabyName("초롱이");//아이가 태어나고 지은 이름
		
		baby = new Baby("튼튼이");//태어나기전에 지은 이름
	}
}