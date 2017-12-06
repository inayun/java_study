package ex5_thread_sleep;

public class ThreadSub extends Thread {

	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("sub ½º·¹µå");
		}
	}
}
