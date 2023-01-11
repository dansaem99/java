package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>(); //정수를 배열목록으로 만들었다.
		List<Integer> score2 = new ArrayList<>();
		List<List<Integer>> scores = new ArrayList<>(); // scores = score1 과 scores2 를 한게 배열한다는 뜻. 
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);//80 81 82
			score2.add(90 + i);//90 91 92
		}
		System.out.printf("%s\n%s\n", score1, score2);
		
		scores.add(score1);
		scores.add(score2);
		System.out.println(scores);
	}
}
