package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShowWord implements Runnable{

	Scanner scanner = new Scanner(System.in);
	private String[] word = {"apple", "grape", "orange"};
	private List<String> wordList = new ArrayList();
	private boolean isPlaying = true;

	public void showWord() {

		wordList.add(word[new Random().nextInt(3)]);
		
		while(isPlaying) {
			
			System.out.println(wordList);
			System.out.print(">> ");
			String answer = scanner.next();

			for(int i = 0; i< wordList.size(); i++) {
				if (wordList.get(i).equals(answer)) {
					wordList.remove(wordList.get(i));
				}
			}
			if(wordList.size()==0) {
				System.out.println("¡Ú¡Ù¡Ú¡ÙÅ¬¸®¾î!¡Ú¡Ù¡Ú¡Ù");
				isPlaying = false;
			}
		}
	}

	@Override
	public void run() {

		while(isPlaying) {
			try {
				Thread.sleep(3000);
				wordList.add(word[new Random().nextInt(3)]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
