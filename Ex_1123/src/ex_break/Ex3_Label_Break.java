package ex_break;

public class Ex3_Label_Break {

	public static void main(String[] args) {

		name : for( int i = 1; i <= 3; i++) {
			
			for( int j = 1; j <= 5; j++) {
				
				if( j % 2 == 0 ) {
					//label을 달면 가장 바깥쪽 for문을 나갈 수 있음
					break name;
				}
				System.out.printf("%d ", j);
			}
		}
	}

}
