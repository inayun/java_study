package ex_operator;

public class Ex4_Operator {

	public static void main(String[] args) {

		/*
		 * ��Ʈ ������
		 * 
		 * �� �����ڿ� ���������� 2���� ������ ���길 ����
		 */

		int a = 10; //1010
		int b = 7;  //0111
		//2 ������ �����Ͽ� �������� ���� �� 1�ΰ�쿡�� 1
		int c1 = a & b; //0010 = 2

		System.out.println("����(and) : " + c1);

		int a2 = 12; //1100
		int b2 = 8;  //1000
		//2������ �����Ͽ� �������� ���� �� 0�ΰ�쿡�� 0
		int c2 = a2 | b2; //1100 = 12
		System.out.println("����(or) :" + c2);

		//�������� ���� ������ 0, �ٸ��� 1
		int c3 = a ^ b; //1101 = 13
		System.out.println("��Ÿ��or(xor) : " + c3);


		/*
		 * ����Ʈ ������
		 * 2���� ������ ������ ����������, ������ �Ǵ� �������� �̵����� ���� ���� ��ȭ�� ��
		 */

		char ch = 'F'; //70 = 1000110 
		int i = ch >> 1; // 1000110 (���������� ��ĭ �̵� -->) 0100011 (35)
		System.out.println(0+ch);
		System.out.println(i); //35 #
		
	}

}
