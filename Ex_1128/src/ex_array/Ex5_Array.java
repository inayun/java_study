package ex_array;

import java.util.Random;

public class Ex5_Array {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 변수 money에 10~5000원 사이의 난수를 발생시켜 넣는다.
		 * 단, 1의 자리는 반드시 0이 되도록 함
		 * 
		 * 발생한 난수 money를 coin 배열의 동전으로 바꾸면
		 * 각각 몇개씩 거슬러지는지 판단하는 코드 작성
		 * 
		 * 단, 가능한 적은수의 동전으로 거슬러 줘야함
		 * 
		 * ex) money : 2590
		 * 500원 : 5
		 * 50원 : 1
		 * 10원 : 4
		 */
		
		int[] coin = { 500, 100, 50, 10 };
		int money = 0;
		int[] nums = new int[4];
			
			money = new Random().nextInt(5000-10+1)+10;
			money = money - (money % 10);
			System.out.println(money);
	
			/*
			 * 방법2
			 * 머니를 500까지만 랜덤으로 받고 10을 곱하면 됨
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
		 * 			system.out.printf( "%d원 : %d개 \n", coin[i], money/coin[i] );
		 * 	
		 * 			money %= coin[i];
		 * }
		 * }
		 * }
		 */
			
			
	}

}
