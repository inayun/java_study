package work;

import java.util.Random;
import java.util.Scanner;

public class ShowQuiz implements Runnable{

	Scanner scanner = new Scanner(System.in);
	Random r = new Random();
	final private int quizCount = 5;
	private int count = 0;
	private int time = 0;
	private boolean isPlaying = true;
	private int a,b,input;

	
	public void ShowQuiz() {

		while(count < quizCount) {

			a = r.nextInt(50)+1;
			b = r.nextInt(50)+1;

			System.out.print(a + "+" + b + "= ") ;

			input = scanner.nextInt(); 

			if(input == a+b) {
				count++;
				System.out.println("정답!");
			} else {
				System.out.println("오답!");
			}
		}
	} //showQuiz
	
	@Override
	public void run() {

		while(isPlaying) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(count == quizCount) {
				System.out.println("결과 : " + time +"초");
				isPlaying = false;
				break;
			}
		}
	}
	
}
