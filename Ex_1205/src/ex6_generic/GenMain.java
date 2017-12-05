package ex6_generic;

public class GenMain {
	public static void main(String[] args) {
		
		Generic g1 = new Generic();
		Integer[] iArr = {1,2,3,4,5};
		Character[] cArr = {'A','B','C','D','E'};

		g1.printArray(iArr);
		g1.printArray(cArr);
		
	}
}
