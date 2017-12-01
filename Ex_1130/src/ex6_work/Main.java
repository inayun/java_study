package ex6_work;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Game game = new Game();
		int min = 1;
		int max = 50;

		while(true) {
			
			System.out.printf("%d ~ %d 사이의 값을 입력하세요  : " , min, max);
			
			int input = scanner.nextInt();
			int result = game.check(input);
			
			if ( result == 2) { 
				break;
			} else if( result == 0 ){
				max = input;
			} else {
				min = input;
			}
		}
	}
}
