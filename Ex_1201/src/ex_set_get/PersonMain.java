package ex_set_get;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(50);
		
		System.out.println("이름: " + p1.getName());
		System.out.println("나이: " + p1.getAge());
		
		System.out.println("-----------");
		p1.setInfo("김길동", 30);

	}

}
