package ex_while;

import java.util.Random;

public class ex4_DoWhile {

	public static void main(String[] args) {

		/* 
		 * 문제
		 * java, jsp, android의 시험을 봄
		 * 
		 * 과목별 점수를 검사하는 로직은 do-while로 작성하는데,
		 * 한 과목이라도 100점을 넘어가는 경우에
		 * 0~130점사이의 난수가 발생될때까지 재실행시킨다
		 * 
		 * 이렇게 세 과목의 점수가 모두  0 ~ 100점 사이가 되면
		 * do-while문을 빠져나와서 세 과목의 점수가 화면에 출력되도록 하는 코드
		 * 
		 */
		
		int java,jsp,android = 0;

		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			android = new Random().nextInt(131);
			
		} while(java > 100 || jsp > 100 || android > 100);
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("android : " + android);
	
	}

}
