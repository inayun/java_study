package ex8_daemon;

public class DaemonMain {
	public static void main(String[] args) {

		Save save = new Save();
		Thread t = new Thread(save);
		
		//t라는 스레드가 데몬 스레드임을 명시하는 메서드
		//데몬으로 셋팅된 스레드는 자신을 생성한 메인스레드가 종료될때 함께 종료됨.
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
		System.out.println("main thread 종료");
	}

}
