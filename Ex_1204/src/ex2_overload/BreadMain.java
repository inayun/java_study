package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {

		
		/*
		 * ���� ��������ϴ�.
		 * -------------------
		 * ���� ��������ϴ�.
		 * ���� ��������ϴ�.
		 * ��û�Ͻ� 2���� ���� ��������ϴ�.
		 * -------------------
		 * ũ������ ��������ϴ�.
		 * ũ������ ��������ϴ�.
		 * ��û���� 2���� ũ������ ��������ϴ�.
		 */
		
		
		Bread bread = new Bread();
		bread.makeBread();
		System.out.println("--------------");
		
		bread.makeBread(2);
		System.out.println("--------------");
		
		bread.makeBread(2,"ũ��");
		System.out.println("--------------");
	}

}
