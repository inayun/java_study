package ex_file;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {

		
		String path = FilePath.PATH;
		File f = new File(path);
	
		if(f.isDirectory()) {
			
			File[] files = f.listFiles(); //������ϵ��� �Ӽ����� ���� �� (�������� ��������)
			
			for(File file : files) {
			
				if(file.isFile()) { //��������� �����ΰ��
					System.out.println("file: " + file.getName());
				} else { //��������� ������ ���
					System.out.println("directory: " +file.getName());
				}
			}
		}
	}

}
