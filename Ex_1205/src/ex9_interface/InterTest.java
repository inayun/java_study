package ex9_interface;

public interface InterTest {

	/*
	 * '상수', '추상메서드'만 사용할 수 있음
	 * 상수 : 처음부터 끝까지 값이 유지되는 수
	 * 
	 * 추상메서드 
	 * 자식은 모든 메소드를 다 오버라이딩해서 써야함 무조건
	 * 추상클래스와 인터페이스의 차이점 : 강제성!
	 */
	
	//final (상수)로 정의한것은 중간에 값을 변경할 수 없음!
	//변수 이름을 전부다 '대문자'로 사용하는 것이 약속
	// VALUE
	final int VALUE = 100;
	abstract int getVALUE(); //추상메서드
	
}
