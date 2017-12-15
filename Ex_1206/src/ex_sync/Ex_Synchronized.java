package ex_sync;

public class Ex_Synchronized implements Runnable{

	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void run() {

		//����ȭ �ʿ�!!
		/*
		 * synchronized ������ ������ �ɶ�����
		 * �ٸ� �����忡�� �������� ���ϰ� ��
		 */
		synchronized (Ex_Synchronized.this) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
					withdraw(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	} //run
	
	public void withdraw(int m) {
		//���� �������� �������� �̸��� ������
		String threadName = Thread.currentThread().getName();
		
		//�ܾ��� 0�� �̻��� �� ���
		if(getMoney() > 0) {
			money -= m;
			System.out.println(threadName + "-�ܾ�:" + money + "��");
			
		} else{
			System.out.println(threadName + "�ܾ� ����");
		}
	}
}
