package ch07.home.ex04.case02;

public class Card{
	private int cardNum;

	public Card(int cardNum) {
		this.cardNum = cardNum;
	}
	
	@Override
	public String toString() {
		return this.cardNum + " ";
	}
}
