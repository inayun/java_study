package ex2_try_catch;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = 0;
		
		try {
			num = scanner.nextInt();
			System.out.println("입력받은 수 : " + num);
		} catch(Exception e ) {
			System.out.println("정수만 입력할 수 있습니다.");
		} 
	}
}
