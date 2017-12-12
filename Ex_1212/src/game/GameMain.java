package game;

import java.util.Scanner;

public class GameMain {

	static boolean isPlaying = true;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("¾ÆÀÌµð : ");
		String id = scanner.next();
		GamePlay game = new GamePlay(id);
		
		
		while(isPlaying) {
			game.start();
			game.check();
			game.reagain();
		}
	}

}
