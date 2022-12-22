package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i , j );
		
		i = 0;
		j = i++; //j = i이다가 먼저 우선순위이다.
		//그래서 j는 0 i는 1이다.
		System.out.printf("i: %d, j: %d\n", i , j );
	}
}
