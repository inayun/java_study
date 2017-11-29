package ex_multi_array;

public class Ex4_MultiArray {

	public static void main(String[] args) {

		/*
		 * 2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 구하세요.
		 */
		int[][] arr = { {1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20,22}};
		
		int total = 0;
		int count = 0;
		float avg = 0;
	
		for (int i = 0;  i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			} //inner
		} //outer
		avg = (float)total / count;
		System.out.printf("총합 : %d, 평균 : %f", total, avg);
		
		
		
		
	}

}
