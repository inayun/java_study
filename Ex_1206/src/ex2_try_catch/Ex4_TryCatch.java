package ex2_try_catch;

import java.util.Scanner;

public class Ex4_TryCatch {

	public static void main(String[] args) {

		//정수 : 5
		//입력받은 수 : 5
		
		//정수 : aaa
		//aaa는 정수가 아닙니다
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 : ");
		String input="";
		
		try {
			input = scanner.next();
			int result = Integer.parseInt(input);
			System.out.println("입력받은 수  :"  + result);

		} catch (Exception e) {
			System.out.println(input + "은 정수가 아닙니다.");
		} 
		
	
	}

}
