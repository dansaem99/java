package ch07.ex04.case01;

public class Scor {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[] scores = {100, 37, 75, 90};
		
		for(int score: scores) sum += score;
		
		avg = 1.0 * sum / scores.length; // scores.length {}를 다 더하고 나눈 = 평균값.
		
		System.out.printf("%d %.1f", sum, avg);
	}
}
