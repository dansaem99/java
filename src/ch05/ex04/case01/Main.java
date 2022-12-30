package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		//Card.kind; 변수를 정하지안아서 오류가 뜨는거다.
		//Card.number;
		
		Card card1 = new Card();//카드 뒷면을 보고 2장이 있구나.
		Card card2 = new Card();
		
		card1.kind = "heart";//카드 앞면이여서 하트7이다. 알수있다.
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
		/* public static int width;이런건 class명. 하고 사용하면된다.
		 * 예시 Card.width로 사용하면 된다.
		 * width의 변수가 static variable이라고 하는거다.
		공유를 안하는게 좋은 이유는 공유하면서 더러워지기 때문이다.
		나중에 내가 이 데이터를 저장하고 쓰고싶은데 다른 사람이 공유해서
		쓰면서 내가 쓰고 싶은 데이터를 건들어서 없어지기때문에*/
		// lock 잠구다 queue 줄서다.
	}
}
