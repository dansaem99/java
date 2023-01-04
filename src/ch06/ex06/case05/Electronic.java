package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;//VOLTAGE(코드네임) = 200(코드벨류);
	static final String MAKER_NAME = "LG";
	final int WETGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	//public static final 자동으로 안보이게 초기화해준다.
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getMaodelName();
	//public abstract 도 자동으로 입력된다.
}
