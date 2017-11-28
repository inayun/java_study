package ex_array;

public class Ex2_Array {

	public static void main(String[] args) {

	/*	
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		*/
		
		char[] ch = {'J','A','V','A'};
		
		//정통 반복문
		for( int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("--------------------");
		
		//jdk 1.5때 추가된 반복문
		for( char ch2 : ch ) {
			System.out.println ( ch2 );
		}
		
		System.out.println("--------------------");

		String[] str = new String[5];
		str[0] = "100";
	}

}
