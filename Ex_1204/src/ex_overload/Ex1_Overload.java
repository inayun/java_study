package ex_overload;

public class Ex1_Overload {

	/*
	 * �����ε�
	 * �޼����� '�ߺ�����'
	 * �ϳ��� Ŭ���������� '���� �̸��� ���� �޼���'��
	 * ������ ���ǵǴ� ��
	 * 
	 * '�޼����'��
	 * ��ҹ��ڸ� ����� �ݵ�� ��ġ�ؾ���
	 * 
	 * ���ڵ���
	 * ���ڸ��� ������ ������ ���� �ٸ���, ������ ���� ���ٸ�
	 * ������ �ڷ����� �ٸ���, �ٸ� �޼����� ����Ÿ���� �ٸ���
	 * ���ǵǾ���Ѵ�.
	 * ������ ������ Ÿ���� ���ٸ�, ������ ������ �޶�� �����ε����� ����
	 * ( �� -> �ڷ��� -> ���� )
	 * 
	 * �پ��� �޼������ ���� �̸����� �۾��� �� �ְ� �ȴٴ� �ǹ̷μ�
	 * ����ϸ� ȿ������ ������
	 * 
	 */
	
	public void getResult() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void getResult(int n) {
		System.out.println("���ڰ� int �� �޼���");
	}
	
	public void getResult(char c) {
		System.out.println("���ڰ� char�� �޼���");
	}
	
	public void getResult(String s) {
		System.out.println("���ڰ� String�� �޼���");
	}
	
	public void getResult(int n, char c) {
		System.out.println("����, ���ڸ� ���ڷ� �޴� �޼���");
	}
	
	public void getResult(char c, int n) {
		System.out.println("����, ������ ���ڷ� �޴� �޼���");
	
	
	
	}
	
}
