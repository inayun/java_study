package work;

public class Work {

	public static void main(String[] args) {

		/*
		 * 
		 * �������� �ִ�.
		 * ��, ���, �������� Ű��� �ִµ�
		 * �Ϸ翡 ����Ǵ� ������ ���� ���� 5, 7, 5��,
		 * 
		 * ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���.
		 * �ð��� ��ü ������ ��� ���� ������ ���.
		 * 
		 * ��, ���� ������ ������  �� ������ ���� ������  int��,
		 * ��� ���� ������ ���� ������ float ���� �����
		 * 
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int totalFruit = pear + apple + orange;
		float averageFruit1 = totalFruit / 24f;
		float averageFruit2 = (float)totalFruit/24;
		
		//�Ҽ��� �ڿ� ���ڸ� ���� ���
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� ����: " + totalFruit);
		System.out.printf("�ð� ��� : %.2f��",averageFruit1); //���ڸ����� ���
		System.out.println();
		System.out.println("�ð��� ��ü ������ ��� ���� ����: " + averageFruit1);
		System.out.println("�ð��� ��ü ������ ��� ���� ����: " + averageFruit2);

	}

}