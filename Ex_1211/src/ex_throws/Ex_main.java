package ex_throws;

import java.io.FileNotFoundException;

public class Ex_main {
public static void main(String[] args) {
	Ex_Throws t = new Ex_Throws();
	
	try {
		t.setFile();
	} catch (FileNotFoundException e) {
		System.out.println("��ξ���");
	//	e.printStackTrace();
	}
}
}
