package ex_string;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {

		/*
		 * Ŭ�����߿��� ��ǥ���̶�� �� �� �ִ� StringŬ����
		 * 
		 * String Ŭ������ �ΰ����� Ư¡�� ����
		 * 1) ��ü ������ 2����  : �Ͻ���, �����
		 * 2) �ѹ� ������ ���ڿ��� ������ ������ ���� (�Һ��� Ư¡)
		 * 
		 */
		
		//Ŭ����(new)�� ���� ������� ���� = ��ü��� ��
		//heap �� �����ϰ� stack���� �����ϴ� �͵� = ��ü
		// �Ϲ� '�ڷ���' ��ü ������ ��ü�� �Ͻ������� ������
		String s1 = "abc";
		String s2 = "abc";
		
		//------'�Ͻ���' ��ü ����
		//'Ŭ����'���� ==�� ���ϸ� ���� ���ϴ°� �ƴ϶� �ּҸ� ����!!!!!
		if( s1 == s2 ) {
			System.out.println("�ּҰ� ����");
		} else {
			System.out.println("�ּҰ� �ٸ�");
		}
		
		//new Ű���尡 ���Ǹ� '�����' ��ü ����
		//��������� ��ü�� �����ϸ� heap�� ���� ���� �ִ��� ������ ���� ����
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if( s4 == s3 ) {
			System.out.println("�ּҰ� ����");
		} else {
			System.out.println("�ּҰ� �ٸ�");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		String s5 = scanner.next();
		
		System.out.println("------�ּ� ��---------");
		if(s5 == "y") { //y�� �ƴմϴ�
			System.out.println("y�Դϴ�");
		} else {
			System.out.println("y�� �ƴմϴ�");
		}
		System.out.println("-------�� ��--------");
		if(s5.equals("y")) {
			System.out.println("y�Դϴ�.");
		} else {
			System.out.println("y�� �ƴմϴ�");
		}

		//���� ������ �÷��Ͱ� �����ϸ鼭 ����Ǵ� �͵��� ����
		//ȫ�浿 / ȫ�浿�ȳ�   / ȫ�浿 �ȳ��ϼ��� => ���� ������ 3�� \����
		String msg = "ȫ�浿";
		msg += " �ȳ�";
		System.out.println(msg +  "�ϼ���");
	}

}
