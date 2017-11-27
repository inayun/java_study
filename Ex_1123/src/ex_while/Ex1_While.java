package ex_while;

public class Ex1_While {

	public static void main(String[] args) {

		
		/*
		 * while문 
		 * 간편한 구성을 가진 반복문
		 * 선 비교 후 처리
		 *  
		 * while(조건식){
		 * 조건식이 참일때 실행되는 영역
		 * }
		 * 
		 */
		
		int num = 1;
		
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		
		/*while(true) {
			System.out.println("true 면 무한반복~");
		}*/
		
		
		boolean b = true;
		int num2 = 0;
		
		while( b ) {
			System.out.println(num2);
			num2++;
			
			if ( num2 == 20 ) {
				b = false;
			}
		}
		
	}

}
