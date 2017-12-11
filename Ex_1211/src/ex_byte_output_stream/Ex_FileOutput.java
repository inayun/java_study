package ex_byte_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_FileOutput {

	public static void main(String[] args) throws IOException {

		String path = "c:/java_study/OutExam/";
		File f = new File(path);
		
		FileOutputStream fos = null;
		
		if(!f.exists()) {
			f.mkdirs();
		}
		
		path += "output.txt";
		f = new File(path);
		
		try {
			//fos = new FileOutputStream(path + "/output.txt");
			fos = new FileOutputStream(f);
			String msg  = "기록할 내용";
			
			//msg를 byte 배열로 변환하여 txt파일로 생성
			fos.write(msg.getBytes());
			
		} catch (Exception e) {
			
		} finally {
			if(fos != null){
				fos.close();
			}
		}
	}

}
