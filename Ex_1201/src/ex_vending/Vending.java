package ex_vending;

public class Vending {

	private Can[] can;
	private int money;
	
	//����� �ʱ�ȭ �޼���
	/*
	public void init() {
		
		can = new Can[5];

		for(int i = 0; i < can.length; i++) {
			can[i] = new Can();
		}
		
		can[0].setCanName("ȯŸ");
		can[0].setPrice(1000);
		
		can[1].setCanName("���̴�");
		can[1].setPrice(1100);
		
		can[2].setCanName("�ݶ�");
		can[2].setPrice(1200);
		
		can[3].setCanName("����");
		can[3].setPrice(1300);
		
		can[4].setCanName("�ֽĽ�");
		can[4].setPrice(1400);
		
	}
*/
	
	//������
	public Vending() {
		
		can = new Can[5];
		can[0] = new Can("ȯŸ",1000);
		can[1] = new Can("�ݶ�",1100);
		can[2] = new Can("���̴�",1200);
		can[3] = new Can("����",1300);
		can[4] = new Can("�ֽĽ�",1400);
	}	
	
	//���� �ް� ���� �� �ִ� ������� �����ֱ� ���� �޼���
	public void showCans(int money) {
		this.money = money;
		
		for( int i = 0; i < can.length; i++ ) {
			
			if( can[i].getPrice() <= money ) {
				System.out.printf("%s - %d��\n", can[i].getCanName(), can[i].getPrice());
			}
		}
	}
	
	//����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� ��ȯ 
	public int outCan(String name) {
		
		for(int i = 0; i < can.length; i++) {
			
			if(can[i].getCanName().equals(name)) {
				System.out.printf("%s��(��) �����ϼ̽��ϴ�. ",name);
				money -= can[i].getPrice();
			}
		} //for
		return money;
	}

	
	
}
