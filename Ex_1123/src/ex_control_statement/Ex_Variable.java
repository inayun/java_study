package ex_control_statement;

public class Ex_Variable {

	//전역 변수
	
	public static void main(String[] args) {
		
		//if문보다 전역변수
		int num1 = 100; 
		boolean start = true;
		
		if ( start == true ) {
			num1 += 100;
			
			//지역 변수
			int test = 10;
		}
		
		if( start ) { //start가 참 인경우
			 
		}
		
		if( !start ) { //start가 거짓인 경우
			
		}
		
		System.out.println(num1);
		//System.out.println(test); if문 안에 사용한  지역변수는 바깥에서 사용될 수 없음
	}

}
