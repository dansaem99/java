package ch08.ex02.case04;

public class Main {
	public static void main(String[] args) {
		int choice = 3;
		String jobName = "";
		
		switch(Job.valueOf(choice)) {
		case EXIT -> jobName = "종료";
		case LIST -> jobName = "목록";
		case ADD -> jobName = "추가";
		case FIX -> jobName = "수정";
		case DEL -> jobName = "삭제";
		default -> jobName = "종료";
		}
		
		System.out.println(jobName);
	}
}
