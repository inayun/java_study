package ex7_runnable;

//상속은 두개이상을 상속받을 수 없기때문에 스레드랑 다른거랑 같이 상속받을 수가 없음
//따라서 상속말고 'Runnable' 인터페이스를 통해 구현함
public class RunnableTest implements Runnable{
	
	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
