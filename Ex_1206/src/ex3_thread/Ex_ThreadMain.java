package ex3_thread;

public class Ex_ThreadMain {
	
	public static void main(String[] args) {
		
		Ex_Thread t = new Ex_Thread();
		//스레드의 run()메소드를 독립적으로 실행 가능하게 하는 메서드
		t.start(); 
		
		for(int i = 0; i< 10; i++) {
			System.out.println("메인 스레드 구동중");
		}
		
		
		System.out.println("main 스레드 종료");
	}
	
}
