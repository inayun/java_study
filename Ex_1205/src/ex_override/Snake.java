package ex_override;

public class Snake extends Animal{

	String tongue = "��";
	
	
	/*
	 * �޼����� '�������̵�'
	 * �޼����� '������'�� �ǹ̸� ������
	 * ��Ӱ����� ��ü���� �θ��� �޼��带 ������
	 * �ڽ� ������ �°� ������ �ϴ� ��
	 */
	
	@Override
	public int getLeg() {
		return 0;
	}
}
