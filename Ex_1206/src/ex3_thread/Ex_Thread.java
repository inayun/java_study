package ex3_thread;

public class Ex_Thread extends Thread{

	@Override
	public void run() {
		//���μ����� �������� ������ �����ϰ� ���ִ� ����
		
		for(int i = 0; i < 20; i++) {
			System.out.println("������ ������...");
		}
	}

	
}
