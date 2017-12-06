package ex_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex_Anonymous {
	public static void main(String[] args) {
		
		/*
		 * 익명클래스
		 * 한번만 사용하고 버릴 객체를 활용하기 위한 개념
		 * 
		 */
		
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();*/
		
		int num = new Scanner(System.in).nextInt();
		System.out.println(num);
		
		//여러번 사용할 거라면 객체를 만들어서 한 객체를 계속 호출함
		Random r = new Random();
		int random = r.nextInt();
		int random2 = r.nextInt();
	}
}
