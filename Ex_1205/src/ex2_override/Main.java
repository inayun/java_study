package ex2_override;

public class Main {
	public static void main(String[] args) {
		
		Plus p = new Plus();
		System.out.println(p.getResult(10,10));
		
		Minus m = new Minus();
		System.out.println(m.getResult(10,10));
	}
}
