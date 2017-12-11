package ex_byte_output_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_BufferedOutput {

	public static void main(String[] args) throws IOException {

		String path = "c:/java_study/bufout.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			
			String msg = "buf스트림 예제\r\n";
			bos.write(msg.getBytes());
			
			/*
			 * write()메소드는 물리적으로 내용을 기록하기 전에
			 * 임시로 저장해서 가지고 있는 형태이므로
			 * 물리적으로 내용을 기록하기 위해 flush() 메서드를 호출해줘야함
			 * flush()를 해주면 뒤에 닫을때 순서 신경안써도 됨!
			 * 
			 */
			
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//쓸때는 닫는 순서도 중요함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

			if(fos != null)
				fos.close();
			
			if(bos != null)
				bos.close();
			
		}
	}

}
