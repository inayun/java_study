package ex4_construct;

public class Note {

	private String title;
	private int price;
	private int page;
	
	//������ : �޸𸮿� Ȯ�� �����ϰ� ����
	public Note(){
		title = "�Ϲݳ�Ʈ";
		price = 1000;
		page = 100;
			
	}
	
	public Note(String title, int price, int page) {
		this.title = title;
		this.price = price;
		this.page = page;
	}
	
	public void noteInfo() {
		
		System.out.println("�̸� : " + title);
		System.out.println("���� : " + price);
		System.out.println("������ : " + page);
	}
}
