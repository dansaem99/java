package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	protected int getMoney() { //protected는 자식한테만 보이게한다.
		return money;
	}
	
	void addMoney(int money) { 
		this.money += money;
	}
}
