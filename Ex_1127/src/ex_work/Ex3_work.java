package ex_work;

public class Ex3_work {

	public static void main(String[] args) {

		/*
		 * 다중 for문을 사용하여 다음과 같은 결과를 도출
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 2 3 4 5 6 7 8 9 10 1
		 * 3 4 5 6 7 8 9 10 1 2 
		 */
		
		
		for( int i = 1; i <=10; i++ ) {
			
			for( int j = i ; j <= 10 ; j++ ) {
				System.out.print(j+" ");
			}
			for( int k = 1; k <= i-1; k++ ) {
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

}
