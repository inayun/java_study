package ex6_thread;

public class ThreadSub extends Thread{
	int time = 0;
	
	public void setTime(int time) {
		this.time = time;
	}
	
	//run�� �������̵��̱� ������ �Ķ���͸� ���� �� ����!
	//setter���� ����ؾ���
	public void run() {
		for(int i = time; i > 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("����");
	}
}
