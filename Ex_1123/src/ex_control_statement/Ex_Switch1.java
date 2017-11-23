package ex_control_statement;

public class Ex_Switch1 {

	public static void main(String[] args) {

		
		/*
		 * switch-case문
		 * if문과 유사한 구조지만 특정값을 바로 찾아 들어감으로써 
		 * 처리 속도에 이득을 볼 수 있는 제어문
		 * 
		 * switch(비교값) {
		 * 
		 * case 조건값 :
		 * 	비교값과 조건값이 일치할 때 실행되는 영역
		 * 		break;
		 * }
		 * 
		 */
		
		int n = 4;
		switch(n) {
		case 1 : //조건값
			System.out.println("1. 회원가입");
			break;
			
		case 2 :
			System.out.println("2. 로그인");
			break;
			
		case 3 :
			System.out.println("3. 디아블로란?");
			break;
			
		default : //위의 조건들에 다 맞지 않을경우 else 같은 기능
			System.out.println("메뉴가 올바르지 않습니다.");
			break;
			
		}
		
	}

}
