package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		//arr.get(index)
		
		ArrayList<User> arr = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		String id;
		int pwd;

		outer : while(true) {

			System.out.print("id : ");
			id = scanner.next();

			System.out.print("pwd : ");
			pwd = scanner.nextInt();

			for(int i = 0; i<arr.size(); i++ ) {
				if(arr.get(i).getId().equals(id)) {
					System.out.println(" ���̵� �ߺ��Ǿ��I");
					continue outer;
				}
			}
			//�ݺ��Ҷ����� ���ο�  User ��ü ����
			User user = new User();
			user.setId(id);
			user.setPwd(pwd);

			arr.add(user);


			for(int i = 0; i<arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("--------------------------");
			}


		}//while
	}

}
