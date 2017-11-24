package ex_multi_for;

public class Ex1_MultiFor {

	public static void main(String[] args) {

		/*
		 * 다중 for문 
		 * for문 안에 for문이 정의되어 있는 경우
		 */
		
		for( int i = 1; i <= 3; i++) {   //y축
				System.out.println(i + "바깥쪽");
				
			for( int j = 1; j <= 3; j++) {  //x축
				System.out.println(j + "안쪽");
				
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
