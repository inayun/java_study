package ex_work;

import java.util.Scanner;

public class Ex2_work {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 정수 n1, n2를 입력받음
		 * n1 ~ n2까지의 합을 계산하여 출력
		 */
		
		//-------------방법 1 -------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("값 1 : ");
		int n1 = scanner.nextInt();
		System.out.println("값 2 : ");
		int n2 = scanner.nextInt();
		
		int max  = 0;
		int min = 0;
		int result = 0;
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		for ( int i = min; i <= max; i++) {
			result += i;
		}
		System.out.println(result);
		
		
		/*
		 --------------- 방법 2 ----------------
		System.out.println("값 1 : ");
		int n1 = scanner.nextInt();
		System.out.println("값 2 : ");
		int n2 = scanner.nextInt();
		 
		 if ( n1 < n2 ){
		 int tmp = n1;
		 n1 = n2;
		 n2 = tmp;
		 }
		 
		 for ( int i = n2; i <= n1; i++ ) {
			result += i;
		}
		System.out.println(result);
		
		 */
		
		
		
	}

}
