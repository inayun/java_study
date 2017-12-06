package ex5_thread_sleep;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadSub t = new ThreadSub();
		t.start();
		
		try {
			Thread.sleep(3000); //3초동안 강제로 쉬기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 스레드 종료");
	}
}
