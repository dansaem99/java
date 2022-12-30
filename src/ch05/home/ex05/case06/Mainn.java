package ch05.home.ex05.case06;

public class Mainn {
	public static void main(String[] args) {
		Phonee phone = new Phonee();
		Person person = new Person();
		
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		
		person.setPersonName("최한석");
		
		person.setPhone(phone);
		
		person.message();
		person.call();
		person.game();
	}
}
