package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex5_FileInput {

	public static void main(String[] args) {

		String path = FilePath.PATH + "test.txt";
		
		File f = new File(path);
		if(f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				//스트림은 더 이상 읽을 것이 없다면 -1을 반환함
				//while문은 파일의 끝(EOF)인 -1을 만날때까지 반복된것
				//read는 1바이트씩 읽는데 한글은 2바이트이기 때문에 깨져서 나옴
				while((code = fis.read()) != -1) {
					
					System.out.print((char)code);
				} //while
				
				if(fis != null) { //스트림을 사용한적이 있으면! 널이 아니면!
				//스트림을 사용하고 난 후에는 닫아주는 것이 좋음
					fis.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
