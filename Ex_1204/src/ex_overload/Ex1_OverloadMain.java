package ex_overload;

public class Ex1_OverloadMain {

	public static void main(String[] args) {
		
		Ex1_Overload ol = new Ex1_Overload();
		ol.getResult();
		ol.getResult(10);
		ol.getResult('A');
		ol.getResult("¾È³ç");
		ol.getResult(10,'A');
		ol.getResult('A',10);
	}

}
