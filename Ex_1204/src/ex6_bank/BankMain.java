package ex6_bank;

public class BankMain {

	public static void main(String[] args) {

		Bank b1 = new Bank("강남","02-111-2222");
		Bank b2 = new Bank("역삼","02-333-4444");
		
		//객체 호출시에는 일반적으로 '클래스명'을 사용
		//스태틱변수는 private으로 하지 않음
		//스태틱변수는 객체를 생성하지 않아도 사용가능 (heap을 거치지 않고 바로 static으로 감)
		//스태틱 변수나 메서드는 객체를 아무리 많이 생성해도 오직 한개만 만들어줌
		Bank.interest = 0.5f;
		b1.info();
		b2.info();
		
	}

}
