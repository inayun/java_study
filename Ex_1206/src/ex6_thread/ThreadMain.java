package ex6_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {

		/*
		 * 키보드에서 정수를 입력받음
		 * 입력받은 정수를 sub로 넘겨주고
		 * run()메서드에서 입력받은 숫자가 1초 간격으로 1씩 감소하다가
		 * 0이 되었을때 '종료' 메시지를 출력
		 */
		
		System.out.println("정수 : ");
		int input = new Scanner(System.in).nextInt();
		
		ThreadSub ts = new ThreadSub();
		ts.setTime(input);
		ts.start();
	}

}
