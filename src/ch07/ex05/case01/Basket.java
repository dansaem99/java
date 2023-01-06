package ch07.ex05.case01;

public class Basket <E> { //<>안에 아무거나 써도 상관없다.뜻은 아무거나
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
