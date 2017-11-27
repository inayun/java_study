package ex_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		/*
		 * 문제
		 * scanner 를 통해 정수 n를 입력받음
		 */
		
		int number = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력: ");
		number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
