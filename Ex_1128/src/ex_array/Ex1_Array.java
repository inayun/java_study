package ex_array;

public class Ex1_Array {

	public static void main(String[] args) {

		/*
		 * �迭
		 * ���� �ڷ������� ��Ƶδ� �ϳ��� ����
		 * ȿ������ �ڷ� ������ ���� �ݵ�� �ʿ�
		 * 
		 */
		
		//1) �迭����
		int[] ar ;
		
		//2) �迭����
		ar = new int[4];
		
		// int[] ar = new int[4];
		
		//3) �迭�� �� �濡 �� ���� (���ȣ = �ε���, ����� ������ �� ����)
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		
		for( int i = 0; i < ar.length; i++ ) {
			ar[i] = (i+1) * 100;
			System.out.println( ar[i]);
		}
		
		System.out.println("------------");
		
		//����� ������ �ʱ�ȭ�� �ѹ���
		int[] ar2 = {100, 200, 300, 400, 500};
		
		
		for( int i = 0; i < ar2.length; i++ ) {
			System.out.println( ar2[i]);
		}
	}

}
