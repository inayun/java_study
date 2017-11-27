package ex_break;

public class Ex1_Break {

	public static void main(String[] args) {

		
		/*
		 * break문
		 * 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈때 사용
		 */
		
		
		for ( int i = 1; i <= 3; i++ ) {
			
			for ( int j = 1; j <= 5; j++ ) {
				
				if( j % 3 == 0 ) {
					break;
				}
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}

}
