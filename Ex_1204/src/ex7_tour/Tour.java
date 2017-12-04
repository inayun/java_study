package ex7_tour;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� : ");
		int n = scanner.nextInt();
		
		Guide guide = new Guide(n);
		System.out.println("������ ���");
		
		for(int i = 0; i < guide.guest.length; i++) {
			System.out.print("�̸� : ");
			guide.guest[i].setName(scanner.next());
			System.out.print("���� : ");
			guide.guest[i].setGender(scanner.next());
			System.out.print("���� : ");
			guide.guest[i].setAge(scanner.nextInt());
			System.out.println("-----------");
		}
		
		outer : while(true) {
			System.out.println("1. ������ ����");
			System.out.println("2. ������ ����");
			System.out.println("etc.��        ��");
			
			int select = scanner.nextInt();
			
			
			
			switch(select) {
			
			case 1 : //������ ���� 
				
				for(int i = 0; i < guide.guest.length; i++) {
					
					System.out.println("�̸� : " + guide.guest[i].getName());
					System.out.println("���� : " + guide.guest[i].getGender());
					System.out.println("���� : " + guide.guest[i].getAge());
					System.out.println("������ : " + guide.guest[i].getPoint());
					System.out.println("------------------");
				}
				
				break;
				
			case 2 : //������ ����
				
					System.out.print("������ ���� ��� : ");
					Guide.point= scanner.next();
					
				break;
				
			default : //����
				System.out.println("����");
				break outer;
			
			}
		}
	}

}
