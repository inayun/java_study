package ex_random;

import java.util.Random;

public class Ex1_Random {

	public static void main(String[] args) {

		/*
		 * 난수 만들기
		 * a ~ b 사이의 난수
		 * int num = new Random().nextInt(범위) + 시작수;
		 * 범위 : 큰수 - 작은 수 + 1 
		 * 
		 */
		
		
		
		//1 ~ 5 사이의 난수
		int num = new Random().nextInt(5) + 1;
		//5 ~ 10 사이의 난수
		//int num = new Random().nextInt(6) + 5;

		//System.out.println(num);
		
		
		/*
		 * 문제
		 * 2~9 사이의 난수를 발생시켜
		 * 발생된 난수에 해당되는 구구단 출력
		 */
		
		System.out.println("------난수 발생해서 구구단 출력---------");
		int dan = new Random().nextInt(8) + 2 ;
		
		for ( int i = 1 ; i < 10 ; i ++) {
			System.out.printf("%d * %d = %d\n" , dan, i , dan * i);
		}
		
		/*
		 * 문제
		 * 난수를 발생시켜 A ~ Z 중 한글자를 화면에 출력
		 */
		
		System.out.println("--------난수 발생해서 알파벳 출력 ---------");
		
		//방법1
		int random1 = new Random().nextInt(90 - 65 + 1) + 65;
		System.out.println((char)random1);
		
		//방법2
		int random2 = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println((char)random2);

		
		
	}

}
