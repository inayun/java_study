package ex_vending;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Vending vending = new Vending();
		vending.init(); //���Ǳ� �ʱ�ȭ
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert coin : ");
		
		int money = scanner.nextInt();
		vending.showCans(money);
		
		System.out.println("----------------");
		System.out.println("���� ���� : ");
		String name = scanner.next();
		money = vending.outCan(name);
		System.out.println("�ܾ� : " + money + "��"); 
		
		
		
	}

}
