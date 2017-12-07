package work;

public class QuizMain {
	public static void main(String[] args) {
		
		ShowQuiz show = new ShowQuiz();
		Thread thread = new Thread(show);
		
		thread.start();
		show.ShowQuiz();
	}
}
