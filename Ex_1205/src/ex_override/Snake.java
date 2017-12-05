package ex_override;

public class Snake extends Animal{

	String tongue = "혀";
	
	
	/*
	 * 메서드의 '오버라이딩'
	 * 메서드의 '재정의'의 의미를 가지며
	 * 상속관계의 객체에서 부모의 메서드를 가져와
	 * 자식 사정에 맞게 재정의 하는 것
	 */
	
	@Override
	public int getLeg() {
		return 0;
	}
}
