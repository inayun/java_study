package ex_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {

		/*
		 * 디모션 캐스팅
		 * 작은 자료형에 큰 자료형이 대입되는 것 (자동으로 처리 x)
		 * 
		 */
		
		char c = 'B'; //2byte
		int n = c + 1;
		c = (char)n; // c < n
		
		System.out.println(c); //C
		
		float f = 5.5f;
		n = 0;
		n = (int)f; // n < f
		
		System.out.println(n); //5
		
		
	}

}
