package ex_overload;

public class Ex1_Overload {

	/*
	 * 오버로딩
	 * 메서드의 '중복정의'
	 * 하나의 클래스내에서 '같은 이름을 가진 메서드'가
	 * 여러개 정의되는 것
	 * 
	 * '메서드명'은
	 * 대소문자를 비롯해 반드시 일치해야함
	 * 
	 * 인자들은
	 * 인자명을 제외한 인자의 수가 다르든, 인자의 수가 같다면
	 * 인자의 자료형이 다르든, 다른 메서드들과 인자타입이 다르게
	 * 정의되어야한다.
	 * 인자의 갯수와 타입이 같다면, 인자의 순서가 달라야 오버로딩으로 인정
	 * ( 수 -> 자료형 -> 순서 )
	 * 
	 * 다양한 메서드들을 같은 이름으로 작업할 수 있게 된다는 의미로서
	 * 사용하면 효율성이 높아짐
	 * 
	 */
	
	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void getResult(int n) {
		System.out.println("인자가 int 인 메서드");
	}
	
	public void getResult(char c) {
		System.out.println("인자가 char인 메서드");
	}
	
	public void getResult(String s) {
		System.out.println("인자가 String인 메서드");
	}
	
	public void getResult(int n, char c) {
		System.out.println("정수, 문자를 인자로 받는 메서드");
	}
	
	public void getResult(char c, int n) {
		System.out.println("문자, 정수를 인자로 받는 메서드");
	
	
	
	}
	
}
