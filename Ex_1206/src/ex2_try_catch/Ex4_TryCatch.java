package ex2_try_catch;

import java.util.Scanner;

public class Ex4_TryCatch {

	public static void main(String[] args) {

		//���� : 5
		//�Է¹��� �� : 5
		
		//���� : aaa
		//aaa�� ������ �ƴմϴ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� : ");
		String input="";
		
		try {
			input = scanner.next();
			int result = Integer.parseInt(input);
			System.out.println("�Է¹��� ��  :"  + result);

		} catch (Exception e) {
			System.out.println(input + "�� ������ �ƴմϴ�.");
		} 
		
	
	}

}
