package ex_file;

import java.io.File;

public class Ex1_File {

	/*
	 * IO (Input, Output)
	 * IO는 입출력 스트림을 의미
	 * 스트림 = 데이터를 입출력하기 위한 방법
	 * JVM에서 콘솔로 값을 보낼때는 Output
	 * 콘솔에서 JVM으로 값을 보낼때는 Input
	 */
	
	//파일 객체 생성을 위한 경로 (슬래시 1개 or 역슬래시 2개)
	
	public static void main(String[] args) {
		String path = FilePath.PATH + "test.txt";
		//File 클래스 : 외부로 접근할 수 있는 클래스
		File f = new File(path);
		
		//file 클래스가 참조하는 경로가 파일일 경우(isFile())
		// 참조하는 경로가 폴더일 경우(isDirectory())
		if(f.isFile()) {
		System.out.println("파일의 크기 : " + f.length());
		}
		
	}
}
