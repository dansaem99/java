package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C "; //instanceof 대신 넣어주는것
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";// 모든 클래스에 오브젯은 다 들어가있다.
		System.out.println(msg);
		//C에 B와 A를 연결시켜 같이 나온거다.
		
		B b = new B();
		msg = "";
		if (b instanceof C) msg += "C ";
		if (b instanceof B) msg += "B ";
		if (b instanceof A) msg += "A ";
		if (b instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		//if(b instanceof F) F 가 없어서.
		
		F f = new F();
		msg = "";
		//if (f instanceof C) C는 클래스이기 때문에 불가능하다.
		if (f instanceof A) msg += "A ";//인터페이스이기 때문에 가능하다.
		System.out.println(msg);
	}
}
