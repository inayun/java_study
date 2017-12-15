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
		
		//시작 뷰 출력과 함께 아이디 입력받기
		view.startView();
		
		System.out.print("아이디 : ");
		user.setId(scanner.next());
		
		//아이디 로더하기
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
		}
		view.menuView(user);
		scanner.close();
	}
}
