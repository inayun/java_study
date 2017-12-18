package takoyaki_game;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GamePlay implements Runnable{
	String[][] mold = new String[3][6];
	Takoyaki takoyaki = new Takoyaki();
	Scanner scanner = new Scanner(System.in);
	GameThread gamethread = new GameThread();
	User user = new User();

	int order = 0;
	int timePerOder = 3;
	int money = 0;
	String[] process = {"��","��","��","��"};

	public GamePlay() {}

	public boolean gamePlay() {
		
		System.out.println("==================");
		System.out.println("�����  TAKOYAKI  �����  ");
		System.out.println("                  ");
		for(int i = 0; i < mold.length; i++) {
			System.out.print("   ");
			for(int j = 0; j < mold[i].length; j++) {
				System.out.print(takoyaki.getBall(j)+" ");
			}
			System.out.println("");
		}
		System.out.println("                  ");
		System.out.println("��  ���� �� ���� ����(500��)");
		System.out.println("��  �븩�ϰ� �� ������ ����(1000��)");
		System.out.println("�� Ÿ���� ����(100��)");
		System.out.println("# �ϼ��Ǽ� �ȸ� ����");
		System.out.println("                  ");
		System.out.println("=================");
		
		System.out.print("id �Է� : ");
		
		user.setId(scanner.next());
		
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
		}
		System.out.println(user.getId() +"�� ���� : " + user.getMoney() + "��");
		System.out.println();
		System.out.print("PRESS 'S' TO START >> ");

		if(scanner.next().equalsIgnoreCase("s")) {
			return true;
		}
		return false;
	}

	public void makeTako() {
		
		order = new Random().nextInt(15)+1;
		System.out.printf("Ÿ�ھ�Ű %d�� �ֹ��̿�!\n",order);

		outer : for(int i = 0; i < order; i++) {

			inner : while(true) {
				int moldNum = new Random().nextInt(takoyaki.getMoldCount()-1);

				if(takoyaki.getBall(moldNum).equals(process[0])) {
					continue inner;
				} else {
					takoyaki.setBall(moldNum,process[0]);
					continue outer;
				}
			}
		}

	int count = 0;
	System.out.println("================");
	for(int i = 0; i < mold.length; i++) {
		System.out.print("   ");
		for(int j = 0; j < mold[i].length; j++) {
			System.out.print(takoyaki.getBall(count)+" ");
			count++;
		}
		System.out.println("");
	}
	System.out.println("================");
	}

	public void makeQuiz() {
		System.out.println("Ÿ�̸Ӵ� ��������!");
		System.out.println("��� Ǯ�� Ÿ�ھ�Ű�� Ÿ������ ��������!");
		System.out.println();

		int a;
		int b;
		int correntCount = 0;
		//�ֹ� ���� ��ŭ ���� ����
		outer : while(true) {

			if(correntCount == order) {
				break outer;
			}

			a = new Random().nextInt(50)+1;
			b = new Random().nextInt(50)+1;
			System.out.printf(" %d + %d = ", a, b);

			int answer = scanner.nextInt();

			if(answer == a+b) {
				correntCount++;
				System.out.println("Ÿ�ھ�Ű 1�� �����̿�~");
				inner : for(int x = 0; x < takoyaki.getMoldCount(); x++) {
					if(takoyaki.getBall(x)== process[0]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("�쿢! �а��簡 ���;��ڳ�! ���� 500��");
						user.setMoney(500);
						break inner;
					} else if(takoyaki.getBall(x) == process[1]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("��ȫȫȫ �븩�ϰ� �� �������׿� 1000���̿�~");
						user.setMoney(1000);
						break inner;
					} else if(takoyaki.getBall(x) == process[2]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("���� �� ���ݾƿ�!��縦 �ϰڴܰž߹��� 100���� �Ʊ��!");
						user.setMoney(100);
						break inner;
					}
				}
			}

			int count = 0;
			System.out.println(user.getMoney() + "��");
			System.out.println("================");
			for(int k = 0; k < mold.length; k++) {
				for(int j = 0; j < mold[k].length; j++) {
					System.out.print(takoyaki.getBall(count)+" ");
					count++;
				}
				System.out.println("");
			}
			System.out.println("================");


		} //���� �ݺ� ����
	}

	public void checkMoney() {
		
		System.out.printf("���� ���� : %d��" , user.getMoney());
		
		try {
			UserWriter writer = new UserWriter(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����Ϸ�!");
	}

	public void run() {

		try {
			Thread.sleep(1500);
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(1000);
				//�ֹ��� �� ���¸� �ణ �������ɷ�
				if(takoyaki.getBall(i).equals(process[0])) { 
					takoyaki.setBall(i, process[1]);
				}
			}
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(1000);
				//�ణ �������� ź�ɷ�
				if (takoyaki.getBall(i).equals(process[1])) {
					takoyaki.setBall(i, process[2]);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
