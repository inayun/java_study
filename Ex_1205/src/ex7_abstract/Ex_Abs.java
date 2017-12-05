package ex7_abstract;

public abstract class Ex_Abs {

	int value = 100;

	//몸체가 없는 메소드 = 추상메소드
		//abstract 키워드로 시작
		//한개라도 추상 메소드를 가지고 있으면 클래스 명 앞에 abstract를 명시해줘야함
		//해당 클래스의 '자식이 생겼을때부터' 사용 할 수 있음
	public int getValue() {
		return value;
	}
	
	abstract public void setValue(int value) ;
	
}
