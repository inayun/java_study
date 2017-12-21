package takoyaki_game;
import gamble_game.Main;
import gamble_game.Market;

public class TakoyakiMain {

	public static void main(String[] args) throws InterruptedException {

		GamePlay gameplay = new GamePlay();
		Thread thread = new Thread(gameplay);
		gamble_game.Main gambleGame = new gamble_game.Main();
		gamble_game.Market gambleMarket = new gamble_game.Market();
		
		
		gameplay.gamePlay();
		gameplay.makeTako();
		thread.start();
		gameplay.makeQuiz();
		gameplay.checkMoney();
		Thread.sleep(2000);
		System.out.println("오늘 하루도 수고했어요~! 내일은 주식으로 돈 불리자~");
		Thread.sleep(2000);
		gambleGame.gambleMain(gameplay.user.getMoney(),gameplay.user.getTray());
		gameplay.checkMoney(gambleMarket.getUser().getBalance(),gambleMarket.getTray());
		
		
	}

}
