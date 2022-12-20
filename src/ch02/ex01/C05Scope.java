package ch02.ex01;

public class C05Scope {
	public static void main(String[] atgs) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0;
			int x = 0 ;
			int y = 0 ;
		}
		int x = 0;
	}
}
/* }에서 int의 모든게 끝나긴 때문에 x는 중복이 안된다. int i는 처음에 있기때문에 
마지막 14번의 닫기 괄호가 있기  때문에 중복이 된다.
javaw.exe C05Scope를 실행시키는 것이다. loading. 보철머신은 javaw.exe를 망한다. */