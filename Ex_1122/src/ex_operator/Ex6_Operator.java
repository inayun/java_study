package ex_operator;

public class Ex6_Operator {

	public static void main(String[] args) {

		/* ���� ������(���� ������)
		 * �ϳ��� ������ �����ϰ� �� ������ ���϶��� �����϶��� 
		 * ���� �Ͽ� �ٸ� ����� ���� �� �ְ� ���ִ� ������
		 */
		
		int a = 10;
		int b = 15;
		// ?�� �������� �պ񱳰� ���̸� (�տ���)true, �����̸� (�ڿ���)false�� ����
		boolean result = ++a < b ? true : false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println(result2);
		
		String result3 = (n1 += n1) == n2 ? "����" : "Ʋ��";
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