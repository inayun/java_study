package ex_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex_FileReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;

		try {
			fr = new FileReader("c:/java_study/test.txt");
			int code = -1;

			//�ѱ� �ȱ����� ������ ������ ����Ʈ �迭 ���� ���� �ʿ� ����
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
