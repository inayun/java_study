package ex7_work;

public class ATM {
	private int money;
	
	
	//입금
	public void deposit( int m ) {
		money += m;
		System.out.println("입금 성공!");
	} 
	
	//출금
	public void withdraw( int m ){
		
		if(money >= m) {
			money -= m;
			System.out.println("출금 성공!");
		} else {
			System.out.println("잔액이 부족합니다. ");
		}
	}
	
	//잔액확인
	public int showMoney(){
		return money;
	}
}
