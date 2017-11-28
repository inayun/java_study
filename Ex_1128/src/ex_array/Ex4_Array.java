package ex_array;

import java.util.Scanner;

public class Ex4_Array {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 
		 * 정수를 입력받고
		 * 해당 수 까지 알파벳 배열에 넣고 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		char alphas[] = new char[input];
		char j = 'A';
		
		for (int i = 0; i < alphas.length; i++ ) {
			alphas[i] = j++;
			System.out.print(alphas[i]);
		}
	}

}
