package ex_vending;
//음료수 관리
public class Can {

	private String canName;
	private int price;
	
	public Can(String canName, int price) {
		this.canName = canName;
		this.price = price;
	}
	
	public String getCanName() {
		return canName;
	}
	public int getPrice() {
		return price;
	}
	
}
