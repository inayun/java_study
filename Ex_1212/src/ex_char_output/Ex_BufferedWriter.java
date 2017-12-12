package ex_char_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_BufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/java_study/bufWriter.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("ù��° ����");
			bw.newLine();
			bw.write("ù��° ����");
			bw.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(bw!=null)
				bw.close();
			
			if(fw!=null)
				fw.close();
		}
	}

}
