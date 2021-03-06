package ex_operator;

public class Ex1_Operator {

	public static void main(String[] args) {
		
		/*
		 * 연산자
		 * 
		 * 1. 최고 연산자 : . , ()
		 * 2. 증감 연산자 : ++ , --
		 * 3. 산술 연산자 : +, -, *, /, %
		 * 4. 시프트 연산자 : >> , << , >>>
		 * 5. 비교 연산자 : >, < , >=, <=, ==, !=
		 * 6. 비트 연산자 : &, |, ^, ~
		 * 7. 논리 연산자 : &&, || , !
		 * 8. 조건(삼항) 연산자 : ?, :
		 * 9. 대입 연산자 : =, *=, /=, %=, +=, -=
		 */
		
		/* 산술연산자
		 *  4칙 연산과 나머지 연산자를 가지고 있음
		 */
		int n1, n2, n3;
		n1 = 20; 
		n2 = 7;
		n3 = n1 + n2;
		System.out.println(n3);
		
		n3 = n1 / n2; 
		System.out.println(n3); // 몫 2
		
		n3 = n1 % n2; //모듈러
		System.out.println(n3); //나머지 6
		
		/* 대입 연산자
		 * 특정 값을 변수에 전달하여 기억시킬때 사용
		 */
		
		int i1 = 10;
		int i2 = 7;
		i1 += i2;
		
		System.out.println(i1); //17
		i1 -= 5;
		
		System.out.println(i2); //7
		
		i1 %= 5;
		// i1 = i1 % 5;
		System.out.println(i1); //2
		
		
	}

}
