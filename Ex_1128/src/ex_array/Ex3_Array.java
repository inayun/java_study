package ex_array;

public class Ex3_Array {

	public static void main(String[] args) {

		/*
		 * ����
		 * �迭 arr�� ����� ��� ���� ���� ����ϼ���.
		 */
		int arr[] = { 10, 20, 30, 40, 50 };
		int result = 0;
		
		for(int number : arr) {
			result += number;
		}
		System.out.println(result);
	}

}
