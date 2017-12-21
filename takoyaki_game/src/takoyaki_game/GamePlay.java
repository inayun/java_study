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
	String[] process = {"◎","◐","●","＃"};

	public GamePlay() {}
	
	public int getMoney() {
		return money;
	}
	public boolean gamePlay() {
		
		System.out.println("==================");
		System.out.println("▼▽▼▽  TAKOYAKI  ▼▽▼▽  ");
		System.out.println("                  ");
		for(int i = 0; i < mold.length; i++) {
			System.out.print("   ");
			for(int j = 0; j < mold[i].length; j++) {
				System.out.print(takoyaki.getBall(j)+" ");
			}
			System.out.println("");
		}
		System.out.println("                  ");
		System.out.println("◎  아직 덜 익은 상태(500원)");
		System.out.println("◐  노릇하게 잘 구워진 상태(1000원)");
		System.out.println("● 타버린 상태(100원)");
		System.out.println("# 완성되서 팔린 상태");
		System.out.println("                  ");
		System.out.println("=================");
		
		System.out.print("id 입력 : ");
		
		user.setId(scanner.next());
		
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
		}
		System.out.println(user.getId() +"님 지갑 : " + user.getMoney() + "원");
		System.out.println();
		System.out.print("PRESS 'S' TO START >> ");

		if(scanner.next().equalsIgnoreCase("s")) {
			return true;
		}
		return false;
	}

	public void makeTako() {
		
		order = new Random().nextInt(takoyaki.getMoldCount())+1;
		System.out.printf("타코야키 %d개 주문이요!\n",order);

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
		System.out.println("타이머는 눌러졌다!");
		System.out.println("퀴즈를 풀어 타코야키가 타기전에 구워내라!");
		System.out.println();

		System.out.println("게임의 유형을 선택하세요");
		System.out.println("1번 : 수학이 좋아용");
		System.out.println("2번 : 영어가 좋아용");
		System.out.println("3번 : 국어가 좋아용");
		
		
		int a;
		int b;
		int correntCount = 0;
		//주문 개수 만큼 문제 출제
		outer : while(true) {

			if(correntCount == order) {
				break outer;
			}
			
			String quiz="";
			for(int i = 0; i < 8; i++) {
			a = new Random().nextInt(122-97+1)+97;
			quiz += (char)a;
			}
			
			System.out.printf(" %s = ", quiz);

			String answer = scanner.next();

			if(answer.equals(quiz)) {
				correntCount++;
				System.out.println("타코야키 1개 성공이요~");
				inner : for(int x = 0; x < takoyaki.getMoldCount(); x++) {
					if(takoyaki.getBall(x)== process[0]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("우엑! 밀가루가 안익었자나! 옜다 500원");
						user.setMoney(500);
						break inner;
					} else if(takoyaki.getBall(x) == process[1]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("오홍홍홍 노릇하게 잘 구워졌네요 1000원이요~");
						user.setMoney(1000);
						break inner;
					} else if(takoyaki.getBall(x) == process[2]) {
						takoyaki.setBall(x, process[3]);
						System.out.println("꺄악 다 탔잖아요!장사를 하겠단거야뭐야 100원도 아까워!");
						user.setMoney(100);
						break inner;
					}
				}
			}

			int count = 0;
			System.out.println(user.getMoney() + "원");
			System.out.println("================");
			for(int k = 0; k < mold.length; k++) {
				for(int j = 0; j < mold[k].length; j++) {
					System.out.print(takoyaki.getBall(count)+" ");
					count++;
				}
				System.out.println("");
			}
			System.out.println("================");


		} //문제 반복 출제
	}

	public void checkMoney() {
		
		System.out.printf("오늘 수입 : %d원" , user.getMoney());
		
		try {
			UserWriter writer = new UserWriter(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void checkMoney(int money, int tray) {
		
		user.setFinalMoney(money);
		user.setTray(tray);
		try {
			UserWriter writer = new UserWriter(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void run() {

		try {
			Thread.sleep(1500);
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(1000);
				//주문이 들어간 상태면 약간 구워진걸로
				if(takoyaki.getBall(i).equals(process[0])) { 
					takoyaki.setBall(i, process[1]);
				}
			}
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(1000);
				//약간 구워진게 탄걸로
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
