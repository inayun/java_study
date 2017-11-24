package ex_single_for;

import java.util.Scanner;

public class Ex1_SingleFor {

	public static void main(String[] args) {

		/*
		 * for문 : 특정 명령을 원하는 만큼 반복적으로 처리하고자 할 때 사용
		 * 
		 * 
		 * for ( 초기식; 조건식; 증감식 ){
		 * 	조건식이 참일 때 실행되는 영역
		 *  }
		 * 
		 */
		
		
		/*for( int i = 0; i < 3; i++ ) {
			System.out.println( i );
		}*/
		
		/*for( int i = 0; i < 3; ) {
		 i++;
		System.out.println( i );
		}*/
		
		/*
		for ( int i = 10; i > 0; i--) {
			System.out.println(i);
		}*/
		
		//문제 
		//if문 한개를 사용해서 3의 배수만 출력하기
		
		System.out.println("-------문제1-----------");

		for ( int i = 15 ; i > 0; i--) {
			
			if( i % 3 == 0) {
				System.out.println(i + "는 3의 배수입니다.");
			}
		}
		
		System.out.println("--------문제2----------");
		
		int dan = 7;
		
		for ( int i = 1; i < 10; i++) {
		System.out.println(dan + " * " + i + " = " + (dan * i));
		System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}

		
		System.out.println("--------문제3----------");

		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력해주세요.  : ");
		int input = scanner.nextInt();
		
	
		if((input > 1) && (input < 10)) {
			for ( int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", input, i, input*i);
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력할 수 있습니다.");
		}
		
		
	}

}
