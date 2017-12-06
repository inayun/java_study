package ex6_thread;

public class ThreadSub extends Thread{
	int time = 0;
	
	public void setTime(int time) {
		this.time = time;
	}
	
	//run은 오버라이딩이기 때문에 파라미터를 받을 수 없음!
	//setter만들어서 사용해야함
	public void run() {
		for(int i = time; i > 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}
}
