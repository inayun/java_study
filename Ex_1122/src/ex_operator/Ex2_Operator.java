package ex_operator;

public class Ex2_Operator {

	public static void main(String[] args) {

		/*
		 * �� ������
		 * ������ ���� ���ؼ� ���� ������ �Ǵ�
		 * ��� ���� �ݵ�� true, false �θ� ��ȯ
		 */
		
		int n1 = 10;
		int n2 = 20;
		//n1 < n2;
		System.out.println(n1<n2); //true
		
		//������� true/false �̱� ������ ������ �ڷ����� boolean���� ����
		boolean result = n1 < n2; 
		System.out.println(result); //true
		
		result = n1 >= n2;
		System.out.println(result); //false
		
		result = n1 == n2;
		System.out.println(result); //false
		
		result = n1 != n2;
		System.out.println(result); //true (���� �����ϱ� ��)
		
	}

}