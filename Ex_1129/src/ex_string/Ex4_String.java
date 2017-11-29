package ex_string;

import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {

		/*
		 * 회문수 판단하기
		 * 입력 : 121
		 * 121은 회문수입니다.
		 * 
		 * 입력 : 기러기
		 * 기러기는 회문수 입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = scanner.next();
		String opposite = "";
		
		for( int i = input.length(); i > 0; i-- ) {
			opposite += input.charAt(i-1);
		}
		if(input.equals(opposite)) {
			System.out.printf("%s는(은) 회문수입니다.",input);
		} else {
			System.out.printf("%s는(은) 회문수가 아닙니다.",input);
		}
	}

}
