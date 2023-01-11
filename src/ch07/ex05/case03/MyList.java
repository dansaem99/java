package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));//10번이 0이니까 들어간다
		//1이면 11번이나온다.
		
		for( int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1);//remove를 했더니 1이 없어져 9,11,12번만 나왔다. remove = 제거한다.
		System.out.println(list);
		
		//과제: list 의 모든 원소를 삭제하라.
		list.removeAll(list);//list.에서 ()의 같은 값을 없앤다. remove가 제거여서 all를 써서 전부다 제거해준다.
		System.out.println(list);
		
		list = new ArrayList<>( Arrays.asList(1, 2, 3, 1));
		for(int i = list.size()-1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
		//Arrays.asList(1, 2, 3, 1)단독으로 만들진 못한다.
	}
}