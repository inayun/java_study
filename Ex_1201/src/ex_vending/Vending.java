package ex_vending;

public class Vending {

	private Can[] can;
	private int money;
	
	//음료수 초기화 메서드
	/*
	public void init() {
		
		can = new Can[5];

		for(int i = 0; i < can.length; i++) {
			can[i] = new Can();
		}
		
		can[0].setCanName("환타");
		can[0].setPrice(1000);
		
		can[1].setCanName("사이다");
		can[1].setPrice(1100);
		
		can[2].setCanName("콜라");
		can[2].setPrice(1200);
		
		can[3].setCanName("식혜");
		can[3].setPrice(1300);
		
		can[4].setCanName("핫식스");
		can[4].setPrice(1400);
		
	}
*/
	
	//생성자
	public Vending() {
		
		can = new Can[5];
		can[0] = new Can("환타",1000);
		can[1] = new Can("콜라",1100);
		can[2] = new Can("사이다",1200);
		can[3] = new Can("식혜",1300);
		can[4] = new Can("핫식스",1400);
	}	
	
	//돈을 받고 먹을 수 있는 음료수를 보여주기 위한 메서드
	public void showCans(int money) {
		this.money = money;
		
		for( int i = 0; i < can.length; i++ ) {
			
			if( can[i].getPrice() <= money ) {
				System.out.printf("%s - %d원\n", can[i].getCanName(), can[i].getPrice());
			}
		}
	}
	
	//사용자가 선택한 음료를 제공하고 잔액을 반환 
	public int outCan(String name) {
		
		for(int i = 0; i < can.length; i++) {
			
			if(can[i].getCanName().equals(name)) {
				System.out.printf("%s을(를) 선택하셨습니다. ",name);
				money -= can[i].getPrice();
			}
		} //for
		return money;
	}

	
	
}
