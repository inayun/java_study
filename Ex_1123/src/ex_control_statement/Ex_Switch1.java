package ex_control_statement;

public class Ex_Switch1 {

	public static void main(String[] args) {

		
		/*
		 * switch-case��
		 * if���� ������ �������� Ư������ �ٷ� ã�� �����ν� 
		 * ó�� �ӵ��� �̵��� �� �� �ִ� ���
		 * 
		 * switch(�񱳰�) {
		 * 
		 * case ���ǰ� :
		 * 	�񱳰��� ���ǰ��� ��ġ�� �� ����Ǵ� ����
		 * 		break;
		 * }
		 * 
		 */
		
		int n = 4;
		switch(n) {
		case 1 : //���ǰ�
			System.out.println("1. ȸ������");
			break;
			
		case 2 :
			System.out.println("2. �α���");
			break;
			
		case 3 :
			System.out.println("3. ��ƺ�ζ�?");
			break;
			
		default : //���� ���ǵ鿡 �� ���� ������� else ���� ���
			System.out.println("�޴��� �ùٸ��� �ʽ��ϴ�.");
			break;
			
		}
		
	}

}
