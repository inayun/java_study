package ex_array;

public class Ex3_Array {

	public static void main(String[] args) {

		/*
		 * 문제
		 * 배열 arr에 담겨진 모든 값의 합을 출력하세요.
		 */
		int arr[] = { 10, 20, 30, 40, 50 };
		int result = 0;
		
		for(int number : arr) {
			result += number;
		}
		System.out.println(result);
	}

}
