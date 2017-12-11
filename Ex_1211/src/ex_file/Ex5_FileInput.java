package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex5_FileInput {

	public static void main(String[] args) {

		String path = FilePath.PATH + "test.txt";
		
		File f = new File(path);
		if(f.exists()) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				//��Ʈ���� �� �̻� ���� ���� ���ٸ� -1�� ��ȯ��
				//while���� ������ ��(EOF)�� -1�� ���������� �ݺ��Ȱ�
				//read�� 1����Ʈ�� �дµ� �ѱ��� 2����Ʈ�̱� ������ ������ ����
				while((code = fis.read()) != -1) {
					
					System.out.print((char)code);
				} //while
				
				if(fis != null) { //��Ʈ���� ��������� ������! ���� �ƴϸ�!
				//��Ʈ���� ����ϰ� �� �Ŀ��� �ݾ��ִ� ���� ����
					fis.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
