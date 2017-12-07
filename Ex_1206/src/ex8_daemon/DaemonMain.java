package ex8_daemon;

public class DaemonMain {
	public static void main(String[] args) {

		Save save = new Save();
		Thread t = new Thread(save);
		
		//t��� �����尡 ���� ���������� ����ϴ� �޼���
		//�������� ���õ� ������� �ڽ��� ������ ���ν����尡 ����ɶ� �Բ� �����.
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i < 15; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		} // for
		System.out.println("main thread ����");
	}

}
