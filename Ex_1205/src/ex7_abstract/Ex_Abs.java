package ex7_abstract;

public abstract class Ex_Abs {

	int value = 100;

	//��ü�� ���� �޼ҵ� = �߻�޼ҵ�
		//abstract Ű����� ����
		//�Ѱ��� �߻� �޼ҵ带 ������ ������ Ŭ���� �� �տ� abstract�� ����������
		//�ش� Ŭ������ '�ڽ��� ������������' ��� �� �� ����
	public int getValue() {
		return value;
	}
	
	abstract public void setValue(int value) ;
	
}
