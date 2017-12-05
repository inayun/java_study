package ex11_work;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		WordList wl = new WordList();
		String word = wl.PickWord();
		String problem = wl.MakeProblem(word);
		
		System.out.println("문제 : " + problem);
		System.out.print("정답 : ");
		String input = scanner.next();
		wl.CheckAnswer(input);
		scanner.close();
	}

}
