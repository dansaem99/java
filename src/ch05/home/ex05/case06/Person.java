package ch05.home.ex05.case06;

public class Person {
	private String personName;
	private Phonee phone;
	
	public void message() {
		phone.message();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.game();
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPhone(Phonee phone) {
		this.phone = phone;
	}
}