package ex_array;

import java.util.Random;

public class Ex6_Arrray {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 1~45사이의 난수를 발생시켜 로또번호 생성기를 제작
		 */
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = new Random().nextInt(6)+1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = new Random().nextInt(6)+1;
					j = -1;
				}
			}
		}
		
	
			for(int num : lotto) {
				System.out.print(num + " ");
			}
			
		
			
	/*		
	 * ----------방법 2-------------------------
	outer : for( int i = 0; i < lotto.length; ) {
		lotto[i] = new Random().nextInt(6)+1;
		
		for( int j = 0; j < i; j++ ) {
			
			if( lotto[i] == lotto[j]) {
				continue outer;
			}
		}
		System.out.printf("%d ", lotto[i]);
		i++;
	}
		*/	
			
	}

}
