package ch05.home.ex05.case06;

public class Phone {
	private boolean connect;
	private String brand;
	
	public void message() {}
	public void call() {}
	public void game() {}
	
	public boolean isConnect() {
		return connect;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setConnect(boolean connect) {
		this.connect = connect;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}	
}
