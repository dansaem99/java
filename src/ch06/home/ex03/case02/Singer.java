package ch06.home.ex03.case02;

import ch05.home.ex06.case02.Console;

public class Singer extends Entertainer{
	@Override
	public void play() {
		Console.info("노래하다.");
	}
}
