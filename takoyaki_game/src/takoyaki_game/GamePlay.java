package takoyaki_game;

import java.util.Random;
import java.util.Scanner;

public class GamePlay implements Runnable{
	private static int timer = 0;
	String[][] mold = new String[3][6];
	Takoyaki takoyaki = new Takoyaki();
	Scanner scanner = new Scanner(System.in);
	GameThread gamethread = new GameThread();
		
	int order;
	int timePerOder = 3;
	String[] process = {"◎","◐","●","＃"};
			
	public GamePlay() {}

	public void gamePlay() {

		System.out.println("================");
		for(int i = 0; i < mold.length; i++) {
			for(int j = 0; j < mold[i].length; j++) {
				System.out.print(takoyaki.getBall(j)+" ");
			}
			System.out.println("");
		}
		System.out.println("================");


		order = new Random().nextInt(15)+1;
		System.out.printf("타코야키 %d개 주문이요!\n",order);
	}

	public void makeTako() {

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
			for(int j = 0; j < mold[i].length; j++) {
				System.out.print(takoyaki.getBall(count)+" ");
				count++;
			}
			System.out.println("");
		}
		System.out.println("================");
	}

	public void makeQuiz() {
		System.out.printf("타이머는 눌러졌다! (제한시간  %d초)\n",order * timePerOder);
		System.out.println("퀴즈를 풀어 타코야키가 타기전에 구워내라!");
		System.out.println();
		
		int a;
		int b;
		
		for(int i = 0; i < order; i++) {
		a = new Random().nextInt(50)+1;
		b = new Random().nextInt(50)+1;
		System.out.printf(" %d + %d = ", a, b);
		
		int answer = scanner.nextInt();
		
		if(answer == a+b) {
			System.out.println("타코야키 1개 성공이요~");
			for(int x = 0; x < mold.length; x++) {
				if(takoyaki.getBall(x)!="○" && takoyaki.getBall(x) != process[3]) {
					takoyaki.setBall(x, process[3]);
					break;
				}
			}
		}
		int count = 0;
		System.out.println("================");
		for(int k = 0; k < mold.length; k++) {
			for(int j = 0; j < mold[k].length; j++) {
				System.out.print(takoyaki.getBall(count)+" ");
				count++;
			}
			System.out.println("");
		}
		System.out.println("================");
		
		
		}
	}

	public void checkTime() {
		if(timer == order*timePerOder) {
			System.out.println("제한시간 초과!");
		}
	}

	public void run() {
		try {
			Thread.sleep(1000);
			timer++;
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(2000);
				if(takoyaki.getBall(i).equals(process[0])) {
					takoyaki.setBall(i, process[1]);
				} else if (takoyaki.getBall(i).equals(process[1])) {
					takoyaki.setBall(i, process[2]);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







}
