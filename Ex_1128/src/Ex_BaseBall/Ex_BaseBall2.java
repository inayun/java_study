package Ex_BaseBall;

import java.util.Random;
import java.util.Scanner;

public class Ex_BaseBall2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int com[] = new int[3];
		int user[] = new int[3];
		int count = 0;
		
		do {
			// 1 ~ 9 사이의 난수 발생
			for(int i = 0; i < com.length; i++) {
				com[i] = new Random().nextInt(9)+1;
			}
			
		} while (com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		
			System.out.println("" + com[0] + com[1] + com[2]);
		
		while(true) {
			
			count++;
			for(int i = 0; i < 3; i++) {
				System.out.println((i+1) + "번째 : ");
				user[i]= scanner.nextInt();
			}
			
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < user.length; i++) {
				
				for(int j = 0; j < user.length; j++) {
					
					if( i == j ) {
						if ( com[i] == user[j] ) {
							strike++;
						} else {
							if ( com[i] == user[j] ) {
								ball++;
							}
						}
					}
				} //inner
			} //outer
			
			if( strike == 3 ) {
				System.out.println("정답!" + user[0] + user[1] + user[2]);
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
