package ex4_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		/*
		 * ���̵� ���� : aaa
		 * aaa
		 * ���̵� ���� : bbb
		 * aaa
		 * bbb
		 */
		
		
		List<String> list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		outer : while(true) {
			System.out.print("���̵� ���� : ");
			String id = scanner.next();
			/*
			if(list.contains(id)) {
				System.out.println("���̵� �ߺ��Ǿ����ϴ٤Ф�");
				System.out.println("--------------------");
				continue;
			} else {
				list.add(id);
			}
			*/
			
			
			for(int i = 0; i < list.size(); i ++) {
				if(list.get(i).equals(id)) {
					System.out.println("���̵� �ߺ��Ǿ���");
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
