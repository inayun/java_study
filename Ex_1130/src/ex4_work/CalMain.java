package ex4_work;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		/*
		 * ���� �ΰ��� �����ȣ�� �Է¹޾�
		 * Cal Ŭ������ getResult() �޼��忡��
		 * ��� ����� �ϼ��ϵ��� ó��
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = scanner.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = scanner.nextInt();
		System.out.print("������ �Է� : ");
		String opp = scanner.next();
		
		Cal c = new Cal();
		int result = c.getResult(num1,num2,opp);
		System.out.println(result);
		
	}

}
