package ex2_arralist;

import java.util.ArrayList;

public class ArrMain {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList();
		list.add("ȫ�浿");
		list.add("��浿");
		
		ArrTest at = new ArrTest();
		at.testArray(list);
		
		int num = 10;
		at.testInt(num);
		
		System.out.println("main: " + list);
		System.out.println("main(num): " + num);

	}

}
