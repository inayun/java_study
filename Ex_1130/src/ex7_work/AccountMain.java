package ex7_work;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		int select = 0;
		int money = 0;
		ATM atm = new ATM();
		Scanner scanner = new Scanner(System.in);

		outer : while(true) {
			
			System.out.println("1.��     ��");
			System.out.println("2.��     ��");
			System.out.println("3.�ܾ�Ȯ��");
			System.out.println("etc. ����");
			System.out.print(">>  ");
			
			select = scanner.nextInt();
			
			switch(select) {
			
			case 1 : //�Ա�
				System.out.println("---��    �� ---");
				System.out.print("�Աݾ� : ");
				money = scanner.nextInt();
				atm.deposit(money);
				break;
				
			case 2 : //���
				System.out.println("---��    �� ---");
				System.out.print("��ݾ� : ");
				money = scanner.nextInt();
				atm.withdraw(money);
				break;
				
			case 3 : //�ܾ�Ȯ��
				System.out.println("---��    �� ---");
				System.out.println(atm.showMoney() + "��");
				break;
				
			default : //����
				System.out.println("����");
				break outer;
			}
			
			System.out.println("-----------");
		} //while
		
	}

}
