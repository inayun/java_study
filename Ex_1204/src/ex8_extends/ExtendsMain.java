package ex8_extends;

public class ExtendsMain {

	public static void main(String[] args) {

		//�θ� ������ ����� �Ϻθ� �ڽ��� �����޴� ��
		
		
		Child c1 = new Child();
		
		System.out.println(c1.getCar());
		//�ڽ��� �θ��� ����� ������� ��� ����
		System.out.println(c1.getMoney());
		
		Parent p1 = new Parent();
		//�θ�� �ڽ��� ����� ������� ��� �Ұ���
		System.out.println(p1.getStr());
		
		//Parent�� c1�� �θ��ΰ�? ���� �ν��Ͻ��� ������?
		if(c1 instanceof Parent) {
			System.out.println("����");
		}
	}

}
