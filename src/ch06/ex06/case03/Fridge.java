package ch06.ex06.case03;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance{
	@Override
	public void off() {}
}
//추상 클래스를 일반 클래스로 만들고 싶으면
//추상코드를 없애면 된다. 6번처럼