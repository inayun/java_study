package ex6_bank;

public class Bank {

	private String point; //위치
	private String tel; //전화번호
	static float interest; //이자
	
	
	public Bank(String point, String tel) {
		
		interest = 0.1f;
		this.point = point;
		this.tel = tel;
	}
	
	public void info() {
		
		System.out.println("지점 :" + point);
		System.out.println("전화 :" + tel);
		System.out.println("이자 :" + interest);
		System.out.println("---------------------");
	}
}
