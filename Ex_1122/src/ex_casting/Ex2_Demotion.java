package ex_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {

		/*
		 * ���� ĳ����
		 * ���� �ڷ����� ū �ڷ����� ���ԵǴ� �� (�ڵ����� ó�� x)
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
