package ex7_abstract;

public class Ex_AbsChild extends Ex_Abs{
	
	
	//�ڽ��� ������ ��� ������ �������̵� �ϰ� ���� �־����
@Override
public void setValue(int value) {
	//�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ 
	//�θ��� �߻�Ŭ������ ������ �ִ� �߻� �޼ҵ带
	//�ݵ�� '�������̵�' �ϰ� �־����
	//�ڽ��� �ݵ�� �ϼ�!!!!!!!
	super.value = value;
}

@Override
	public int getValue() {
		return super.getValue();
	}


}
