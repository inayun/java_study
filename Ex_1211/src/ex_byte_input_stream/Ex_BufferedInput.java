package ex_byte_input_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex_BufferedInput {

	public static void main(String[] args) throws IOException {

		String path = "c:/java_study/test.txt";
		File f = new File(path);
		
		byte[] byteRead = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		//´õ ºü¸§..
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			bis.read(byteRead);
			
			System.out.println(new String(byteRead));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(fis!= null)
				fis.close();
			
			if(bis!=null)
				bis.close();
		}
	}
}
