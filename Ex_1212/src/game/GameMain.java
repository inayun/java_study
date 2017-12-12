package game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id, input;
		
		System.out.print("아이디 : ");
		id = scanner.next();
		GamePlay game = new GamePlay();
		
		while(true) {
			game.start();
			game.check();

			System.out.print("[플레이 어게인? y | n ]: ");
			input = scanner.next();
			if(input.equals("y")) {
			} else if(input.equals("n")) {
				System.out.println("게임을 종료합니다.");
				scanner.close();
				break;
			}
		}
		
	}

}
