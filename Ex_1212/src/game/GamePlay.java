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

		System.out.printf("%s�� %d�� %d�� %d�� \n", 
				user.getId(), user.getWin(), user.getDraw(), user.getLose());
	}

	public void reagain() {

		System.out.print("[�÷��� �����? y | n ]: ");
		String input = scanner.next();
		if(input.equals("y")) {
		} else if(input.equals("n")) {
			System.out.println("������ �����մϴ�.");
			System.out.println(user.getId() + "�� ����!");

			try {
				ScoreWriter writer = new ScoreWriter(user);
			} catch (IOException e) {
				e.printStackTrace();
			}

			GameMain.isPlaying = false;
		} else {
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			reagain();
		}
	}

	public void check() {

		com = new Random().nextInt(3)+1;

		if(player - com == 1 || player - com == -2) {
			System.out.println("����� �̰奒");
			user.setWin();
		}else if (player - com == -1 || player - com == 2) {
			System.out.println("����� ����");
			user.setLose();
		}else {
			System.out.println("�����");
			user.setDraw();
		}

		System.out.printf("�ڡ�%d�� %d�� %d�С١�\n",user.getWin(),user.getDraw(),user.getLose());
		System.out.println("------------------------------");
	}

	public void start() {
		System.out.print("[����(s) | ����(r) | ��(p)] : ");
		String input = scanner.next();

		if(input.equalsIgnoreCase("s")) {
			player = 1; //����
		}else if(input.equalsIgnoreCase("r")) {
			player = 2; //����
		}else if(input.equalsIgnoreCase("p")) {
			player = 3; //���ڱ�
		}else {
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			start();
		}
	}

}
