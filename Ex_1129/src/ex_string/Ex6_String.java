package ex_string;

import java.util.Scanner;

public class Ex6_String {

	public static void main(String[] args) {

		/*
		 * ��� �˻� : �۰�ȣ
		 * [�۰�ȣ]
		 * ����
		 * ����
		 * ����
		 */
		String[][] actor = {{"[�۰�ȣ]","����","����","����"},
							{"[�����]","���ϵ�","����","����"},
							{"[������]","BHC","����","����2"}};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� �˻� : ");
		String input = scanner.next();
		int flag = 0;
				
		for(int i = 0; i < actor.length; i++) {
			String name = actor[i][0].substring((actor[i][0].indexOf('['))+1,actor[i][0].indexOf(']'));
			
			if(name.equals(input)) {
				flag = 1;
				for(int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			} 
		}
		if(flag == 0) {
			System.out.println("�ش� ��찡 �������� �ʽ��ϴ�. ");
		}
		
	}

}
