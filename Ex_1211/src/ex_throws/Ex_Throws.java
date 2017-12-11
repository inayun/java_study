package ex_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_Throws {

	//throws를 통해 예외를 위임함
	public void setFile() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("c:/java_study/t.txt");
		
	}
}
