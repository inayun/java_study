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
		
		view.startView();
		System.out.print("¾ÆÀÌµð : ");
		user.setId(scanner.next());
		
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
		}
		view.menuView(user);
		scanner.close();
	}
}
