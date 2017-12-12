package ex_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex_FileReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;

		try {
			fr = new FileReader("c:/java_study/test.txt");
			int code = -1;

			//한글 안깨지고 나오기 때문에 바이트 배열 만들어서 넣을 필요 없음
			while( (code = fr.read()) != -1) {
				System.out.print((char)code);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			if( fr != null){
				fr.close();
			}
		}
	}
}
