package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}

	public Baby(String babyName) {
		this.babyName = babyName;
		//new로만 오픈할 수 있다.객체을 생성한 직후에 라이트한다.ㅋ
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
		//new로 오픈하는게 아니다.객체을 생성한 후에 라이트한다.
	}
}
