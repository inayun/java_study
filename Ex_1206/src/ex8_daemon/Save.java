package ex8_daemon;

public class Save implements Runnable{
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("상태저장");
		}
	}

}
