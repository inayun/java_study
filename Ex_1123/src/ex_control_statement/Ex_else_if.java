package ex_control_statement;

public class Ex_else_if {

	public static void main(String[] args) {

		/*
		 * 
		 * else if (����if��) : �������� ���� ��
		 * if(���ǽ�1) {
		 * } else if(���ǽ�2) {
		 * 
		 * } else {
		 * 
		 * } 
		*/
	
		
		
		int num = 75;
		String str = "";
		
		if ( num >= 90 ) {
			str = "��";
		} else if( num >= 80 ) {
			str = "��";
		} else if( num >= 70 ) {
			str = "��";
		} else if( num >= 60 ) {
			str = "��";
		} else {
			str = "��";
		}
		 
		 System.out.println(str);
	}

}
