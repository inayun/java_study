package ex_control_statement;

public class Ex_work {

	public static void main(String[] args) {

		
		int month = 7;
		
		
/*		31 = 1 , 3 , 5 , 7 , 8, 10 ,12
		30 = 4, 6, 9, 11
				28 = 2*/
				
		switch(month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
			
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		
		default :
			System.out.println("�ٽ� �Է��ϼ���.");
			break;
		}
		
	}

}
