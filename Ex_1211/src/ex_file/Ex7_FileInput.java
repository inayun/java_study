package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex7_FileInput {

	public static void main(String[] args) throws IOException {

		String path = FilePath.PATH + "file.txt";
		File f = new File(path);
		String str = "";
		String str2 = "";
		FileInputStream fis = null;

		if(f.exists()) {

			try {
				fis = new FileInputStream(f);

				int code = 0;
				while((code = fis.read()) != -1) {
					str += (char)code;
				}

				System.out.println(str);
				for(int i = str.length()-1; i >= 0; i--) {
					str2 += str.charAt(i);
				}

				if(str.equals(str2)) {
					System.out.println("회문수임");
				} else {
					System.out.println("회문수 아님");
				}

			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				if(fis != null) { 
					fis.close();
				}
			}

		}

	}

}
