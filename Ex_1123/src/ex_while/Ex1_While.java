package ex_while;

public class Ex1_While {

	public static void main(String[] args) {

		
		/*
		 * while�� 
		 * ������ ������ ���� �ݺ���
		 * �� �� �� ó��
		 *  
		 * while(���ǽ�){
		 * ���ǽ��� ���϶� ����Ǵ� ����
		 * }
		 * 
		 */
		
		int num = 1;
		
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		
		/*while(true) {
			System.out.println("true �� ���ѹݺ�~");
		}*/
		
		
		boolean b = true;
		int num2 = 0;
		
		while( b ) {
			System.out.println(num2);
			num2++;
			
			if ( num2 == 20 ) {
				b = false;
			}
		}
		
	}

}
