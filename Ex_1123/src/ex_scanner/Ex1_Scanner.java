package ex_scanner;

import java.util.Scanner;

public class Ex1_Scanner {

	public static void main(String[] args) {

//		키보드에서 값을 입력받기 위한 Scanner 클래스
		System.out.print("정수를 입력 : ");
		Scanner scanner = new Scanner( System.in );
		
		int num = scanner.nextInt();
		System.out.println("값: " + num);
		
		System.out.println("------------");
		
		System.out.println("문장을 입력해라 : ");
		String str = scanner.next();
		//첫번째 띄어쓰기만 받을 수 있음
		System.out.println("문장 : " + str);
		
		System.out.println("------------");


		
		/*
		 * Scanner.nextLine 오류 발생시
		 *  1. scanner 객체를 따로 만들어줌 (scanner 1, scanner 2...)
		 *  2. scanner.nextLine();
		 */
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("문장을 입력 : ");
		String str2 = scanner2.nextLine();
		System.out.println("문장 : " + str2);

		
	}

}
