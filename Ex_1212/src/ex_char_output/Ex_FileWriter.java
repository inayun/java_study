package ex_char_output;

import java.io.FileWriter;
import java.io.IOException;

public class Ex_FileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = null;

		try {
			fw = new FileWriter("c:/java_study/fileWriterEx.txt");
			
			String str = "fileWriter øπ¡¶\r\n";
			//getByte(str) æ»Ω·¡‡µµ µ !!!!
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(fw != null) {
				fw.close();
			}
		}
	}

}
