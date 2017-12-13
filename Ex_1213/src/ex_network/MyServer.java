package ex_network;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	//서버소켓 = 서버
	//소켓 = 클라이언트
	ServerSocket ss;
	
	public MyServer() {
		
		try {
			
			//서버 소켓을 생성할 때 서비스를 위한 포트번호를 지정
			//이는 클라이언트가 접속할때 필요
			//서비스 포트번호의 범위는 약 2000번 이후의 번호를 사용
			
			ss = new ServerSocket(3000); //포트번호 3000
			System.out.println("서버 준비");

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		
		
		while(true) {
			
			try {
				
				//클라이언트
				//서버가 접속자를 받아들임
				//ss.accept() 접속자가 올 때까지 아래쪽 내용을 수행하지 않고 대기
				Socket s = ss.accept(); 
				
				//클라이언트의 ip주소를 가져옴
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "-님 왔다감");
					
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}