package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertInfo {
	
	public void insertInfo(Info info, ArrayList<Info> infoList) {
		Scanner scanner = new Scanner(System.in);
		
		info = new Info();

		System.out.println("------���� �߰�------");

		System.out.print("�̸� : ");
		info.setName(scanner.next());
		System.out.print("���� : ");
		info.setAge(scanner.nextInt());
		System.out.print("��ȭ : ");
		info.setTel(scanner.next());
		
		infoList.add(info);
		System.out.println("���� ���� �Ϸ�!");
		System.out.println("----------------");


	}
}
