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
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 정보정보");
			System.out.println("etc.종    료");
			System.out.print(">>>");
			input = scanner.nextInt();

			switch(input) {

			case 1 :
				System.out.println("------정보 추가------");

				System.out.print("이름 : ");
				name = scanner.next();
				System.out.print("나이 : ");
				age = scanner.nextInt();
				System.out.print("전화 : ");
				tel = scanner.next();

				info = new Info(name,age,tel);
				infoList.add(info);
				System.out.println("정보 저장 완료!");
				System.out.println("----------------");


				break;

			case 2 :
				System.out.println("------정보 삭제------");

				System.out.print("삭제할 이름 : ");
				name = scanner.next();


				for(int i = 0; i<infoList.size(); i++ ) {

					if(infoList.get(i).getName().equals(name)) {
						infoList.remove(i);
						System.out.println("----------------");
					}
				}
				System.out.println("삭제 완료!");
				System.out.println("----------------");


				break;

			case 3 :
				System.out.println("------전체 정보------");

				for(int i = 0; i<infoList.size(); i++ ) {
					System.out.println("이름 : " + infoList.get(i).getName());
					System.out.println("나이 : " + infoList.get(i).getAge());
					System.out.println("전화 : " + infoList.get(i).getTel());
				}
				System.out.println("----------------");

				break;

			default :
				break outer;

			} //switch
		} //while
	}
}
