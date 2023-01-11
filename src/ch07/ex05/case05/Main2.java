package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>(); // 1층에 고양이 3마리
		List<Cat> floor2 = new ArrayList<>(); // 2층에 고양이 3마리
		List<List<Cat>> house = new ArrayList<>(); //집에 1층과 2층까지 있다.
		
		for(int i = 0; i < 3; i++) { //고양이가 3마리있다
			floor1.add(new Cat("고양이" + i)); //1층은 고양이 3마리
			floor2.add(new Cat("야옹이" + i)); //2층은 야옹이 3마리
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house); //집에 1층에 고양이 2층에 야옹이
		
		//과제: 고양이 여섯마리에게 밥을 먹여라.
		for(List<Cat> floor: house)  // 집에 1층 2층
			for(Cat cat: floor) cat.eat(); //층마다 고양이 6마리에게 밥을 줬다.
	}
}
