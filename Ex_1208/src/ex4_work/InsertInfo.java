package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertInfo {
	
	public void insertInfo(Info info, ArrayList<Info> infoList) {
		Scanner scanner = new Scanner(System.in);
		
		info = new Info();

		System.out.println("------정보 추가------");

		System.out.print("이름 : ");
		info.setName(scanner.next());
		System.out.print("나이 : ");
		info.setAge(scanner.nextInt());
		System.out.print("전화 : ");
		info.setTel(scanner.next());
		
		infoList.add(info);
		System.out.println("정보 저장 완료!");
		System.out.println("----------------");


	}
}
