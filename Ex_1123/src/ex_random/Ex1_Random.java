package ex_random;

import java.util.Random;

public class Ex1_Random {

	public static void main(String[] args) {

		/*
		 * ���� �����
		 * a ~ b ������ ����
		 * int num = new Random().nextInt(����) + ���ۼ�;
		 * ���� : ū�� - ���� �� + 1 
		 * 
		 */
		
		
		
		//1 ~ 5 ������ ����
		int num = new Random().nextInt(5) + 1;
		//5 ~ 10 ������ ����
		//int num = new Random().nextInt(6) + 5;

		//System.out.println(num);
		
		
		/*
		 * ����
		 * 2~9 ������ ������ �߻�����
		 * �߻��� ������ �ش�Ǵ� ������ ���
		 */
		
		System.out.println("------���� �߻��ؼ� ������ ���---------");
		int dan = new Random().nextInt(8) + 2 ;
		
		for ( int i = 1 ; i < 10 ; i ++) {
			System.out.printf("%d * %d = %d\n" , dan, i , dan * i);
		}
		
		/*
		 * ����
		 * ������ �߻����� A ~ Z �� �ѱ��ڸ� ȭ�鿡 ���
		 */
		
		System.out.println("--------���� �߻��ؼ� ���ĺ� ��� ---------");
		
		//���1
		int random1 = new Random().nextInt(90 - 65 + 1) + 65;
		System.out.println((char)random1);
		
		//���2
		int random2 = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println((char)random2);

		
		
	}

}
