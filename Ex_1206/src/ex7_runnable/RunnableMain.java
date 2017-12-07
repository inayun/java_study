package ex7_runnable;

public class RunnableMain {
	public static void main(String[] args) {

		RunnableTest r = new RunnableTest();
		//run을 start로 동작시킬 수 있어야함
		//부모 클래스 thread 객체를 생성한 후 생성자에 runnable을 넣음
		//그럼 start 사용가능
		Thread t = new Thread( r );
		t.start();
		
	}

}
