package ex_break;

public class Ex3_Label_Break {

	public static void main(String[] args) {

		name : for( int i = 1; i <= 3; i++) {
			
			for( int j = 1; j <= 5; j++) {
				
				if( j % 2 == 0 ) {
					//label�� �޸� ���� �ٱ��� for���� ���� �� ����
					break name;
				}
				System.out.printf("%d ", j);
			}
		}
	}

}
