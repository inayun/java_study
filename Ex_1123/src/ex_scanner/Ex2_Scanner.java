package ex_scanner;

import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {

	 /* ����
	   	Ű���忡�� ���� �� ���� ���� ��ȣ�� �Է¹޴´�.
		�Է¹��� ������ ������ ������ �Ʒ��� ���� ����� ����
		
		ù��° : 10
		�ι�° : 20
		������ : +
		��� : 10 + 20 = 30
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ΰ� �Է��ϼ���. ");
		int num1 = scanner.nextInt();
		int num2= scanner.nextInt();

		System.out.println("���� ��ȣ�� �Է��ϼ���. + - * / �� ��1 ");
		String operator = scanner.next();
		
		switch (operator) {
		
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
			
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;	
			
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;	
			
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
			
		default : 
			System.out.println("�߸��� ������ �Դϴ�.");
			break;
			
		}
		
		
	}

}
