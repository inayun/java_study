package ex_string;

import java.util.Scanner;

public class Ex3_String {

	public static void main(String[] args) {

		/*
		 * �Է�  : falfakdflasf
		 * �ҹ��� a�� ���� : 3
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� : ");
		String input = scanner.next();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='a') {
				count++;
			}
		} System.out.printf("a�� %d�� �Դϴ�.",count);
	}

}
