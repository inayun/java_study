package ex7_runnable;

public class RunnableMain {
	public static void main(String[] args) {

		RunnableTest r = new RunnableTest();
		//run�� start�� ���۽�ų �� �־����
		//�θ� Ŭ���� thread ��ü�� ������ �� �����ڿ� runnable�� ����
		//�׷� start ��밡��
		Thread t = new Thread( r );
		t.start();
		
	}

}
