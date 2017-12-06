package ex4_thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadSub1 t1 = new ThreadSub1();
		ThreadSub2 t2 = new ThreadSub2();
		
		t1.start();
		t2.start();
	}

}
