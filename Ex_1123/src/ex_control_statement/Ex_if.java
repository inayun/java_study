package ex_control_statement;

public class Ex_if {

	public static void main(String[] args) {

		/*
		 * ���
		 * ���α׷��� �帧�� �����ϴ� ����
		 * �б⹮�� �ݺ������� ����
		 * 
		 * 
		 * �б⹮ : if, switch
		 * �ݺ���: for, while, do-while
		 */

		/*
		 * �ܼ� if��
		 * if(���ǽ�){
		 *  ���ǽ��� ���϶� ����Ǵ� ����
		 * }
		 * 
		 */

		int n = 16;
		String str = "�ȳ��ϼ���";
		
		if (n == 50) {
			str = "n�� 50�Դϴ�.";
		}

		if (n != 50) {
			str = "n�� 50�� �ƴմϴ�.";
		}
		
		System.out.println( str );
	}


}
