package ex_operator;

public class Ex5_Operator {

	public static void main(String[] args) {
		
		/*
		 * ����������
		 * 1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		 * ���������� ���������� �������� ����� �� 
		 */
		
		int a = 10;
		//�����ڰ� �������� �տ�������(����) ���� Ȥ�� ����!! ���� ����!
		System.out.println("a : " + ++a); //11
		
		int b = 10;
		//���࿬���ڴ� �ϴ� ��¸��� �ϰ����� ������ ����. ����ϰ����� �� �ٲ�����. ���߿� ����!
		System.out.println("b : " + b++); //10
		System.out.println(b);
		
	}

}