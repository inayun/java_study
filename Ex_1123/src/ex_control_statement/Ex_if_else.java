package ex_control_statement;

public class Ex_if_else {

	public static void main(String[] args) {

		/*
		 * if(���ǽ�) {
		 * ���ǽ��� ���϶� ����Ǵ� ����
		 *  } else {
		 *  ���ǽ��� �����϶� ����Ǵ� ����
		 *  }
		 */
		
		int n = 49;
		String str = ""; //�ʱ�ȭ
		
		if( ++n >= 50 ) {
			str = "n�� 50 �̻��� ��";
		} else {
			str = "n�� 50 �̸��� ��";
		}
		
		System.out.println(str);
		System.out.println("------------");
		
		/*
		 * ���� age�� ���̸� �����ϰ�,
		 * 30�� �̻��̸�
		 * "��Ǹ�ŭ ��̱���" �׷��� ������ " ���� �� ��ŵ� �ſ�"
		 * �� ����ϴ� if���� �����ϰ�
		 * ���������� "�����մϴ�" ��� ������ ���
		 */
		
		int age = 35;
		
		if(age >= 30) {
			str = "��Ǹ�ŭ ��̱���.";
		} else {
			str = "���� �� ��ŵ� �ſ�.";
		}
		System.out.println(str);
		System.out.println("�����մϴ�.");
		
		
		System.out.println("----���׿����ڷ� ���----");
		String result = age >= 30 ? "��Ǹ�ŭ ��̱���." : "���� �� ��ŵ� �ſ�.";
		System.out.println(result);

	
	}
	
}