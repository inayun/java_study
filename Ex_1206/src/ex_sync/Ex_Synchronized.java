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

		//동기화 필요!!
		/*
		 * synchronized 영역이 마무리 될때까지
		 * 다른 스레드에서 접근하지 못하게 됨
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
		//현재 구동중인 스레드의 이름을 가져옴
		String threadName = Thread.currentThread().getName();
		
		//잔액이 0원 이상일 때 출력
		if(getMoney() > 0) {
			money -= m;
			System.out.println(threadName + "-잔액:" + money + "원");
			
		} else{
			System.out.println(threadName + "잔액 부족");
		}
	}
}
