package work;

public class TypingMain {
	public static void main(String[] args) throws InterruptedException {

		ShowWord showWord = new ShowWord();
		Thread thread = new Thread(showWord);
		thread.setDaemon(true);
		thread.start();
		showWord.showWord();
		
	}

}
