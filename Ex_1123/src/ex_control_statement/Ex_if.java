package ex_control_statement;

public class Ex_if {

	public static void main(String[] args) {

		/*
		 * 제어문
		 * 프로그램의 흐름을 제어하는 문장
		 * 분기문과 반복문으로 나뉨
		 * 
		 * 
		 * 분기문 : if, switch
		 * 반복문: for, while, do-while
		 */

		/*
		 * 단순 if문
		 * if(조건식){
		 *  조건식이 참일때 수행되는 영역
		 * }
		 * 
		 */

		int n = 16;
		String str = "안녕하세요";
		
		if (n == 50) {
			str = "n은 50입니다.";
		}

		if (n != 50) {
			str = "n은 50이 아닙니다.";
		}
		
		System.out.println( str );
	}


}
