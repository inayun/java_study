package ex_operator;

public class Ex6_Operator {

	public static void main(String[] args) {

		/* 삼항 연산자(조건 연산자)
		 * 하나의 조건을 정의하고 그 조건이 참일때와 거짓일때를 
		 * 구별 하여 다른 결과를 얻을 수 있게 해주는 연산자
		 */
		
		int a = 10;
		int b = 15;
		// ?를 기준으로 앞비교가 참이면 (앞에꺼)true, 거짓이면 (뒤에꺼)false가 나옴
		boolean result = ++a < b ? true : false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println(result2);
		
		String result3 = (n1 += n1) == n2 ? "맞음" : "틀림";
		System.out.println(result3);
		
		int a1= 10;
		int b1 = 12;
		char result4 = ++a1 >= b1 || 2 + 7 <= b1 && 13 - b1 >= 0 && (a1 += b1) - (a1 % b1) > 10 ? 'O' : 'X';

		/*
		 * 	a1 = 11
			a1 = 11 + 12 = 23
			23 / 12 
			f || t && t && t  ?
				 t && t && t
					  t && t 
					  	t  ? 'O'
		 */
		
		System.out.println(result4);
				
	}

}
