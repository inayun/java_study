package ex4_work;

import java.util.ArrayList;

public class ShowInfo {

	public void showInfo(ArrayList<Info> infoList) {
		System.out.println("------��ü ����------");
		System.out.println("����ο� " + infoList.size());

		for(int i = 0; i<infoList.size(); i++ ) {
			System.out.println("�̸� : " + infoList.get(i).getName());
			System.out.println("���� : " + infoList.get(i).getAge());
			System.out.println("��ȭ : " + infoList.get(i).getTel());
			System.out.println("----------------");

		}
		System.out.println("----------------");
	}
	
}
