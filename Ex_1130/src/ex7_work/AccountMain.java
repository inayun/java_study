package ex7_work;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		int select = 0;
		int money = 0;
		ATM atm = new ATM();
		Scanner scanner = new Scanner(System.in);

		outer : while(true) {
			
			System.out.println("1.입     금");
			System.out.println("2.출     금");
			System.out.println("3.잔액확인");
			System.out.println("etc. 종료");
			System.out.print(">>  ");
			
			select = scanner.nextInt();
			
			switch(select) {
			
			case 1 : //입금
				System.out.println("---입    금 ---");
				System.out.print("입금액 : ");
				money = scanner.nextInt();
				atm.deposit(money);
				break;
				
			case 2 : //출금
				System.out.println("---출    금 ---");
				System.out.print("출금액 : ");
				money = scanner.nextInt();
				atm.withdraw(money);
				break;
				
			case 3 : //잔액확인
				System.out.println("---잔    액 ---");
				System.out.println(atm.showMoney() + "원");
				break;
				
			default : //종료
				System.out.println("종료");
				break outer;
			}
			
			System.out.println("-----------");
		} //while
		
	}

}
