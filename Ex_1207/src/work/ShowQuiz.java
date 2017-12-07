package work;

import java.util.Random;
import java.util.Scanner;

public class ShowQuiz implements Runnable{

	Scanner scanner = new Scanner(System.in);
	int quizCount = 5;
	int count = 0;
	int time = 0;
	boolean playing = true;

	public void ShowQuiz() {

		while(count < quizCount) {

			int a = new Random().nextInt(50)+1;
			int b = new Random().nextInt(50)+1;

			System.out.print(a + "+" + b + "= ") ;

			int input = scanner.nextInt(); 

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

		while(playing) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(count == quizCount) {
				System.out.println("결과 : " + time +"초");
				playing = false;
			}
		}
	}
	
}
