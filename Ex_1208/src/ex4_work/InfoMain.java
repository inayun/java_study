package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoMain {
	public static void main(String[] args) {

		ArrayList<Info> infoList = new ArrayList();
		InfoManager manager = new InfoManager();
		Info info = null; //객체는 null로 초기화해줘야함
		Scanner scanner = new Scanner(System.in);
		String name,tel;
		int age;

		while(true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("etc.종    료");
			System.out.print(">>>");

			switch(scanner.nextInt()) {

			case 1 : //정보추가
				manager.getInsert().insertInfo(info, infoList);
				break;

			case 2 : //정보삭제
				manager.getDelete().deleteInfo(infoList);
				break;

			case 3 : //전체 정보 보기
				manager.getShow().showInfo(infoList);
				break;

			default :
				System.out.println("프로그램 종료!");
				return;

			} //switch
		} //while
	}
}
