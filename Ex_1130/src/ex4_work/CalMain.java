package ex4_work;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		/*
		 * 정수 두개와 연산기호를 입력받아
		 * Cal 클래스의 getResult() 메서드에서
		 * 계산 결과를 완성하도록 처리
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 값 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 값 입력 : ");
		int num2 = scanner.nextInt();
		System.out.print("연산자 입력 : ");
		String opp = scanner.next();
		
		Cal c = new Cal();
		int result = c.getResult(num1,num2,opp);
		System.out.println(result);
		
	}

}
