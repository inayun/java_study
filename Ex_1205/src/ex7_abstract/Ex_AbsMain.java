package ex7_abstract;

public class Ex_AbsMain {

	Ex_AbsChild ac = new Ex_AbsChild();
	//ac.setValue(50);
	//�θ� �ִ� �޼ҵ带 ȣ���غ��� �ҿ����..���ǰ� �ȵǾ������ϱ�

	//�߻� Ŭ������ �ν��Ͻ��� ���������� ���� �� �����Ƿ� 
	//�߻�Ŭ������ ���� ��üȭ ������ ����
	Ex_Abs p = new Ex_Abs() {
		@Override
		public void setValue(int value) {
			
		}
	};
}
