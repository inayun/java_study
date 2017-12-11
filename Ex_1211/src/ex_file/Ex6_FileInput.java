package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Ex6_FileInput {

	public static void main(String[] args) {

		String path = FilePath.PATH + "test.txt";
		
		File f = new File(path);
		byte[] byteRead = new byte[(int)f.length()];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(byteRead);
				
				String result = new String(byteRead);
				System.out.println(result);
				
				
				if(fis != null) {
					fis.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
