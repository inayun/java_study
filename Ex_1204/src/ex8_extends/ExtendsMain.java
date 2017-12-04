package ex8_extends;

public class ExtendsMain {

	public static void main(String[] args) {

		//부모가 보유한 재산의 일부를 자식이 물려받는 것
		
		
		Child c1 = new Child();
		
		System.out.println(c1.getCar());
		//자식은 부모의 재산을 마음대로 사용 가능
		System.out.println(c1.getMoney());
		
		Parent p1 = new Parent();
		//부모는 자식의 재산을 마음대로 사용 불가능
		System.out.println(p1.getStr());
		
		//Parent가 c1의 부모인가? 둘이 인스턴스가 같은가?
		if(c1 instanceof Parent) {
			System.out.println("같음");
		}
	}

}
