package ex_value_type;

public class Ex3_valueType {

	public static void main(String[] args) {

		// 정수형
		
		byte b = 127;
		short s = 32767;
		int n = 2100000000; //int가 디폴트!
		long l = 2200000000L; //int가 디폴트이기 때문에 롱을 쓸때는  L을 붙여줌
		
		System.out.println(l);
		
		// 실수형
		float f1, f2;
		f1 = 3.14F; //double이 디폴트이기 때문에 플롯을 쓸때는 F를 붙여줌
		f2 = 3;
		
		double f3;
		f3 = 3.14; //double이 디폴트!
		
		System.out.println("f2:" + f2);
	}

}
