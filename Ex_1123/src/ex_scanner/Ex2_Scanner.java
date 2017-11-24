package ex_scanner;

import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {

	 /* 문제
	   	키보드에서 정수 두 개와 연산 기호를 입력받는다.
		입력받은 세개의 정보를 가지고 아래와 같은 결과를 도출
		
		첫번째 : 10
		두번째 : 20
		연산자 : +
		결과 : 10 + 20 = 30
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 두개 입력하세요. ");
		int num1 = scanner.nextInt();
		int num2= scanner.nextInt();

		System.out.println("연산 기호를 입력하세요. + - * / 중 택1 ");
		String operator = scanner.next();
		
		switch (operator) {
		
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
			
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;	
			
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;	
			
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
			
		default : 
			System.out.println("잘못된 연산자 입니다.");
			break;
			
		}
		
		
	}

}
