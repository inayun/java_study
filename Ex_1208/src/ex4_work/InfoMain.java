package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoMain {
	public static void main(String[] args) {

		ArrayList<Info> infoList = new ArrayList();
		Info info;
		Scanner scanner = new Scanner(System.in);
		String name,tel;
		int age,input;

		outer : while(true) {
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.println("etc.��    ��");
			System.out.print(">>>");
			input = scanner.nextInt();

			switch(input) {

			case 1 :
				System.out.println("------���� �߰�------");

				System.out.print("�̸� : ");
				name = scanner.next();
				System.out.print("���� : ");
				age = scanner.nextInt();
				System.out.print("��ȭ : ");
				tel = scanner.next();

				info = new Info(name,age,tel);
				infoList.add(info);
				System.out.println("���� ���� �Ϸ�!");
				System.out.println("----------------");


				break;

			case 2 :
				System.out.println("------���� ����------");

				System.out.print("������ �̸� : ");
				name = scanner.next();


				for(int i = 0; i<infoList.size(); i++ ) {

					if(infoList.get(i).getName().equals(name)) {
						infoList.remove(i);
						System.out.println("----------------");
					}
				}
				System.out.println("���� �Ϸ�!");
				System.out.println("----------------");


				break;

			case 3 :
				System.out.println("------��ü ����------");

				for(int i = 0; i<infoList.size(); i++ ) {
					System.out.println("�̸� : " + infoList.get(i).getName());
					System.out.println("���� : " + infoList.get(i).getAge());
					System.out.println("��ȭ : " + infoList.get(i).getTel());
				}
				System.out.println("----------------");

				break;

			default :
				break outer;

			} //switch
		} //while
	}
}
