package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//HashSet은 객체들을 순서 없이 저장(인덱스가 없다) 하고 동일한 객체는 중복 저장하지 않습니다.
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		//수학시간에 집합같이 중복된 값은 사용하지 않는다.
		System.out.println(set); //중복을 제외한 숫자가 나온다.
	}
}
