package ex_array;

import java.util.Random;

public class Ex6_Arrray {

	public static void main(String[] args) {

		/*
		 * ����
		 * 1~45������ ������ �߻����� �ζǹ�ȣ �����⸦ ����
		 */
		
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			int tmp = new Random().nextInt(6)+1;
			
			for(int j = 0; j < i; j++) {
				if(tmp == lotto[j]) {
					tmp = new Random().nextInt(6)+1;
					j = -1;
				}
			}
			lotto[i] = tmp;
		}
		
			for(int num : lotto) {
				System.out.print(num + " ");
			}
			
		
	}

}
