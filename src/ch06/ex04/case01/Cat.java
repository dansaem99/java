package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String catName, int age) {
		super(catName);//맴버변수 초기화하기위해.
		//this.animalName = catName;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
	
}//자식 클래스 첫번째 생성자에 super();이 들어간다.
