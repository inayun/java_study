package ex_break;

public class Ex1_Break {

	public static void main(String[] args) {

		
		/*
		 * break��
		 * �ݺ��� ������ ���������� ���� ����� �ݺ����� ���������� ���
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
