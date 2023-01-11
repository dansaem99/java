package ch07.ex07.case01;

@FunctionalInterface
public interface Human {
	void say();
	//void tell(); 메서드는 하나만 적을 수 있다.
	//타입하나에 메서드 한개
	//FunctionalInterface = 함수형 인터페이스란 1 개의 추상 메소드를 갖는 인터페이스를 말합니다
}
