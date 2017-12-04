package ex4_construct;

public class Note {

	private String title;
	private int price;
	private int page;
	
	//생성자 : 메모리에 확보 가능하게 해줌
	public Note(){
		title = "일반노트";
		price = 1000;
		page = 100;
			
	}
	
	public Note(String title, int price, int page) {
		this.title = title;
		this.price = price;
		this.page = page;
	}
	
	public void noteInfo() {
		
		System.out.println("이름 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("페이지 : " + page);
	}
}
