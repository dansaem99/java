package ch06.ex04.case03;

public class Circle extends Point{
	private int r;
	
	//과제: 생성자를 기술하라.
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r);
	}
}
/*
 * Circle extends Point는 나쁜코드다.
 * 왜냐 circle 은 점이 아니기때문에
 */