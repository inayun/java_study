package ex_file;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {

		
		String path = FilePath.PATH;
		File f = new File(path);
	
		if(f.isDirectory()) {
			
			File[] files = f.listFiles(); //하위목록들의 속성까지 같이 줌 (파일인지 폴더인지)
			
			for(File file : files) {
			
				if(file.isFile()) { //하위목록중 파일인경우
					System.out.println("file: " + file.getName());
				} else { //하위목록중 폴더인 경우
					System.out.println("directory: " +file.getName());
				}
			}
		}
	}

}
