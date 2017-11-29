package ex_multi_array;

import java.util.Scanner;

public class Ex6_MultiArray {

	public static void main(String[] args) {

		/*
		 * ������
		 */
		
		int[][] arr;
		int num = 1; //���ۼ�
		int size = 0;
		
		int y = 0; //��
		int x = 0; //��
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ȧ���� �Է��ϼ��� : ");
		size = scanner.nextInt();
		
		// ���۰� 1 ���� �ڸ� ���ϱ� (ù°�� ���)
		x = size / 2 ;
		
		//����ڰ� ������ ������� �迭�� ũ�� ����
		arr = new int[size][size];
		
		while(num <= size * size) {

			arr[y][x] = num;
			
			//size�� ������� �ٷ� �Ʒ����� �������
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
