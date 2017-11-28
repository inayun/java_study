package ex_array;

public class Ex1_Array {

	public static void main(String[] args) {

		/*
		 * 배열
		 * 같은 자료형끼리 모아두는 하나의 묶음
		 * 효율적인 자료 관리를 위해 반드시 필요
		 * 
		 */
		
		//1) 배열선언
		int[] ar ;
		
		//2) 배열생성
		ar = new int[4];
		
		// int[] ar = new int[4];
		
		//3) 배열의 각 방에 값 대입 (방번호 = 인덱스, 방수를 변경할 수 없음)
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		
		for( int i = 0; i < ar.length; i++ ) {
			ar[i] = (i+1) * 100;
			System.out.println( ar[i]);
		}
		
		System.out.println("------------");
		
		//선언과 생성과 초기화를 한번에
		int[] ar2 = {100, 200, 300, 400, 500};
		
		
		for( int i = 0; i < ar2.length; i++ ) {
			System.out.println( ar2[i]);
		}
	}

}
