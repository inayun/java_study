package ex_operator;

public class Ex3_Operator {

	public static void main(String[] args) {

		/*
		 * 논리 연산자
		 * 비교 연산자를 통한 연산이 2개 이상 필요할 때 사용
		 * 
		 */
		int age = 20;
		int limit = 25;
		
		//&&(and 연산)은 양쪽이 모두 참일때만 결과가 참
		boolean result = limit - age >= 5 && age > 20;
		
		System.out.println("&&연산결과 : " + result); // false
		
		

		int n1 = 10;
		int n2 = 20;
		//||(or 연산)은 둘 중에 하나만 참이면 결과가 참. 양쪽이 모두 거짓일때만 결과가 거짓 
		result = (n1 += 10) > 20 || n2 - 10 == 10;
		System.out.println("||연산결과  : " + result);
		
		//!(not연산)은 true는 false로  false는  true로 변경
		System.out.println("||연산결과  : " + !result);

	}
		
}
