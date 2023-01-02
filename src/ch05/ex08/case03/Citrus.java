package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";//10~12번과 중복이다.
		this("레드향");
	}
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}//현장에서는 15번과 같은 코드만 쓴다.

	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
