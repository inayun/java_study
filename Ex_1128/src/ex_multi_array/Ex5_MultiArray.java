package ex_multi_array;

import java.util.Scanner;

public class Ex5_MultiArray {

	public static void main(String[] args) {

		/* 
		 * ����
		 * ����� �ο� : 2
		 * �̸� : ȫ�浿
		 * �������� : 90
		 * �������� : 80
		 * --------
		 * 
		 * 
		 */
		
		
		int num = 0;
		String[] info = {"�̸�","����","����","����"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� �ο� : ");
		num = scanner.nextInt();
		String[][] member = new String[num][info.length];
		
	
		for( int i = 0; i < member.length; i++ ) {
			
			for( int j = 0; j < member[i].length; j++ ) {
				System.out.print(info[j] + ":");
				member[i][j] = scanner.next();
			}
			System.out.println("------------------");
		} //outer
		System.out.printf("%d�� ��� �Ϸ�!\n", num);
		
			for( int i = 0; i < member.length; i++ ) {
			for( int j = 0; j < member[i].length; j++ ) {
				System.out.print(member[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

}
