package ex_continue;

public class Ex2_Label_Continue {

	public static void main(String[] args) {

		name : for( int i = 1; i <= 3; i++) {
			
			for( int j = 1; j <= 5; j++) {
				
				if( j % 2 == 0 ) {
					//label�� �޸� ���� �ٱ��� for���� ���� �� ����
					continue name;
				}
				System.out.printf("%d ", j);
			}
		}

	}

}
