package ex_multi_for;

public class Ex2_MultiFor {

	public static void main(String[] args) {

		/*
		 * ���� 1
		 * 1 2 3 4
		 * 5 6 7 8
		 */
		
		System.out.println("--------����1--------");
		int k = 1;
		for (int i = 1; i < 3; i++) {
			System.out.println("");
			for(int j = 1; j < 5; j++) {
				//System.out.print(k++);
				System.out.printf("%02d",k++); 
				//%02d = ���ڸ� �����϶� 0�� �ٿ��� 2�ڸ��� ������ 01 02 03 ....
				
			}
		}
		
		
		
		/* 
		 * ���� 2
		 * A B C D
		 * E F G H 
		 * I J K L
		 *
		 */
		System.out.println();
		System.out.println("--------����2 ���1--------");
		int a = 65 ;
		for ( int b = 1; b < 4; b++) {
			System.out.println("");
			for(int c = 1; c < 5; c++) {
				System.out.print((char)a++);
			}
		}
		
		System.out.println();
		System.out.println("--------����2 ���2--------");

		   char ch = 'A';
		   for ( int b = 1; b < 4; b++) {
			System.out.println("");
			for(int c = 1; c < 5; c++) {
				System.out.printf("%c ", ch++);
			}
		}
		 
		
		
		
		
		
	}

}
