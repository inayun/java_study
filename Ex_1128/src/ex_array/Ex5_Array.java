package ex_array;

import java.util.Random;

public class Ex5_Array {

	public static void main(String[] args) {

		/*
		 * ����
		 * ���� money�� 10~5000�� ������ ������ �߻����� �ִ´�.
		 * ��, 1�� �ڸ��� �ݵ�� 0�� �ǵ��� ��
		 * 
		 * �߻��� ���� money�� coin �迭�� �������� �ٲٸ�
		 * ���� ��� �Ž��������� �Ǵ��ϴ� �ڵ� �ۼ�
		 * 
		 * ��, ������ �������� �������� �Ž��� �����
		 * 
		 * ex) money : 2590
		 * 500�� : 5
		 * 50�� : 1
		 * 10�� : 4
		 */
		
		int[] coin = { 500, 100, 50, 10 };
		int money = 0;
		int[] nums = new int[4];
			
			money = new Random().nextInt(5000-10+1)+10;
			money = money - (money % 10);
			System.out.println(money);
	
			/*
			 * ���2
			 * �Ӵϸ� 500������ �������� �ް� 10�� ���ϸ� ��
			 */
			
			
			for(int i = 0; i < 4; i++) {
				nums[i] = money / coin[i];
				money -= coin[i]*nums[i];
				//money %= coin[i];  
			}
			
			for(int i = 0; i < 4; i++) {
			System.out.printf("%d : %d \n", coin[i], nums[i]);
			}
			
			
			
			
		/*
		 * 
		 * 
		 * for ( int i = 0; i < coin.length(); i++ ){
		 * 	
		 * 		if( money / coin[i] > 0 ) {
		 * 			system.out.printf( "%d�� : %d�� \n", coin[i], money/coin[i] );
		 * 	
		 * 			money %= coin[i];
		 * }
		 * }
		 * }
		 */
			
			
	}

}
