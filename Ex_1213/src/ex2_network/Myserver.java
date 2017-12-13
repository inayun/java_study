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
			System.out.println("���� ����");
		} catch (Exception e) {
			// TODO: handle exception
		}
	} //������
	
	
	@Override
	public void run() {
		
		InputStreamReader isr = null;
		BufferedReader reader = null;
		

		while(true) {
			
			try {
				Socket so = ss.accept();
				String ip = so.getInetAddress().getHostAddress();
				
				//Ŭ���̾�Ʈ�� ������ ���ڿ��� ��Ʈ������ ����
				
				isr = new InputStreamReader(so.getInputStream());
				reader  = new BufferedReader(isr);
				
				//�����ڰ� ���� �޼��� ����
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
