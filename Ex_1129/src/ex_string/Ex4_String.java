package ex_string;

import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {

		/*
		 * ȸ���� �Ǵ��ϱ�
		 * �Է� : 121
		 * 121�� ȸ�����Դϴ�.
		 * 
		 * �Է� : �ⷯ��
		 * �ⷯ��� ȸ���� �Դϴ�.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� : ");
		String input = scanner.next();
		String opposite = "";
		
		for( int i = input.length(); i > 0; i-- ) {
			opposite += input.charAt(i-1);
		}
		if(input.equals(opposite)) {
			System.out.printf("%s��(��) ȸ�����Դϴ�.",input);
		} else {
			System.out.printf("%s��(��) ȸ������ �ƴմϴ�.",input);
		}
	}

}
