package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteInfo {

	public void deleteInfo(ArrayList<Info> infoList) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------���� ����------");
		System.out.print("������ �̸� : ");
		String name = scanner.next();

		for(int i = 0; i<infoList.size(); i++ ) {

			if(infoList.get(i).getName().equals(name)) {
				infoList.remove(i);
				System.out.println("- - - - - - - - -");
				i = -1;
			}

			if(i+1 == infoList.size())
				System.out.println(name + "�� �������� �ʽ��̴�");
		}
		System.out.println("���� �Ϸ�!");
		System.out.println("----------------");
	}
}
