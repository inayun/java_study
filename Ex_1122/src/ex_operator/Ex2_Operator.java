package ex_operator;

public class Ex2_Operator {

	public static void main(String[] args) {

		/*
		 * 비교 연산자
		 * 변수의 값을 비교해서 참과 거짓을 판단
		 * 결과 값이 반드시 true, false 로만 반환
		 */
		
		int n1 = 10;
		int n2 = 20;
		//n1 < n2;
		System.out.println(n1<n2); //true
		
		//결과값이 true/false 이기 때문에 변수의 자료형을 boolean으로 설정
		boolean result = n1 < n2; 
		System.out.println(result); //true
		
		result = n1 >= n2;
		System.out.println(result); //false
		
		result = n1 == n2;
		System.out.println(result); //false
		
		result = n1 != n2;
		System.out.println(result); //true (같지 않으니까 참)
		
	}

}
