package ex6_bank;

public class BankMain {

	public static void main(String[] args) {

		Bank b1 = new Bank("����","02-111-2222");
		Bank b2 = new Bank("����","02-333-4444");
		
		//��ü ȣ��ÿ��� �Ϲ������� 'Ŭ������'�� ���
		//����ƽ������ private���� ���� ����
		//����ƽ������ ��ü�� �������� �ʾƵ� ��밡�� (heap�� ��ġ�� �ʰ� �ٷ� static���� ��)
		//����ƽ ������ �޼���� ��ü�� �ƹ��� ���� �����ص� ���� �Ѱ��� �������
		Bank.interest = 0.5f;
		b1.info();
		b2.info();
		
	}

}
