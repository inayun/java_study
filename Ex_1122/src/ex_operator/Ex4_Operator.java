package ex_operator;

public class Ex4_Operator {

	public static void main(String[] args) {

		/*
		 * 비트 연산자
		 * 
		 * 논리 연산자와 유사하지만 2진수 단위의 연산만 가능
		 */

		int a = 10; //1010
		int b = 7;  //0111
		//2 진수로 변경하여 비교했을때 양쪽 다 1인경우에만 1
		int c1 = a & b; //0010 = 2

		System.out.println("논리곱(and) : " + c1);

		int a2 = 12; //1100
		int b2 = 8;  //1000
		//2진수로 변경하여 비교했을때 양쪽 다 0인경우에만 0
		int c2 = a2 | b2; //1100 = 12
		System.out.println("논리합(or) :" + c2);

		//비교했을때 값이 같으면 0, 다르면 1
		int c3 = a ^ b; //1101 = 13
		System.out.println("배타적or(xor) : " + c3);


		/*
		 * 시프트 연산자
		 * 2진수 단위의 연산을 수행하지만, 오른쪽 또는 왼쪽으로 이동시켜 값에 대한 변화를 줌
		 */

		char ch = 'F'; //70 = 1000110 
		int i = ch >> 1; // 1000110 (오른쪽으로 한칸 이동 -->) 0100011 (35)
		System.out.println(0+ch);
		System.out.println(i); //35 #
		
	}

}
