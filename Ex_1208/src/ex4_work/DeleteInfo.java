package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteInfo {

	public void deleteInfo(ArrayList<Info> infoList) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------정보 삭제------");
		System.out.print("삭제할 이름 : ");
		String name = scanner.next();

		for(int i = 0; i<infoList.size(); i++ ) {

			if(infoList.get(i).getName().equals(name)) {
				infoList.remove(i);
				System.out.println("- - - - - - - - -");
				i = -1;
			}

			if(i+1 == infoList.size())
				System.out.println(name + "은 존재하지 않슴미당");
		}
		System.out.println("삭제 완료!");
		System.out.println("----------------");
	}
}
