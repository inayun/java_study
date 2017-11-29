package ex_multi_array;

import java.util.Scanner;

public class Ex5_MultiArray {

	public static void main(String[] args) {

		/* 
		 * 문제
		 * 등록할 인원 : 2
		 * 이름 : 홍길동
		 * 수학점수 : 90
		 * 영어점수 : 80
		 * --------
		 * 
		 * 
		 */
		
		
		int num = 0;
		String[] info = {"이름","수학","영어","국어"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("등록할 인원 : ");
		num = scanner.nextInt();
		String[][] member = new String[num][info.length];
		
	
		for( int i = 0; i < member.length; i++ ) {
			
			for( int j = 0; j < member[i].length; j++ ) {
				System.out.print(info[j] + ":");
				member[i][j] = scanner.next();
			}
			System.out.println("------------------");
		} //outer
		System.out.printf("%d명 등록 완료!\n", num);
		
			for( int i = 0; i < member.length; i++ ) {
			for( int j = 0; j < member[i].length; j++ ) {
				System.out.print(member[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}

}
