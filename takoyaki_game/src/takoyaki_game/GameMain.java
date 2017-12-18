package takoyaki_game;

public class GameMain {

	public static void main(String[] args) {

		GamePlay gameplay = new GamePlay();
		Thread thread = new Thread(gameplay);
		
		if(gameplay.gamePlay()) {
		gameplay.makeTako();
		thread.start();
		gameplay.makeQuiz();
		gameplay.checkMoney();
		}
	}

}
