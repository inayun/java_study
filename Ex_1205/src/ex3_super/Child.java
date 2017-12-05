package ex3_super;

public class Child extends Parent{

	int num;
	
	//기본 생성자
	public Child() {
		super(2); //부모클래스를 의미
		System.out.println("자식 클래스 생성자");
	}
	
	public void setNum(int num) {
		super.num = num; //부모꺼
		this.num = num; //자식꺼
		num = 10; //파라미터
		num2 = 10; //부모꺼
		// super.num 과 this.num은 다름( super은 부모변수꺼,this는 자식변수꺼 )
	}
	
	@Override
	public int getResult(int n, int n2) {
		return -2;
	}
}
