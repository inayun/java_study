package game;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

	Scanner scanner = new Scanner(System.in);
	private int win;
	private int draw;
	private int lose;
	private int com;
	private int player;

	public GamePlay() {
		this.win = 0;
		this.draw = 0;
		this.lose = 0;
	}

	public void check() {

		com = new Random().nextInt(3)+1;

		if(player - com == 1 || player - com == -2) {
			System.out.println("당신이 이겼쪙");
			win++;
		}else if (player - com == -1 || player - com == 2) {
			System.out.println("당신이 져쪙");
			lose++;
		}else {
			System.out.println("비겨쪄");
			draw++;
		}

		System.out.printf("★☆%d승 %d무 %d패☆★\n",win,draw,lose);
		System.out.println("------------------------------");
	}

	public void start() {
		System.out.print("[가위(s) | 바위(r) | 보(p)] : ");
		String input = scanner.next();

		if(input.equals("s")) {
			player = 1; //가위
		}else if(input.equals("r")) {
			player = 2; //바위
		}else if(input.equals("p")) {
			player = 3; //보자기
		}else {
			System.out.println("입력이 올바르지 않습니다.");
			start();
		}
	}

}
