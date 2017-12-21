package gamble_game;

import java.util.Scanner;

public class Main {
	public static void gambleMain(int money, int tray) throws InterruptedException {
		
		UserInterFace ui = new UserInterFace(18,40);
		Market market = new Market(money,tray);
		User user = market.getUser();
		Scanner sc = new Scanner(System.in);
		ui.ShowStart();
		sc.next();
		ui.showStockGraph();
		System.out.println();
		market.passTime();
		System.out.println(market.flow);
		ui.changeStockState(market.getFlow());
		ui.showStockGraph();
		
		int selecCount=0;
		
		try {
			while(true) {
				market.calculateFlow();
				market.passTime();
				System.out.println(market.flow);
				ui.changeStockState(market.getFlow());
				ui.showStockGraph();
				Thread.sleep(500);
				selecCount++;
				if (selecCount == 4) {
					System.out.println("�Ա� : d | ��� : w | ���� : x");
					String selec = sc.next();
					if(!selec.equalsIgnoreCase("x")) {
						System.out.print("�󸶳�...? >>");
						int amount = sc.nextInt(); 
						market.selector(selec, amount);
					}
					
					selecCount = 0;

					Thread.sleep(1500);
				}
				
				System.out.println();

			}
		} catch (Exception e) {	
			System.out.println("������ �������ϴ�.");
			System.out.println("���� Ÿ�ھ߳� �ȷ�����.");
			
		}finally {
			
		}
	}
}