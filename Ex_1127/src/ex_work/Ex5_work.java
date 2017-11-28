package ex_work;

import java.util.Scanner;

public class Ex5_work {

	public static void main(String[] args) {

		/* 
		 * 문제
		 * 키보드에서 정수를 입력받고, 
		 * 입력받은 값이 소수인지 아닌지를 판단하는 코드
		 * 1은 소수가 아님
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력해주세요. :");
		int input = scanner.nextInt();
		int i = 0;
		
		for ( i = 2; i <= input; i++) {
			
			if (input % i == 0) {
				break;
			}
		} //for
		
		if ( i == input) { 
			//나뉘어떨어지는거없이 반복문이 끝까지 돌았을때
			System.out.println("소수입니다.");
		} else {
			//break 걸려서 나왔을때
			System.out.println("소수가 아닙니다.");
		}
	}
}
