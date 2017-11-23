package ex_control_statement;

public class Ex_Switch2 {

	public static void main(String[] args) {

		String str = "미";
		String result = "";
		
		
		//비교값의 타입과 case의 조건값의 타입은 무조건 일치해야함!
		switch(str) {
		case "수" :
			result = "90 ~ 100";
			break;
			
		case "우" :
			result = "80 ~ 89";
			break;
			
		case "미" :
			result = "70 ~ 79";
			break;
			
		case "양" :
			result = "60 ~ 69";
			break;
			
		case "가" :
			result = "59점 이하";
			break;
			
		default :
			System.out.println("성적이 올바르게 입력되지 않았습니다.");
			break;
		}
		System.out.println( result );
	}

}
