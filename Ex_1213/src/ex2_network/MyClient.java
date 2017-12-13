package ex2_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		
		System.out.println("���� : ");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		PrintWriter out = null;
		
		if(msg.trim().length() > 0) {
			Socket s = null;
			
			try {
				
				//������ ������ ip�� ��Ʈ��ȣ
				s = new Socket("192.168.0.73",3001);
				
				//���ڿ� msg�� ������ �����ϱ� ���� ��Ʈ��
				out = new PrintWriter(s.getOutputStream());
				
				//������ ���ڿ� ����
				out.write(msg);
				
				//��Ʈ���� ����� ������ ���
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
