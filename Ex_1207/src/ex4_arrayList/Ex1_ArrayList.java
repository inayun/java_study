package ex4_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		/*
		 * 아이디 생성 : aaa
		 * aaa
		 * 아이디 생성 : bbb
		 * aaa
		 * bbb
		 */
		
		
		List<String> list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			String id = scanner.next();
			/*
			if(list.contains(id)) {
				System.out.println("아이디가 중복되었습니다ㅠㅠ");
				System.out.println("--------------------");
				continue;
			} else {
				list.add(id);
			}
			*/
			
			
			for(int i = 0; i < list.size(); i ++) {
				if(list.get(i).equals(id)) {
					System.out.println("아이디가 중복되었쮸");
					System.out.println("--------------------");
					continue outer;
				} 
			}
			list.add(id);
			
			for(int i = 0; i < list.size(); i ++) {
				System.out.println(list.get(i));
			}
			System.out.println("--------------------");
		}
		
	}
}
