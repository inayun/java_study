package ex_output;

public class Ex_output {

	public static void main(String[] args) {

		int age = 21;
		System.out.println("���� ���̴�" + age + "�� �Դϴ�");
		
		System.out.printf("�� ���̴�  %d�Դϴ�. ������ %d �Դϴ�.", age, age);
		
		System.out.println();
		// ������ ������  d (long, short, byte...)
		System.out.printf("���%d, ��%d, ����%d : ���ý�", 1,2,3);
		
		System.out.println();
		// �Ǽ��� ������ f (double...)
		System.out.printf("�������� %f", 3.14);
		
		System.out.println();
		// ���ڴ� c
		System.out.printf("����  %c", 'A');

		// ���ڿ��� s
	}

}
