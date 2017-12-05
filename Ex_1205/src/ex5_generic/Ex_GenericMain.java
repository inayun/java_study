package ex5_generic;

public class Ex_GenericMain {
	public static void main(String[] args) {
		Ex_Generic<String> v1 = new Ex_Generic<>();
		v1.setValue("¾È³ç");
		
		Ex_Generic<Integer> v2 = new Ex_Generic<>();
		v2.setValue(100);
		int n = v2.getValue();
		
		Ex_Generic<Character> v3 = new Ex_Generic<>();
		v3.setValue('A');
		char c = v3.getValue();
		
		Ex_Generic<Double> v4 = new Ex_Generic<>();
		v4.setValue(10.5);
		
		Ex_Generic<Boolean> v5 = new Ex_Generic<>();
		v5.setValue(true);
	}


}
