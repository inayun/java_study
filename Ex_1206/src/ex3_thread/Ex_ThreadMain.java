package ex3_thread;

public class Ex_ThreadMain {
	
	public static void main(String[] args) {
		
		Ex_Thread t = new Ex_Thread();
		//�������� run()�޼ҵ带 ���������� ���� �����ϰ� �ϴ� �޼���
		t.start(); 
		
		for(int i = 0; i< 10; i++) {
			System.out.println("���� ������ ������");
		}
		
		
		System.out.println("main ������ ����");
	}
	
}
