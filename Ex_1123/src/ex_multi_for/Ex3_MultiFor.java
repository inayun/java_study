package ex_multi_for;

public class Ex3_MultiFor {

	public static void main(String[] args) {

		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		
		/*char star = '*';
		for (int i = 0; i < 5; i++) {
			System.out.println("");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%c ",star);
			}
		}*/
		
		System.out.println("-----------------");
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		/*i 5锅馆汗
		 *j 5 4 3 2 1
		  k 1 3 5 7 9*/

		
		//------------规过1--------------
		for( int i = 0; i <5 ; i++){
			for( int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for( int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		
		//------------规过1--------------
		for( int i = 0; i < 5 ; i++){
			for( int j = 0; j < 5 + i; j++) {
				
				if( i + j > 3 ) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}	
			System.out.println();
		} 
		
	}

}
