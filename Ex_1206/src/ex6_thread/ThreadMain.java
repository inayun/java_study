package ex6_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {

		/*
		 * Ű���忡�� ������ �Է¹���
		 * �Է¹��� ������ sub�� �Ѱ��ְ�
		 * run()�޼��忡�� �Է¹��� ���ڰ� 1�� �������� 1�� �����ϴٰ�
		 * 0�� �Ǿ����� '����' �޽����� ���
		 */
		
		System.out.println("���� : ");
		int input = new Scanner(System.in).nextInt();
		
		ThreadSub ts = new ThreadSub();
		ts.setTime(input);
		ts.start();
	}

}
