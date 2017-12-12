package ex_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		int upper = 0;
		int lower = 0;

		try {
			fr = new FileReader("c:/java_study/readChar.txt");
			int code = -1;

			while( (code = fr.read()) != -1) {
				if(Character.isUpperCase((char)code)) {
					upper ++;
				} else {
					lower++;
				}
			}
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			if( fr != null){
				fr.close();
			}
		}
	}

}
