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
			String msg  = "����� ����";
			
			//msg�� byte �迭�� ��ȯ�Ͽ� txt���Ϸ� ����
			fos.write(msg.getBytes());
			
		} catch (Exception e) {
			
		} finally {
			if(fos != null){
				fos.close();
			}
		}
	}

}
