package ex4_thread;

public class ThreadSub1 extends Thread{
	//스레드를 상속받으면 반드시 오버라이드를 해줘야함
	@Override
	public void run() {
		
		for(int i =0; i < 100; i++) {
			System.out.print("1");
		}
	}

}
