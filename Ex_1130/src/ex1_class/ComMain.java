package ex1_class;

public class ComMain {
	public static void main(String[] args) {

		Computer com1 = new Computer();
		com1.getInfo();
		
		System.out.println("----------------");
		
		Computer com2 = new Computer();
		com2.color = "Èò»ö";
		com2.hdd = 1000;
		com2.getInfo();
		
		
	}

}
