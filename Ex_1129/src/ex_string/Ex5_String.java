package ex_string;

import java.util.Scanner;

public class Ex5_String {

	public static void main(String[] args) {

		/*
		 * �̸����� �Է¹ް�
		 * @���� ������ ���̰� 6���� �۰ų� 10���� Ŭ ��� 
		 * �����޽��� ����ϱ�
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸����� �Է��ϼ��� . : ");
		String email = scanner.next();
		int count = 0;
		String id = "";
		
		for( int i = 0; i < email.indexOf('@'); i++ ) {
			id += email.charAt(i);
			count++;
		}
		//----��� 2----
		// String sub = email.substring( 0, email.indexOf('@'));
		
		if(count < 6 || count > 10) {
			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�. ");
		} else {
			System.out.printf("%s �� �α��� ����!", id);
		}
		
		
	}

}
