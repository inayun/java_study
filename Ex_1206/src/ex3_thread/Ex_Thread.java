package ex3_thread;

public class Ex_Thread extends Thread{

	@Override
	public void run() {
		//프로세스의 독립적인 수행을 가능하게 해주는 영역
		
		for(int i = 0; i < 20; i++) {
			System.out.println("스레드 실행중...");
		}
	}

	
}
