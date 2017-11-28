package Ex_BaseBall;

import java.util.Random;
import java.util.Scanner;

public class Ex_BaseBall {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int com100 = 0;
		int com10 = 0;
		int com1 = 0;
		
		int user100 = 0;
		int user10 = 0;
		int user1 = 0;
		
		int count = 0;
		do {
			// 1 ~ 9 사이의 난수 발생
			com100 = new Random().nextInt(9)+1;
			com10 = new Random().nextInt(9)+1;
			com1 = new Random().nextInt(9)+1;

		} while (com1 == com10 || com1 == com100 || com10 == com100);
		
		System.out.println("" + com100 + com10 + com1);
		while(true) {
			count++;
			System.out.print("첫번째 : ");
			user100 = scanner.nextInt();
			
			System.out.print("두번째 : ");
			user10 = scanner.nextInt();
			
			System.out.print("세번째 : ");
			user1 = scanner.nextInt();
			
			int strike = 0;
			int ball = 0;
			
			
			
			if(user100 == com100) {
				strike++;
			} else if ( user100 == com10 || user100 == com1) {
				ball++;
			}
			
			if(user10 == com10) {
				strike++;
			} else if ( user10 == com100| user10 == com1) {
				ball++;
			}
			

			if(user1 == com1) {
				strike++;
			} else if ( user1 == com100| user1 == com10) {
				ball++;
			}
			
			if( strike == 3 ) {
				System.out.println("정답!" + user100 + user10 + user1);
				System.out.println( count + "번만에 정답을 맞추셨습니다.");
				break; 
			} else {
				
				if( strike == 0 && ball == 0 ) {
					System.out.println("OUT ! ");
				} else {
					System.out.println(strike + " strike," + ball + " ball");
				}
			}
			
		}
		
	}

}
