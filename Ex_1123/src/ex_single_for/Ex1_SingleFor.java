package ex_single_for;

import java.util.Scanner;

public class Ex1_SingleFor {

	public static void main(String[] args) {

		/*
		 * for�� : Ư�� ����� ���ϴ� ��ŭ �ݺ������� ó���ϰ��� �� �� ���
		 * 
		 * 
		 * for ( �ʱ��; ���ǽ�; ������ ){
		 * 	���ǽ��� ���� �� ����Ǵ� ����
		 *  }
		 * 
		 */
		
		
		/*for( int i = 0; i < 3; i++ ) {
			System.out.println( i );
		}*/
		
		/*for( int i = 0; i < 3; ) {
		 i++;
		System.out.println( i );
		}*/
		
		/*
		for ( int i = 10; i > 0; i--) {
			System.out.println(i);
		}*/
		
		//���� 
		//if�� �Ѱ��� ����ؼ� 3�� ����� ����ϱ�
		
		System.out.println("-------����1-----------");

		for ( int i = 15 ; i > 0; i--) {
			
			if( i % 3 == 0) {
				System.out.println(i + "�� 3�� ����Դϴ�.");
			}
		}
		
		System.out.println("--------����2----------");
		
		int dan = 7;
		
		for ( int i = 1; i < 10; i++) {
		System.out.println(dan + " * " + i + " = " + (dan * i));
		System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}

		
		System.out.println("--------����3----------");

		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է����ּ���.  : ");
		int input = scanner.nextInt();
		
	
		if((input > 1) && (input < 10)) {
			for ( int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", input, i, input*i);
			}
		} else {
			System.out.println("2~9 ������ ���ڸ� �Է��� �� �ֽ��ϴ�.");
		}
		
		
	}

}
