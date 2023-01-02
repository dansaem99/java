package ch05.ex09.case01;

import ch05.home.ex06.case02선생님답.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1;
		Console.info("static{}");
	}
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	public Init() {
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}
