package ex_control_statement;

public class Ex_Switch3 {

	public static void main(String[] args) {

		char ch = 'B';
		
		//switch에서는 정수, 문자열, 문자만 비교가능!
		switch( ch ) {
		case 'A' :
			System.out.println("A를 선택함");
			break;
			
		case 'B' :
			System.out.println("B를 선택함");
			
		case 'C' :
			System.out.println("c를 선택함");
			break;
			
		default :
			System.out.println("잘못 누름!");
			
		}
		
	}

}
