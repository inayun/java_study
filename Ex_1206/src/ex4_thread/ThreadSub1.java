package ex4_thread;

public class ThreadSub1 extends Thread{
	//�����带 ��ӹ����� �ݵ�� �������̵带 �������
	@Override
	public void run() {
		
		for(int i =0; i < 100; i++) {
			System.out.print("1");
		}
	}

}
