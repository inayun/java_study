package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {

		
		/*
		 * 빵을 만들었습니다.
		 * -------------------
		 * 빵을 만들었습니다.
		 * 빵을 만들었습니다.
		 * 요청하신 2개의 빵을 만들었습니다.
		 * -------------------
		 * 크림빵을 만들었습니다.
		 * 크림빵을 만들었습니다.
		 * 요청하진 2개의 크림빵을 만들었습니다.
		 */
		
		
		Bread bread = new Bread();
		bread.makeBread();
		System.out.println("--------------");
		
		bread.makeBread(2);
		System.out.println("--------------");
		
		bread.makeBread(2,"크림");
		System.out.println("--------------");
	}

}
