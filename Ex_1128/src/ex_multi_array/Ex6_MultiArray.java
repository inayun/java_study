package ex_multi_array;

import java.util.Scanner;

public class Ex6_MultiArray {

	public static void main(String[] args) {

		/*
		 * 마방진
		 */
		
		int[][] arr;
		int num = 1; //시작수
		int size = 0;
		
		int y = 0; //행
		int x = 0; //열
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("홀수를 입력하세요 : ");
		size = scanner.nextInt();
		
		// 시작값 1 넣을 자리 구하기 (첫째줄 가운데)
		x = size / 2 ;
		
		//사용자가 지정한 사이즈로 배열의 크기 결정
		arr = new int[size][size];
		
		while(num <= size * size) {

			arr[y][x] = num;
			
			//size의 배수값은 바로 아래에다 적어야함
			if( num % size == 0) {
				y++;
				
			} else {
				y--;
				x++;
			}
			if ( y < 0 ) {
				y = size - 1 ;
			}
			
			if ( x >= size ) {
				x = 0 ;
			}
			num++;

		} //while
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		} //outer
		
	}

}
