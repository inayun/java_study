package ex5_static;

public class StaticTest {

	String str1 = "일반 멤버변수";
	static String str2 = "스테틱 변수";
	
	public static String getResult2() {
		//스테틱 메서드 내부에서는 static 변수만 접근 가능
		// str1 은 사용할 수 없음!
		
		return str2;
	}
	public String getResult() {
		return str2;
		
	}
}
