package ch04.ex02;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		// 0.0이상 10.0미만으로 나온다. int로 묶으면 1이상 10미만이다.
		System.out.println(a);
	}
}
