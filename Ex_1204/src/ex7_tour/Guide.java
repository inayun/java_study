package ex7_tour;

public class Guide {

	static String point;
	
	Guest[] guest;
	
	public Guide(int n) {
		
		point = "�ұ���";
		guest = new Guest[n];
		for(int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
		}
	}
	
	
	
}
