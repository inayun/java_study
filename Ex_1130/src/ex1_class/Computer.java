package ex1_class;

public class Computer {

	/*
	 * ��ǻ�͸� �뷮���� �ϱ� ���� ���赵 �ۼ�
	 */
	
	// ����, ���, �Ӽ�
	int hdd = 200;
	int ram = 512;
	float cpu = 2.5f;
	String color = "����";
	
	//�޼��� , ���, �Լ� 
	public void getInfo() {
		System.out.println("HDD : " + hdd + "GB");
		System.out.println("RAM : " + ram + "GB");
		System.out.println("CPU : " + cpu + "GHz");
		System.out.println("COLOR : " + color);
	}
	
	/*�޼����� ����
	 * ��������  ��ȯ�� �޼���� (�Ķ����){�޼��� ���࿵��}
	 * public void getInfo() {}
	 * 
	 * ����������
	 * public : ���� ������Ʈ ���� ��� Ŭ�������� ����� �㰡
	 * private : ���� Ŭ���������� ����� �㰡
	 * protected : ��Ӱ����� ��ü�鸸 ����� �㰡
	 * default : ���� ��Ű���� Ŭ�������� ����� �㰡 (����)
	 * 
	

	 */
}
