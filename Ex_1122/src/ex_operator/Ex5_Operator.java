package ex_operator;

public class Ex5_Operator {

	public static void main(String[] args) {
		
		/*
		 * 증감연산자
		 * 1씩 증가시키거나 1씩 감소시키는 연산자
		 * 선행증감과 후행증감의 차이점을 기억할 것 
		 */
		
		int a = 10;
		//연산자가 변수보다 앞에있으면(선행) 증가 혹은 감소!! 당장 적용!
		System.out.println("a : " + ++a); //11
		
		int b = 10;
		//후행연산자는 일단 출력먼저 하고나서 연산을 수행. 출력하고나면 값 바껴있음. 나중에 적용!
		System.out.println("b : " + b++); //10
		System.out.println(b);
		
	}

}
