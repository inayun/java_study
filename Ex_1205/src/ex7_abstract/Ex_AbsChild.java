package ex7_abstract;

public class Ex_AbsChild extends Ex_Abs{
	
	
	//자식이 쓸일이 없어도 무조건 오버라이딩 하고 갖고 있어야함
@Override
public void setValue(int value) {
	//추상 클래스를 상속받은 자식 클래스는 
	//부모인 추상클래스가 가지고 있는 추상 메소드를
	//반드시 '오버라이딩' 하고 있어야함
	//자식이 반드시 완성!!!!!!!
	super.value = value;
}

@Override
	public int getValue() {
		return super.getValue();
	}


}
