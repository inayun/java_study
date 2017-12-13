package ex2_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		
		System.out.println("내용 : ");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		PrintWriter out = null;
		
		if(msg.trim().length() > 0) {
			Socket s = null;
			
			try {
				
				//접속할 서버의 ip와 포트번호
				s = new Socket("192.168.0.73",3001);
				
				//문자열 msg를 서버로 전송하기 위한 스트림
				out = new PrintWriter(s.getOutputStream());
				
				//서버로 문자열 전송
				out.write(msg);
				
				//스트림에 담겨진 내용을 비움
				out.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				
				if(out != null){
					out.close();
				}
				if (s != null) {
					try {
						s.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
