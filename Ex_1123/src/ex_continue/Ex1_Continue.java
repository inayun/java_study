package ex_continue;

public class Ex1_Continue {

	public static void main(String[] args) {

		/*
		 *  continue ��
		 *  �ݺ��� ������ Ư�� ������ �ǳʶٰ��� �� ��
		 */
		
		for ( int i = 1; i <= 2; i++ ) {
			for( int j = 1; j <= 5; j++) {
				
				if ( j % 2 == 0 ) {
					continue; 
					//�Ʒ� �ڵ� ���������ʰ� �ٽ� j�� ������Ű�� �ö�
					
				} //if
				
				System.out.printf("%d ", j);
			} //inner
			
			System.out.println("");
		} //outer
	}

}
