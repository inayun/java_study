package ex7_abstract;

public class Ex_AbsMain {

	Ex_AbsChild ac = new Ex_AbsChild();
	//ac.setValue(50);
	//부모에 있는 메소드를 호출해봤자 소용없음..정의가 안되어있으니까

	//추상 클래스는 인스턴스를 직접적으로 가질 수 없으므로 
	//추상클래스를 직접 객체화 하지는 않음
	Ex_Abs p = new Ex_Abs() {
		@Override
		public void setValue(int value) {
			
		}
	};
}
