package ex_network;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	//�������� = ����
	//���� = Ŭ���̾�Ʈ
	ServerSocket ss;
	
	public MyServer() {
		
		try {
			
			//���� ������ ������ �� ���񽺸� ���� ��Ʈ��ȣ�� ����
			//�̴� Ŭ���̾�Ʈ�� �����Ҷ� �ʿ�
			//���� ��Ʈ��ȣ�� ������ �� 2000�� ������ ��ȣ�� ���
			
			ss = new ServerSocket(3000); //��Ʈ��ȣ 3000
			System.out.println("���� �غ�");

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		
		
		while(true) {
			
			try {
				
				//Ŭ���̾�Ʈ
				//������ �����ڸ� �޾Ƶ���
				//ss.accept() �����ڰ� �� ������ �Ʒ��� ������ �������� �ʰ� ���
				Socket s = ss.accept(); 
				
				//Ŭ���̾�Ʈ�� ip�ּҸ� ������
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "-�� �Դٰ�");
					
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}