package ex_control_statement;

public class Ex_Switch2 {

	public static void main(String[] args) {

		String str = "��";
		String result = "";
		
		
		//�񱳰��� Ÿ�԰� case�� ���ǰ��� Ÿ���� ������ ��ġ�ؾ���!
		switch(str) {
		case "��" :
			result = "90 ~ 100";
			break;
			
		case "��" :
			result = "80 ~ 89";
			break;
			
		case "��" :
			result = "70 ~ 79";
			break;
			
		case "��" :
			result = "60 ~ 69";
			break;
			
		case "��" :
			result = "59�� ����";
			break;
			
		default :
			System.out.println("������ �ùٸ��� �Էµ��� �ʾҽ��ϴ�.");
			break;
		}
		System.out.println( result );
	}

}
