package ex_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex_Anonymous {
	public static void main(String[] args) {
		
		/*
		 * �͸�Ŭ����
		 * �ѹ��� ����ϰ� ���� ��ü�� Ȱ���ϱ� ���� ����
		 * 
		 */
		
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();*/
		
		int num = new Scanner(System.in).nextInt();
		System.out.println(num);
		
		//������ ����� �Ŷ�� ��ü�� ���� �� ��ü�� ��� ȣ����
		Random r = new Random();
		int random = r.nextInt();
		int random2 = r.nextInt();
	}
}
