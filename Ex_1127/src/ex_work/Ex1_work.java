package ex_work;

import java.util.Scanner;

public class Ex1_work {

	public static void main(String[] args) {

		/*
		 * ����
		 * scanner �� ���� ���� n�� �Է¹���
		 */
		
		int number = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
