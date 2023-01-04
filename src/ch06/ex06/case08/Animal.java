package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() {}
}
