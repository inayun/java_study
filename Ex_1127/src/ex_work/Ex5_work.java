package ex_work;

import java.util.Scanner;

public class Ex5_work {

	public static void main(String[] args) {

		/* 
		 * ����
		 * Ű���忡�� ������ �Է¹ް�, 
		 * �Է¹��� ���� �Ҽ����� �ƴ����� �Ǵ��ϴ� �ڵ�
		 * 1�� �Ҽ��� �ƴ�
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է����ּ���. :");
		int input = scanner.nextInt();
		int i = 0;
		
		for ( i = 2; i <= input; i++) {
			
			if (input % i == 0) {
				break;
			}
		} //for
		
		if ( i == input) { 
			//����������°ž��� �ݺ����� ������ ��������
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			//break �ɷ��� ��������
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}
}
