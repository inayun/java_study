package ex2_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver extends Thread{

	ServerSocket ss;
	
	public Myserver(){
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 시작");
		} catch (Exception e) {
			// TODO: handle exception
		}
	} //생성자
	
	
	@Override
	public void run() {
		
		InputStreamReader isr = null;
		BufferedReader reader = null;
		

		while(true) {
			
			try {
				Socket so = ss.accept();
				String ip = so.getInetAddress().getHostAddress();
				
				//클라이언트가 보내준 문자열을 스트림으로 받음
				
				isr = new InputStreamReader(so.getInputStream());
				reader  = new BufferedReader(isr);
				
				//접속자가 보낸 메세지 받음
				String msg = reader.readLine();
				System.out.println(ip);
				reader.close();
				isr.close();
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				
			}
		}
	}
}
