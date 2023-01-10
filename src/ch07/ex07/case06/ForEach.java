package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 3; i++) list.add(i);
		
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		//과제: list에서 짝수들만을 출력하라.
		list.forEach(x ->{ 
			if(x % 2 ==0) System.out.print(x);
		});
	}
}
