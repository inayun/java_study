package ex_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = FilePath.PATH;
		
		File f = new File(path);
		
		if(f.isDirectory()) {  // !f.isFile() ������ �ƴ϶��
			
			//���丮 �ȿ� �ִ� ���� ��ҵ��� �̸��� ��� ������
	
			String[] names = f.list();
			for(String name : names) {
				System.out.println(name);
			}
		}
		
	}

}
