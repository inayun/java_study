package ex7_runnable;

//����� �ΰ��̻��� ��ӹ��� �� ���⶧���� ������� �ٸ��Ŷ� ���� ��ӹ��� ���� ����
//���� ��Ӹ��� 'Runnable' �������̽��� ���� ������
public class RunnableTest implements Runnable{
	
	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
