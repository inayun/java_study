package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoMain {
	public static void main(String[] args) {

		ArrayList<Info> infoList = new ArrayList();
		InfoManager manager = new InfoManager();
		Info info = null; //��ü�� null�� �ʱ�ȭ�������
		Scanner scanner = new Scanner(System.in);
		String name,tel;
		int age;

		while(true) {
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��ü����");
			System.out.println("etc.��    ��");
			System.out.print(">>>");

			switch(scanner.nextInt()) {

			case 1 : //�����߰�
				manager.getInsert().insertInfo(info, infoList);
				break;

			case 2 : //��������
				manager.getDelete().deleteInfo(infoList);
				break;

			case 3 : //��ü ���� ����
				manager.getShow().showInfo(infoList);
				break;

			default :
				System.out.println("���α׷� ����!");
				return;

			} //switch
		} //while
	}
}
