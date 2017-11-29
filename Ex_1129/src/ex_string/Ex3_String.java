package ex_string;

import java.util.Scanner;

public class Ex3_String {

	public static void main(String[] args) {

		/*
		 * 입력  : falfakdflasf
		 * 소문자 a의 갯수 : 3
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = scanner.next();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='a') {
				count++;
			}
		} System.out.printf("a는 %d개 입니다.",count);
	}

}
