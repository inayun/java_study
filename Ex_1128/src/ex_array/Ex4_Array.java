package ex_array;

import java.util.Scanner;

public class Ex4_Array {

	public static void main(String[] args) {

		/*
		 * ����
		 * 
		 * ������ �Է¹ް�
		 * �ش� �� ���� ���ĺ� �迭�� �ְ� ���
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
