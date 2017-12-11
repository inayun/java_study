package ex_byte_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex_FileInput {
	
	public static void main(String[] args) throws IOException {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("읽어올 경로 : ");
		String path = scanner.next();*/
		
		byte[] console = new byte[100];
		System.out.print("읽어올 경로 : ");
		System.in.read(console);
		String path = new String(console).trim();
		
		File f = new File(path);
		FileInputStream fis = null;
		
		byte[] byteRead = new byte[(int)f.length()];
		
		try {
			fis = new FileInputStream(f);
			fis.read(byteRead);
			String result = new String(byteRead);
			System.out.println(result);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(fis!=null) {
				fis.close();
			}
		}
		
	}
}
