package ch07.ex01.case09;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		
		shooter.setGun(new Pistol());
		shooter.fire();
		
		shooter.setGun(new Rifle());
		shooter.fire();
	}
}
//DAO (Data Access Object) Access 읽기 쓰기
// Access을 4개로 표현할때 create read update delete
//그래서 현장에서는 crud라고 한다