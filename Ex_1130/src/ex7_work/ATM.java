package ex7_work;

public class ATM {
	private int money;
	
	
	//�Ա�
	public void deposit( int m ) {
		money += m;
		System.out.println("�Ա� ����!");
	} 
	
	//���
	public void withdraw( int m ){
		
		if(money >= m) {
			money -= m;
			System.out.println("��� ����!");
		} else {
			System.out.println("�ܾ��� �����մϴ�. ");
		}
	}
	
	//�ܾ�Ȯ��
	public int showMoney(){
		return money;
	}
}
