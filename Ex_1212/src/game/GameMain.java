package game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id, input;
		
		System.out.print("���̵� : ");
		id = scanner.next();
		GamePlay game = new GamePlay();
		
		while(true) {
			game.start();
			game.check();

			System.out.print("[�÷��� �����? y | n ]: ");
			input = scanner.next();
			if(input.equals("y")) {
			} else if(input.equals("n")) {
				System.out.println("������ �����մϴ�.");
				scanner.close();
				break;
			}
		}
		
	}

}
