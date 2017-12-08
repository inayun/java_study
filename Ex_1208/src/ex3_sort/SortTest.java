package ex3_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList();
		User u = new User();
		u.setName("��");
		u.setNo(2);
		users.add(u);
		
		u = new User();
		u.setName("��");
		u.setNo(1);
		users.add(u);

		u = new User();
		u.setName("��");
		u.setNo(4);
		users.add(u);
		
		u = new User();
		u.setName("��");
		u.setNo(3);
		users.add(u);
		
		
		System.out.println("======���� �� =========");
		
		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========���� ��������========");
		Collections.sort(users, new NameAscCompare());
		//������ �Ѵ㿡 users�� �־���

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========���� ��������========");
		Collections.sort(users, new NameDescCompare());
		//������ �Ѵ㿡 users�� �־���

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========���� ��������========");
		Collections.sort(users, new NoAscCompare());
		//������ �Ѵ㿡 users�� �־���

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
		
		System.out.println("========���� ��������========");
		Collections.sort(users, new NoDescCompare());
		//������ �Ѵ㿡 users�� �־���

		for(int i = 0; i< users.size(); i++) {
			System.out.print(users.get(i).getNo() + ":");
			System.out.print(users.get(i).getName() + "  \n");
		}
	}
}
