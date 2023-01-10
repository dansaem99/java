package ch08.ex01;

@Universal
@Type(name = "class", value = 1)
public class MyClass {//기본이 value =  이기때문에 생략가능
	@Field(1) @Universal
	private String myName;
	
	@Constructor
	public MyClass() {}
	
	@Method
	public void play(@Param String userName, @Param int age) {
		@Local int i = 0;
	}
}
