package ex_operator;

public class Ex3_Operator {

	public static void main(String[] args) {

		/*
		 * ���� ������
		 * �� �����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ���
		 * 
		 */
		int age = 20;
		int limit = 25;
		
		//&&(and ����)�� ������ ��� ���϶��� ����� ��
		boolean result = limit - age >= 5 && age > 20;
		
		System.out.println("&&������ : " + result); // false
		
		

		int n1 = 10;
		int n2 = 20;
		//||(or ����)�� �� �߿� �ϳ��� ���̸� ����� ��. ������ ��� �����϶��� ����� ���� 
		result = (n1 += 10) > 20 || n2 - 10 == 10;
		System.out.println("||������  : " + result);
		
		//!(not����)�� true�� false��  false��  true�� ����
		System.out.println("||������  : " + !result);

	}
		
}