package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
		
		for(int i = 0; i < cards.length; i ++) 
			cards[i] = new Card(i);
		
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i =0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			Card tmp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = tmp;
		}
	
		for(Card card: cards) System.out.print(card);
	}
}
/*
과제: ch07.ex04.case01.Shuffle 을 객체지향으로 refactoring 하라.
	  카드 섞는 알고리즘은 main()에 구현한다.
*/