package ex3_super;

public class Child extends Parent{

	int num;
	
	//�⺻ ������
	public Child() {
		super(2); //�θ�Ŭ������ �ǹ�
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	public void setNum(int num) {
		super.num = num; //�θ�
		this.num = num; //�ڽĲ�
		num = 10; //�Ķ����
		num2 = 10; //�θ�
		// super.num �� this.num�� �ٸ�( super�� �θ𺯼���,this�� �ڽĺ����� )
	}
	
	@Override
	public int getResult(int n, int n2) {
		return -2;
	}
}
