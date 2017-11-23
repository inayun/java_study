package ex_casting;

public class Ex1_Promotion {

	public static void main(String[] args) {
		
		/*
		 * 캐스팅 (형변환)
		 * 
		 * 프로모션 캐스팅(업 캐스팅)
		 * 큰 자료형에 작은 자료형이 대입되는 것 (자동으로 처리됨)
		 */
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n;
		
		System.out.println("d:" + d); // 200.0
	
		char c = 'A'; //2byte
		int n2 = 100; //4byte
		n2 = c;
		
		System.out.println("n2:" + n2);
		
	}

}
