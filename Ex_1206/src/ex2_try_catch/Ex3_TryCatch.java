package ex2_try_catch;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� : ");
		int num = 0;
		
		try {
			num = scanner.nextInt();
			System.out.println("�Է¹��� �� : " + num);
		} catch(Exception e ) {
			System.out.println("������ �Է��� �� �ֽ��ϴ�.");
		} 
	}
}
