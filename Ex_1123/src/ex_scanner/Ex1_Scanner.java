package ex_scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {

//		Ű���忡�� ���� �Է¹ޱ� ���� Scanner Ŭ����
		System.out.print("������ �Է� : ");
		Scanner scanner = new Scanner( System.in );
		
		int num = scanner.nextInt();
		System.out.println("��: " + num);
		
		System.out.println("------------");
		
		System.out.println("������ �Է��ض� : ");
		String str = scanner.next();
		//ù��° ���⸸ ���� �� ����
		System.out.println("���� : " + str);
		
		System.out.println("------------");


		
		/*
		 * Scanner.nextLine ���� �߻���
		 *  1. scanner ��ü�� ���� ������� (scanner 1, scanner 2...)
		 *  2. scanner.nextLine();
		 */
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		String str2 = scanner2.nextLine();
		System.out.println("���� : " + str2);

		
	}

}
