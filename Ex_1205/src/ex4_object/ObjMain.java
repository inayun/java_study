package ex4_object;

public class ObjMain {
	public static void main(String[] args) {
		
		Ex_Object obj = new Ex_Object();
		obj.setValue(100); //auto_boxing : �⺻�ڷ����� ��ü�� �ٲ��ִ� ��
		//����Ÿ�� 100�� ��ü�� object�� �ٲ��ִ� ��
		
		int num = (int)obj.getValue(); //un_boxing : ��ü(Ŭ����Ÿ��)�� �⺻�ڷ������� �ٲ�°�
		
		obj.setValue("�ȳ�");
		String str = (String)obj.getValue();
		
		obj.setValue('A');
		char ch = (char)obj.getValue();
		
		/*
		 * �⺻ �ڷ�����  object�� �޴°ͺ���
		 * �׳� �����ε��ؼ� ���� �޴°� �޸� �ս� �κп��� �� ȿ������
		 * 
		 */
	}
}
