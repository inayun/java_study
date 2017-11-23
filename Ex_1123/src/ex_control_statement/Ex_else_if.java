package ex_control_statement;

public class Ex_else_if {

	public static void main(String[] args) {

		/*
		 * 
		 * else if (다중if문) : 여러개의 조건 비교
		 * if(조건식1) {
		 * } else if(조건식2) {
		 * 
		 * } else {
		 * 
		 * } 
		*/
	
		
		
		int num = 75;
		String str = "";
		
		if ( num >= 90 ) {
			str = "수";
		} else if( num >= 80 ) {
			str = "우";
		} else if( num >= 70 ) {
			str = "미";
		} else if( num >= 60 ) {
			str = "양";
		} else {
			str = "가";
		}
		 
		 System.out.println(str);
	}

}
