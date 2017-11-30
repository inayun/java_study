package ex2_method;

public class ValueTestMain {

	public static void main(String[] args) {

		ValueTest v1 = new ValueTest();
		v1.test(2);
		v1.test("²ó²ó");
		
		int su = 100;
		su = v1.test2(su);
		System.out.println("main : " + su);
		String result = v1.test3(10,50);
		System.out.println(result);
	}

}
