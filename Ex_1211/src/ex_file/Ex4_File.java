package ex_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {

		String path = FilePath.PATH + "test/abc";
		
		File f = new File(path);
		
		//File Ŭ���� ��ΰ� ������ �������� �ʴ´ٸ�
		if(!f.exists()) {
			System.out.println("������ �����߽��ϴ�.");
			f.mkdirs(); //mkdir = ���� �Ѱ��� ����(���� �Ⱦ�) 
			// mkdirs = ���� ������ ����(�Ѱ��� ���������ϱ� ������ �ַ� �̰� ��)
			
		} else {
			System.out.println("������ �����մϴ�");
		}
	}

}
