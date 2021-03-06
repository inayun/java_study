package ex_control_statement;

public class Ex_if_else {

	public static void main(String[] args) {

		/*
		 * if(조건식) {
		 * 조건식이 참일때 실행되는 영역
		 *  } else {
		 *  조건식이 거짓일때 실행되는 영역
		 *  }
		 */
		
		int n = 49;
		String str = ""; //초기화
		
		if( ++n >= 50 ) {
			str = "n은 50 이상의 수";
		} else {
			str = "n은 50 미만의 수";
		}
		
		System.out.println(str);
		System.out.println("------------");
		
		/*
		 * 변수 age에 나이를 대입하고,
		 * 30세 이상이면
		 * "드실만큼 드셨군요" 그렇지 않으면 " 조금 더 드셔도 돼요"
		 * 를 출력하는 if문을 구현하고
		 * 마지막으로 "감사합니다" 라는 문장을 출력
		 */
		
		int age = 35;
		
		if(age >= 30) {
			str = "드실만큼 드셨군요.";
		} else {
			str = "조금 더 드셔도 돼요.";
		}
		System.out.println(str);
		System.out.println("감사합니다.");
		
		System.out.println("");
		System.out.println("----삼항연산자로 계산----");
		String result = age >= 30 ? "드실만큼 드셨군요." : "조금 더 드셔도 돼요.";
		System.out.println(result);

	
	}
	
}
