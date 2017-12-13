package ex_network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		
		//(접속할 서버의 IP주소, 접속할 서버의 포트번호)
		try {
			//클라이언트는 생성시 서버의 ip 주소와 포트번호로 접속
			Socket s = new Socket("192.168.0.73",3000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main
}
