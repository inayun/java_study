package ex_multi_array;

public class Ex1_MultiArray {

	public static void main(String[] args) {

		
		/*
		 * ������ �迭
		 * 1����  �迭�� 2�� ���̸� 2���� �迭
		 * 1���� �迭�� 3�� ���̸� 3���� �迭
		 */
		
		int[][] test = new int[2][3];
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		//test.length = 2�� �ݺ���. 1���� �迭��
		for( int i = 0; i < test.length; i++ ) {
			
			for( int j = 0; j < test[i].length; j++) {
				System.out.printf("%d ", test[i][j]);
			}
		}
		
		
	}

}
