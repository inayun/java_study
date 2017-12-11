package ex_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {

		String path = FilePath.PATH + "test/abc";
		
		File f = new File(path);
		
		//File 클래스 경로가 실제로 존재하지 않는다면
		if(!f.exists()) {
			System.out.println("폴더를 생성했습니다.");
			f.mkdirs(); //mkdir = 폴더 한개만 생성(거의 안씀) 
			// mkdirs = 폴더 여러개 생성(한개도 생성가능하기 때문에 주로 이걸 씀)
			
		} else {
			System.out.println("폴더가 존재합니다");
		}
	}

}
