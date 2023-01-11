package ch07.ex04.case04;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		System.out.println("번호 국어 영어 수학 합계 평균");
		System.out.println("-----------------------------");
		
		for(int i =0; i < scores.length; i++) {//부모는 row를 표현했다.
			int sum =0;
			
			//System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j <scores[0].length; j++) {//자식은 col를푠현했다.
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]); //{}안에 숫자 표시
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[i].length); //sum 더한값 그 뒤에 sum은 평균값
		}
	}
}
