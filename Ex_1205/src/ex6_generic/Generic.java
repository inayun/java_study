package ex6_generic;

public class Generic {
	
	/*
	 * Ŭ������ ���׸�Ÿ���� ���� �ʰ�
	 * �޼��忡 ������ �ϸ�
	 * 
	 * Ŭ���� ��ü�� Ÿ�Ը��� ������ ������ �ʰ�
	 * �� Ŭ������ü�� ������
	 * �޼��� Ÿ�Ը� �ٸ��� ����� �� ����
	 * 
	 * �޸𸮳���. �ӵ��鿡�� �� ȿ����
	 */
	public <T> void printArray(T n[]) {
		
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i]+"");
		}
		System.out.println();
	}
}
