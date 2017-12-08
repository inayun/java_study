package ex4_work;

import java.util.ArrayList;

public class ShowInfo {

	public void showInfo(ArrayList<Info> infoList) {
		System.out.println("------전체 정보------");
		System.out.println("등록인원 " + infoList.size());

		for(int i = 0; i<infoList.size(); i++ ) {
			System.out.println("이름 : " + infoList.get(i).getName());
			System.out.println("나이 : " + infoList.get(i).getAge());
			System.out.println("전화 : " + infoList.get(i).getTel());
			System.out.println("----------------");

		}
		System.out.println("----------------");
	}
	
}
