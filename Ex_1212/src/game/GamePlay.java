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
			System.out.println("����� �̰奒");
			win++;
		}else if (player - com == -1 || player - com == 2) {
			System.out.println("����� ����");
			lose++;
		}else {
			System.out.println("�����");
			draw++;
		}

		System.out.printf("�ڡ�%d�� %d�� %d�С١�\n",win,draw,lose);
		System.out.println("------------------------------");
	}

	public void start() {
		System.out.print("[����(s) | ����(r) | ��(p)] : ");
		String input = scanner.next();

		if(input.equals("s")) {
			player = 1; //����
		}else if(input.equals("r")) {
			player = 2; //����
		}else if(input.equals("p")) {
			player = 3; //���ڱ�
		}else {
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			start();
		}
	}

}
