package ex_work;

import java.util.Scanner;

public class Ex4_work {

	public static void main(String[] args) {

		/*
		 * 피보나치 수열
		 * 반복할 횟수 : 5
		 * 1 1 2 3 5 
		 *   1 2 3 4
		 */
		
		int num1 = 1;
		int num2 = 1;
		int add = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("반복할 횟수를 입력하세요. : ");
		int input = scanner.nextInt();
		
		System.out.print(num1 + " " + num2 + " ");
		for ( int i = 0; i < input - 2; i++ ) {
			add = num1 + num2;
			System.out.print(add + " ");
			num1 = num2;
			num2 = add;
		}
		
	}

}
