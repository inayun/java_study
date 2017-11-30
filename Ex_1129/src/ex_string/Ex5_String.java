package ex_string;

import java.util.Scanner;

public class Ex5_String {

	public static void main(String[] args) {

		/*
		 * 이메일을 입력받고
		 * @앞의 문장의 길이가 6보다 작거나 10보다 클 경우 
		 * 오류메시지 출력하기
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일을 입력하세요 . : ");
		String email = scanner.next();
		int count = 0;
		String id = "";
		
		for( int i = 0; i < email.indexOf('@'); i++ ) {
			id += email.charAt(i);
			count++;
		}
		//----방법 2----
		// String sub = email.substring( 0, email.indexOf('@'));
		
		if(count < 6 || count > 10) {
			System.out.println("이메일 형식이 올바르지 않습니다. ");
		} else {
			System.out.printf("%s 님 로그인 성공!", id);
		}
		
		
	}

}
