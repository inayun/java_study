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
			
			String msg = "buf��Ʈ�� ����\r\n";
			bos.write(msg.getBytes());
			
			/*
			 * write()�޼ҵ�� ���������� ������ ����ϱ� ����
			 * �ӽ÷� �����ؼ� ������ �ִ� �����̹Ƿ�
			 * ���������� ������ ����ϱ� ���� flush() �޼��带 ȣ���������
			 * flush()�� ���ָ� �ڿ� ������ ���� �Ű�Ƚᵵ ��!
			 * 
			 */
			
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//������ �ݴ� ������ �߿���!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

			if(fos != null)
				fos.close();
			
			if(bos != null)
				bos.close();
			
		}
	}

}
