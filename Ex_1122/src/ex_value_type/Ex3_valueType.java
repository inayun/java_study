package ex_value_type;

public class Ex3_valueType {

	public static void main(String[] args) {

		// ������
		
		byte b = 127;
		short s = 32767;
		int n = 2100000000; //int�� ����Ʈ!
		long l = 2200000000L; //int�� ����Ʈ�̱� ������ ���� ������  L�� �ٿ���
		
		System.out.println(l);
		
		// �Ǽ���
		float f1, f2;
		f1 = 3.14F; //double�� ����Ʈ�̱� ������ �÷��� ������ F�� �ٿ���
		f2 = 3;
		
		double f3;
		f3 = 3.14; //double�� ����Ʈ!
		
		System.out.println("f2:" + f2);
	}

}
