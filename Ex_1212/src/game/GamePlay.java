package game;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GamePlay {

	Scanner scanner = new Scanner(System.in);
	User user = new User();
	private int com;
	private int player;

	public GamePlay() {}

	public GamePlay(String id) {
		user.setId(id);

		try {
			ScoreLoader loader = new ScoreLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.printf("%s님 %d승 %d무 %d패 \n", 
				user.getId(), user.getWin(), user.getDraw(), user.getLose());
	}

	public void reagain() {

		System.out.print("[플레이 어게인? y | n ]: ");
		String input = scanner.next();
		if(input.equals("y")) {
		} else if(input.equals("n")) {
			System.out.println("게임을 종료합니다.");
			System.out.println(user.getId() + "님 퇴장!");

			try {
				ScoreWriter writer = new ScoreWriter(user);
			} catch (IOException e) {
				e.printStackTrace();
			}

			GameMain.isPlaying = false;
		} else {
			System.out.println("입력이 올바르지 않습니다.");
			reagain();
		}
	}

	public void check() {

		com = new Random().nextInt(3)+1;

		if(player - com == 1 || player - com == -2) {
			System.out.println("당신이 이겼쪙");
			user.setWin();
		}else if (player - com == -1 || player - com == 2) {
			System.out.println("당신이 져쪙");
			user.setLose();
		}else {
			System.out.println("비겨쪄");
			user.setDraw();
		}

		System.out.printf("★☆%d승 %d무 %d패☆★\n",user.getWin(),user.getDraw(),user.getLose());
		System.out.println("------------------------------");
	}

	public void start() {
		System.out.print("[가위(s) | 바위(r) | 보(p)] : ");
		String input = scanner.next();

		if(input.equalsIgnoreCase("s")) {
			player = 1; //가위
		}else if(input.equalsIgnoreCase("r")) {
			player = 2; //바위
		}else if(input.equalsIgnoreCase("p")) {
			player = 3; //보자기
		}else {
			System.out.println("입력이 올바르지 않습니다.");
			start();
		}
	}

}
