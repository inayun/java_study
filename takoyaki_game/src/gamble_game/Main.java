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
					System.out.println("입금 : d | 출금 : w | 관망 : x");
					String selec = sc.next();
					if(!selec.equalsIgnoreCase("x")) {
						System.out.print("얼마나...? >>");
						int amount = sc.nextInt(); 
						market.selector(selec, amount);
					}
					
					selecCount = 0;

					Thread.sleep(1500);
				}
				
				System.out.println();

			}
		} catch (Exception e) {	
			System.out.println("게임이 끝났습니다.");
			System.out.println("내일 타코야끼 팔러가요.");
			
		}finally {
			
		}
	}
}