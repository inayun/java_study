package ex3_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList();
		User u = new User();
		u.setName("ㅎ");
		u.setNo(2);
		users.add(u);
		
		u = new User();
		u.setName("ㄱ");
		u.setNo(1);
		users.add(u);

		u = new User();
		u.setName("ㄴ");
		u.setNo(4);
		users.add(u);
		
		u = new User();
		u.setName("ㄷ");
		u.setNo(3);
		users.add(u);
		
		
		System.out.println("======정렬 전 =========");
		
		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========문자 오름차순========");
		Collections.sort(users, new NameAscCompare());
		//정렬을 한담에 users에 넣어줌

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========문자 내림차순========");
		Collections.sort(users, new NameDescCompare());
		//정렬을 한담에 users에 넣어줌

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========숫자 오름차순========");
		Collections.sort(users, new NoAscCompare());
		//정렬을 한담에 users에 넣어줌

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========숫자 내림차순========");
		Collections.sort(users, new NoDescCompare());
		//정렬을 한담에 users에 넣어줌

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
	}
}
