package ex_casting;

public class Ex1_Promotion {

	public static void main(String[] args) {
		
		/*
		 * ĳ���� (����ȯ)
		 * 
		 * ���θ�� ĳ����(�� ĳ����)
		 * ū �ڷ����� ���� �ڷ����� ���ԵǴ� �� (�ڵ����� ó����)
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
