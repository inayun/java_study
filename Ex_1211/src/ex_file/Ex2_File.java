package ex_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = FilePath.PATH;
		
		File f = new File(path);
		
		if(f.isDirectory()) {  // !f.isFile() 파일이 아니라면
			
			//디렉토리 안에 있는 하위 요소들의 이름을 모두 가져옴
	
			String[] names = f.list();
			for(String name : names) {
				System.out.println(name);
			}
		}
		
	}

}
