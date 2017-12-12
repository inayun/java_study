package ex_char_input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_BufferedReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:/java_study/test.txt");
			br = new BufferedReader(fr);
			
			String str = "";
			
			//BufferedReader�� �о�� ���� �� �� ������ ó��
			while( (str = br.readLine()) != null ) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			
		} finally {
		
			if( br != null )
				br.close();
			if( fr != null )
				fr.close();
		}
	}

}
