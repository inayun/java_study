package ex_sync;

public class SyncMain {

	public static void main(String[] args) {

		Ex_Synchronized atm = new Ex_Synchronized();
		
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		mom.start();
		son.start();
	}

}
