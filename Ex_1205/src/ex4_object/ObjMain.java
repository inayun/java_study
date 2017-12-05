package ex4_object;

public class ObjMain {
	public static void main(String[] args) {
		
		Ex_Object obj = new Ex_Object();
		obj.setValue(100); //auto_boxing : 기본자료형을 객체로 바꿔주는 것
		//정수타입 100을 객체인 object로 바꿔주는 것
		
		int num = (int)obj.getValue(); //un_boxing : 객체(클래스타입)가 기본자료형으로 바뀌는것
		
		obj.setValue("안녕");
		String str = (String)obj.getValue();
		
		obj.setValue('A');
		char ch = (char)obj.getValue();
		
		/*
		 * 기본 자료형을  object로 받는것보다
		 * 그냥 오버로딩해서 각각 받는게 메모리 손실 부분에서 더 효율적임
		 * 
		 */
	}
}
