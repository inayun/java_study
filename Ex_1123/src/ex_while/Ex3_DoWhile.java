package ex_while;

public class Ex3_DoWhile {

	public static void main(String[] args) {
		/*
		 * do-while문 
		 * 선 처리 후 비교 (while과의 차이)
		 * 제어문 중 유일하게 세미콜론(;)을 사용
		 * 
		 * 
		 *   do {
		 *   	조건식이 참일때 실행되는 영역
		 *   } while (조건식);
		 * 
		 */
		
		int i = 11;
		
		do {
			System.out.println(i);
		} while (i<=10 );  // 11
		//참인지 거짓인지 비교하기전에 일단 먼저 처리함 . 참이든 거짓이든 무조건 한번은 처리함!!
		
		
	}

}
