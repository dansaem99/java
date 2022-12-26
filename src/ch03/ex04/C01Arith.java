package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// 과제: 아래 compile error 를 해결하라.
		//byte c 는 건드리지 않는다.
		//byte c = a + b; // 덩치 큰 a + b를 작은 상자 c에 못 넣은다.
<<<<<<< HEAD
=======
		
>>>>>>> refs/remotes/origin/master
		byte c = (byte) ( a + b );
		System.out.println(c);
		
		//c = c + 1; // int 6를 byte에 못 넣은다.
		c++;
		System.out.println(c);
		
		double d = a / b; //오버해서 1의 값만 나온다.
		System.out.println(d);
		
		// 과제: d 변수에 1.5가 저장되도록 하라.
		//d = a / b ;
		d = (double) a / b;
		System.out.println(d);
		d = 1.0 * a / b; //1.0를 넣어서 더블로 변환이 된것이다.
		System.out.println(d);
		
		// 나쁜 예시 
		d = (double) (a / b);
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);
	}
}
