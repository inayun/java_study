package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}
	
	public void makeBread(int num) {
		
		for(int i = 0; i <num; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�.\n",num);	
			
	}

	public void makeBread(int num, String name) {
		for(int i = 0; i <num; i++) {
			System.out.printf("%s���� ��������ϴ�.\n",name);
		}
		System.out.printf("��û�Ͻ� %d���� %s���� ��������ϴ�.\n",num,name);
}
	
}
