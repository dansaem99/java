package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;
		//MAX = 1; 5번 파이널을 넣으면 바꿀생각이 없다는 단어.
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;

		System.out.println();

	}
}
