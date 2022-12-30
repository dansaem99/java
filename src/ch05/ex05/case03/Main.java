package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Paper paper = new Paper();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		paper.setA(1);
		paper.setB(2);
		paper = calculator.add(paper);
		System.out.println(paper.getResult());
	}
}
