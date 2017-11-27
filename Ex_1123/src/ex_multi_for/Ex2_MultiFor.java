package ex_multi_for;

public class Ex2_MultiFor {

	public static void main(String[] args) {

		/*
		 * 문제 1
		 * 1 2 3 4
		 * 5 6 7 8
		 */
		
		System.out.println("--------문제1--------");
		int k = 1;
		for (int i = 1; i < 3; i++) {
			System.out.println("");
			for(int j = 1; j < 5; j++) {
				//System.out.print(k++);
				System.out.printf("%02d",k++); 
				//%02d = 한자리 숫자일때 0을 붙여서 2자리로 만들어라 01 02 03 ....
				
			}
		}
		
		
		
		/* 
		 * 문제 2
		 * A B C D
		 * E F G H 
		 * I J K L
		 *
		 */
		System.out.println();
		System.out.println("--------문제2 방법1--------");
		int a = 65 ;
		for ( int b = 1; b < 4; b++) {
			System.out.println("");
			for(int c = 1; c < 5; c++) {
				System.out.print((char)a++);
			}
		}
		
		System.out.println();
		System.out.println("--------문제2 방법2--------");

		   char ch = 'A';
		   for ( int b = 1; b < 4; b++) {
			System.out.println("");
			for(int c = 1; c < 5; c++) {
				System.out.printf("%c ", ch++);
			}
		}
		 
		
		
		
		
		
	}

}
