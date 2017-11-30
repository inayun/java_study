package ex_string;

import java.util.Scanner;

public class Ex6_String {

	public static void main(String[] args) {

		/*
		 * 배우 검색 : 송강호
		 * [송강호]
		 * 박쥐
		 * 괴물
		 * 관상
		 */
		String[][] actor = {{"[송강호]","박쥐","괴물","관상"},
							{"[김수현]","도둑들","리얼","은위"},
							{"[전지현]","BHC","엽그","엽그2"}};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("배우 검색 : ");
		String input = scanner.next();
		int flag = 0;
				
		for(int i = 0; i < actor.length; i++) {
			String name = actor[i][0].substring((actor[i][0].indexOf('['))+1,actor[i][0].indexOf(']'));
			
			if(name.equals(input)) {
				flag = 1;
				for(int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			} 
		}
		if(flag == 0) {
			System.out.println("해당 배우가 존재하지 않습니다. ");
		}
		
	}

}
