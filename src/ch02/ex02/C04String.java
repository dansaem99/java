package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|"+ " a happy ".trim() + "|";
		// trim은 스페이스를 삭제 해준다.
		s = s.concat(" dog"); // 주어에 목적어를 붙여 넣기한다.
		//주어는 s이고 목적어는 dog이다.
		s = s.substring(2); 
		// 0은 |이고 1은 a이고 2는 띄어쓰기이므로 2까지 다 지워준다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n" , s.charAt(1));
		// s의 charAt는 문자 하나만 가져온다.
		
		int i = "apple".codePointAt(1); // 1번의 문자의 유니코드
		i = "a".hashCode(); // hashcode는 유니코드와 동일하다.
		i = "b".hashCode();
		i = "b".compareTo("a"); //a유니코드 - b유니코드 = 유니코드
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");// hello 첫번째 l의 인덱스
		i = s.lastIndexOf("l");
		i = s.length();
		System.out.println(i); // 유니코드를 알 수 있다.
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");// lop가 들어갔는지 물어본거다
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop"); //대,소문자 상관없이 이 글이 맞냐 물어본거다.
		b = "".isEmpty(); //
		b = s.matches("[a-zA-Z]*"); // 이 a-z안에 글자들이 들어갔는지 물어본거다.
		b = s.matches("[0-9]*"); // 숫자가 들어간게 있냐 물어본거다.
		
		System.out.println(b);
		
	}
}
