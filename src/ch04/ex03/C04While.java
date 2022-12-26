package ch04.ex03;

public class C04While {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break; // break가 실행되면 이 블럭을 빠지게 된다.
			}
			
			calorie += food;
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}
