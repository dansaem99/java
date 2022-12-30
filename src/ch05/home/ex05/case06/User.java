package ch05.home.ex05.case06;

public class User {
	private Phone phone;
	private String money;
	
	public void message() {
		phone.message();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.game();
	}

	public Phone getPhone() {
		return phone;
	}

	public String getMoney() {
		return money;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public void setMoney(String money) {
		this.money = money;
	}
}
