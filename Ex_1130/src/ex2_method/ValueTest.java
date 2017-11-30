package ex2_method;

public class ValueTest {

		// 접근제한자 메소드명 (파라미터 /인자/매개변수){};
	public void test( int n ) {
		System.out.println(n+ "을 입력하셨군요.");
	}
	
	public void test( String n ) {
		System.out.println(n+ "을 입력하셨군요.");
	}
	
	public int test2( int n ) {
		n++;
		System.out.println("sub : " + n);
		
		return n;
	}
	
	public String test3(int n1, int n2) {
		
		return n1 + "+" + n2;
	}
}
