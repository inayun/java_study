package ex_multi_array;

public class Ex3_MultiArray {

	public static void main(String[] args) {

		String[][] test = { {"¿µÈñ","j:100","a:95"}, 
							{"Ã¶¼ö","j:35"},
							{"¸Í±¸","j:68", "a:59"}};
		
		
		for ( int i = 0; i < test.length; i++ ) {
			
			for( int j = 0; j < test[i].length; j++ ) {
				System.out.printf("%s ", test[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}
