package ex_multi_for;

public class Ex1_MultiFor {

	public static void main(String[] args) {

		/*
		 * ���� for�� 
		 * for�� �ȿ� for���� ���ǵǾ� �ִ� ���
		 */
		
		for( int i = 1; i <= 3; i++) {   //y��
				System.out.println(i + "�ٱ���");
				
			for( int j = 1; j <= 3; j++) {  //x��
				System.out.println(j + "����");
				
			} //inner
			
			System.out.println();
		} // outer
		
		
		
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		System.out.println( "--------------------");
		for( int i = 1; i <= 3; i++) {  
			
			for( int j = 1; j <= 4; j++) {  
				System.out.print(j + " ");
			}
	
		System.out.println();
		} 
		
		
		
	}

}
