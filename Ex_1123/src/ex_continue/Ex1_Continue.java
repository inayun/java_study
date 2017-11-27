package ex_continue;

public class Ex1_Continue {

	public static void main(String[] args) {

		/*
		 *  continue 문
		 *  반복문 내에서 특정 문장을 건너뛰고자 할 때
		 */
		
		for ( int i = 1; i <= 2; i++ ) {
			for( int j = 1; j <= 5; j++) {
				
				if ( j % 2 == 0 ) {
					continue; 
					//아래 코드 실행하지않고 다시 j를 증가시키러 올라감
					
				} //if
				
				System.out.printf("%d ", j);
			} //inner
			
			System.out.println("");
		} //outer
	}

}
