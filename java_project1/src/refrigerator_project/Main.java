package refrigerator_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		View view = new View();
		User user = new User();
		
		//���� �� ��°� �Բ� ���̵� �Է¹ޱ�
		view.startView();
		
		System.out.print("���̵� : ");
		user.setId(scanner.next());
		
		//���̵� �δ��ϱ�
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
		}
		view.menuView(user);
		scanner.close();
	}
}
