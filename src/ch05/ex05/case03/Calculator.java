package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public Paper add(Paper paper) {
		//과제 : paper 의  a, b 값을 더한 result 를 paper에 적어라.
		//		위 Paper를 return 하라.
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
